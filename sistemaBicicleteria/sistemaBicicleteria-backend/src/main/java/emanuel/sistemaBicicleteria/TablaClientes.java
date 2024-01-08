package emanuel.sistemaBicicleteria;

import java.util.ArrayList;
public class TablaClientes {
	private ArrayList<Cliente> arrayClientes = new ArrayList<Cliente>();


	public void alta(Cliente cliente) {
		arrayClientes.add(cliente);
		

	}

	public void actualizar(TablaClientes tablaClientes,Cliente cliente) {
		TablaClientes tablaClientes1 = tablaClientes;
		System.out.println(arrayClientes.get(1).getCantidadVentas());
		ArrayList<Cliente> arrayClientes1 = tablaClientes1.getArrayClientes();
		Cliente cliente1 = cliente;
		arrayClientes.set(arrayClientes.indexOf(cliente1), cliente1);
		System.out.println(arrayClientes.get(1).getCantidadVentas());

	}

	public ArrayList<Cliente> getArrayClientes() {
		return arrayClientes;
	}
}
