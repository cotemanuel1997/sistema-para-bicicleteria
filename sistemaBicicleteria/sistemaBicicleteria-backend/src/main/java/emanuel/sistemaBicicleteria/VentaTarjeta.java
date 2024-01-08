package emanuel.sistemaBicicleteria;

public class VentaTarjeta extends Venta {

	public VentaTarjeta(Cliente cliente, Bicicleta bicicleta, Integer cantidad, TablaClientes tablaClientes, Integer numeroTarjeta) {
		super(cliente, bicicleta, cantidad, tablaClientes);
		this.numeroTarjeta = numeroTarjeta;
		// TODO Auto-generated constructor stub
	}

	protected int numeroTarjeta;

}
