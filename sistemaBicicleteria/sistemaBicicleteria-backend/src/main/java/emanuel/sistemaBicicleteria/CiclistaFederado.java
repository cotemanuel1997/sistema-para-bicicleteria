package emanuel.sistemaBicicleteria;

import java.util.ArrayList;

public class CiclistaFederado extends Cliente {

	private String numeroMatricula;
	private Agrupacion agrupacion;
	
	private ArrayList<Venta> ventas = new ArrayList<Venta>();
	

	public CiclistaFederado(String nombre, String apellido, String nacimiento, String dni, String numeroMatricula, Agrupacion agrupacion,TablaClientes tablaClientes) {
		super(nombre, apellido, nacimiento, dni,tablaClientes);
		this.numeroMatricula= numeroMatricula;
		this.agrupacion= agrupacion;
		// TODO Auto-generated constructor stub
	}

	public Agrupacion getAgrupacion() {
		return agrupacion;
	}

	public void setAgrupacion(Agrupacion agrupacion) {
		this.agrupacion = agrupacion;
	}

	public void setVenta(Venta venta) {
		ventas.add(venta);
		cantidadVentas=ventas.size();
		
	}

	

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Integer getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(Integer cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}
	

}
