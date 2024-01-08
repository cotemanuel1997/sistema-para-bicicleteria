package emanuel.sistemaBicicleteria;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VentaTest {
	public Venta venta1;
	public Venta venta2;
	public Venta venta3;
	public Venta venta4;
	public Venta venta5;
	public Venta venta6;
	public CiclistaComun clienteComun1;
	public CiclistaFederado clienteFederado2;
	public CiclistaFederado clienteFederado3;
	public TablaClientes tablaClientes;
	public Bicicleta bicicleta1;
	@BeforeEach
	public void setUp() {
		TablaBicicletas tablaBicicleta = new TablaBicicletas();
		Bicicleta bicicleta1 = new Bicicleta ("Giant","5445","24","triatlon","competicion",18,20000,tablaBicicleta);
		Bicicleta bicicleta2 = new Bicicleta ("Venzo","e42","26","ruta","comun",18,30000,tablaBicicleta);
		TablaClientes tablaClientes = new TablaClientes();
		Agrupacion agrupacion1 = new Agrupacion();
		Profesor profesor1 = new Profesor();
		Profesor profesor2 = new Profesor();

		agrupacion1.setActividad("Triatlon");
		agrupacion1.setActividad("Ciclismo");
		agrupacion1.setProfesor(profesor1);
		agrupacion1.setProfesor(profesor2);

		CiclistaComun clienteComun1 = new CiclistaComun ("Camila","Sosa","3/4/2000","38765664",tablaClientes);
		CiclistaFederado clienteFederado2 = new CiclistaFederado ("Juan","Diaz","23/4/1998","4032233","567",agrupacion1,tablaClientes);
		CiclistaFederado clienteFederado3 = new CiclistaFederado ("Pedro","Perez","3/4/1987","37322433","231",agrupacion1,tablaClientes);
		TablaVentas tablaVentas = new TablaVentas();
		

		clienteComun1.alta(clienteComun1);
		clienteFederado2.alta(clienteFederado2);
		clienteFederado3.alta(clienteFederado3);
		
		venta1 = new VentaCredito(clienteComun1, bicicleta2, 3, tablaClientes, 4555, LocalDate.parse("2026-04-12"));	
		venta1.calcularPrecio();
		
		venta2 = new VentaDebito(clienteComun1, bicicleta1, 5, tablaClientes, 5544);
		venta2.calcularPrecio();	
		Envio envio = new Envio(clienteComun1,"Mitre 655 Avellaneda",venta2);
		
		venta3 = new VentaDebito(clienteFederado2, bicicleta1, 2, tablaClientes, 87776);
		clienteFederado2.setVenta(venta3);
		tablaClientes.actualizar(tablaClientes,clienteFederado2);	
		venta3.calcularPrecio();
		
		venta4 = new VentaEfectivo(clienteFederado3, bicicleta1, 4, tablaClientes);
		clienteFederado3.setVenta(venta4);
		tablaClientes.actualizar(tablaClientes,clienteFederado3);
		venta4.calcularPrecio();
		
		venta5 = new VentaDebito(clienteFederado3, bicicleta2, 5, tablaClientes,556667);		
		clienteFederado3.setVenta(venta5);
		tablaClientes.actualizar(tablaClientes,clienteFederado3);
		venta5.calcularPrecio();
		
		venta6 = new VentaCredito(clienteFederado3, bicicleta1, 5, tablaClientes, 4533, LocalDate.parse("2026-07-03"));	
		clienteFederado3.setVenta(venta6);
		tablaClientes.actualizar(tablaClientes,clienteFederado3);
		
		venta6.calcularPrecio();
		
	}

	
	@Test
	@DisplayName("calcular precio total de la venta sin descuentos")
	public void testCalcularPrecio() {
		
		assertEquals(90000, venta1.getPrecio());
	}
	
	@Test
	@DisplayName("calcular precio total de la venta aplicando descuento del 25% si es en efectivo y la bicicleta es de competicion")
	public void testCalcularPrecioConDescuento25() {
		

		assertEquals(80000-(80000*0.25), venta4.getPrecio(),0.001);
		assertEquals("competicion", (venta4.getBicicleta()).getEspecialidad());
		
	}
	
	@Test
	@DisplayName("calcular precio total de la venta aplicando descuento del 15% a ciclista federado con mas ventas cada año")
	public void testCalcularPrecioConDescuento15() {
		

		assertEquals(100000-(100000*0.15), venta6.getPrecio(),0.001);
		assertEquals("Pedro", (venta6.getCiclistaConMasVentas()).getNombre());
		assertEquals("CiclistaFederado", (((venta6.getCiclistaConMasVentas()).getClass())).getSimpleName());
		assertEquals(LocalDate.parse("2023-04-12"),venta6.getFechaDescuento());
		
	}
	


}
