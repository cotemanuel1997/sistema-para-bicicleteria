package emanuel.sistemaBicicleteria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	@DisplayName("dar de alta clientes")
	void testAlta() {
		TablaClientes tablaClientes = new TablaClientes();
		CiclistaComun clienteComun1 = new CiclistaComun ("Camila","Sosa","3/4/2000","38765664",tablaClientes);
		Agrupacion agrupacion1 = new Agrupacion();
		CiclistaFederado clienteFederado2 = new CiclistaFederado ("Juan","Diaz","23/4/1998","4032233","567",agrupacion1,tablaClientes);

		clienteComun1.alta(clienteComun1);
		clienteFederado2.alta(clienteFederado2);

		
		assertEquals(clienteComun1, (tablaClientes.getArrayClientes()).get(0));
		assertEquals(clienteFederado2, (tablaClientes.getArrayClientes()).get(1));
	}

}
