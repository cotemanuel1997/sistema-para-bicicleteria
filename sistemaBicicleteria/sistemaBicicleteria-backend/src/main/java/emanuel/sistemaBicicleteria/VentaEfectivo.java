package emanuel.sistemaBicicleteria;

public class VentaEfectivo extends Venta {

	public VentaEfectivo(Cliente cliente, Bicicleta bicicleta, Integer cantidad, TablaClientes tablaClientes) {
		super(cliente, bicicleta, cantidad, tablaClientes);
		// TODO Auto-generated constructor stub
	}
	
	public void calcularPrecio() {

		
		if ((this.getBicicleta().getEspecialidad()).equals("competicion")) {
	
			int obtenerPrecio =  this.getCantidad()*(this.getBicicleta().getPrecioUnitario());
			this.precio = (int) (obtenerPrecio-(obtenerPrecio*0.25));
			
		}
		else {
			this.precio = this.getCantidad()*(this.getBicicleta().getPrecioUnitario());
			
		}
	}
	

}
