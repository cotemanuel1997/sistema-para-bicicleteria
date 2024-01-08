package emanuel.sistemaBicicleteria;

public class Envio {
	
	private CiclistaComun ciclistaComun;
	private String direccion;
	private Venta venta;
	public Envio(CiclistaComun ciclistaComun, String direccion, Venta venta) {
		super();
		this.ciclistaComun = ciclistaComun;
		this.direccion = direccion;
		this.venta = venta;
	}


}
