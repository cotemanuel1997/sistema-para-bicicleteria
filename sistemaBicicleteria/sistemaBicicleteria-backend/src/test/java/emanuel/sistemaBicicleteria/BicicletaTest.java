package emanuel.sistemaBicicleteria;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BicicletaTest {

	@Test
	@DisplayName("dar de alta bicicletas")
	void testAlta() {
		
		TablaBicicletas tablaBicicletas = new TablaBicicletas();
		
		Bicicleta bicicleta1 = new Bicicleta ("Giant","5445","24","ruta","competicion",18,20000,tablaBicicletas);
		Bicicleta bicicleta2 = new Bicicleta ("Venzo","e211","26","mtb","sport",10,10000,tablaBicicletas);
		
		bicicleta1.alta(bicicleta1);
		bicicleta2.alta(bicicleta2);

		
		assertEquals(bicicleta1, (tablaBicicletas.getArrayBicicletas()).get(0));
		assertEquals(bicicleta2, (tablaBicicletas.getArrayBicicletas()).get(1));
		
	}
	
	@Test
	@DisplayName("asociar ventas a bicicletas y reducir sus stocks")
	void testSetVenta() {
		
		TablaBicicletas tablaBicicletas = new TablaBicicletas();
		
		Bicicleta bicicleta1 = new Bicicleta ("Giant","5445","24","ruta","competicion",18,20000,tablaBicicletas);
		Bicicleta bicicleta2 = new Bicicleta ("Venzo","e211","26","mtb","sport",10,10000,tablaBicicletas);
		
		TablaClientes tablaClientes = new TablaClientes();

		Agrupacion agrupacion1 = new Agrupacion();
		
		
		CiclistaComun clienteComun1 = new CiclistaComun ("Camila","Sosa","3/4/2000","38765664",tablaClientes);
		CiclistaFederado clienteFederado2 = new CiclistaFederado ("Juan","Diaz","23/4/1998","4032233","567",agrupacion1,tablaClientes);
		CiclistaFederado clienteFederado3 = new CiclistaFederado ("Pedro","Perez","3/4/1987","37322433","231",agrupacion1,tablaClientes);
		
		VentaCredito venta1 = new VentaCredito(clienteComun1, bicicleta2, 3, tablaClientes, 4555, LocalDate.parse("2026-04-12"));
		VentaDebito venta2 = new VentaDebito(clienteComun1, bicicleta1, 5, tablaClientes, 5544);
		VentaDebito venta3 = new VentaDebito(clienteFederado2, bicicleta1, 2, tablaClientes, 87776);
		VentaEfectivo venta4 = new VentaEfectivo(clienteFederado3, bicicleta1, 4, tablaClientes);
		VentaDebito venta5 = new VentaDebito(clienteFederado3, bicicleta2, 5, tablaClientes,556667);
		VentaCredito venta6 = new VentaCredito(clienteFederado3, bicicleta1, 5, tablaClientes, 4533, LocalDate.parse("2026-07-03"));

		bicicleta2.setVentas(venta1);
		bicicleta1.setVentas(venta2);
		bicicleta1.setVentas(venta3);
		bicicleta1.setVentas(venta4);
		bicicleta2.setVentas(venta5);
		bicicleta1.setVentas(venta6);

		assertEquals(2, bicicleta1.getStock());
		assertEquals(2, bicicleta2.getStock());
		
	}
	

}
