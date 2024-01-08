package emanuel.sistemaBicicleteria;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String nacimiento;
	private String dni;
	protected Integer cantidadVentas=0;
	protected TablaClientes tablaClientes;
	
	
	
	public Cliente(String nombre, String apellido, String nacimiento, String dni, TablaClientes tablaClientes) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.dni = dni;
		this.tablaClientes = tablaClientes;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Integer getCantidadVentas() {
		return cantidadVentas;
	}
	public void alta(Cliente cliente) {
		
		tablaClientes.alta(cliente);
		
	}

	
}
