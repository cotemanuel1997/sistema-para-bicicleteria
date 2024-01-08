package emanuel.sistemaBicicleteria;
import java.time.LocalDate;
import java.time.Month;


public class Venta {
	
	
	protected Cliente cliente;
	protected Bicicleta bicicleta;
	protected Integer cantidad;
	protected Integer precio; 
	protected TablaClientes tablaClientes; 
	protected Cliente ciclistaConMasVentas;
	protected LocalDate fechaActual = LocalDate.parse("2023-04-12");
	protected LocalDate fechaDescuento = LocalDate.parse("2023-04-12");
	
	public Venta(Cliente cliente, Bicicleta bicicleta, Integer cantidad, TablaClientes tablaClientes) {
		super();
		this.cliente = cliente;
		this.bicicleta = bicicleta;
		this.cantidad = cantidad;
		this.tablaClientes = tablaClientes;
	

	}
	
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Bicicleta getBicicleta() {
		return bicicleta;
	}
	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public void calcularPrecio() {
		
		
		
		
		Month mesActual = fechaActual.getMonth();
		int diaActual = fechaActual.getDayOfMonth();
		
		Month mesDescuento = fechaDescuento.getMonth();
		int diaDescuento = fechaDescuento.getDayOfMonth();

		ciclistaConMasVentas = new Cliente(" "," "," "," ",tablaClientes);

		for (int i = 0; i<(tablaClientes.getArrayClientes()).size(); i++ ) {
			if (((tablaClientes.getArrayClientes()).get(i)).getCantidadVentas() > ciclistaConMasVentas.getCantidadVentas()){
			ciclistaConMasVentas=(tablaClientes.getArrayClientes()).get(i);
			
			} 
	
		}
		


		if ("CiclistaFederado".equals((cliente.getClass()).getSimpleName())&&cliente.equals(ciclistaConMasVentas)&&diaActual==diaDescuento&&mesActual.equals(mesDescuento)) {

			int obtenerPrecio =  cantidad*(bicicleta.getPrecioUnitario());
			precio = (int) (obtenerPrecio-(obtenerPrecio*0.15));
			
		}
		else {
			precio = cantidad*(bicicleta.getPrecioUnitario());
			
		}
	}

	public LocalDate getFechaDescuento() {
		return fechaDescuento;
	}

	public Cliente getCiclistaConMasVentas() {
		return ciclistaConMasVentas;
	}
	
	

	


	
}