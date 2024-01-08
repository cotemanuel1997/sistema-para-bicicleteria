package emanuel.sistemaBicicleteria;

import java.time.LocalDate;

public class VentaCredito extends VentaTarjeta{

	public VentaCredito(Cliente cliente, Bicicleta bicicleta, Integer cantidad, TablaClientes tablaClientes,
			Integer numeroTarjeta, LocalDate fechaVencimiento) {
		super(cliente, bicicleta, cantidad, tablaClientes, numeroTarjeta);
		this.fechaVencimiento = fechaVencimiento;
		// TODO Auto-generated constructor stub
	}

	protected LocalDate fechaVencimiento;
	

}
