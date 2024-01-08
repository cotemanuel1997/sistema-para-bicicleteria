package emanuel.sistemaBicicleteria;

import java.util.ArrayList;

public class Bicicleta {
	
	private String marca;
	private String modelo;
	private String rodado;
	private String tipo;
	private String especialidad;
	private Integer stock;
	private Integer precioUnitario;
	private ArrayList<Venta> ventas= new ArrayList<Venta>();
	private TablaBicicletas tablaBicicleta;
	
	
	
	
	public Integer getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Integer precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Bicicleta(String marca, String modelo, String rodado, String tipo, String especialidad, Integer stock, Integer precioUnitario, TablaBicicletas tablaBicicleta) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.rodado = rodado;
		this.tipo = tipo;
		this.especialidad = especialidad;
		this.stock = stock;
		this.precioUnitario = precioUnitario;
		this.tablaBicicleta = tablaBicicleta;
		
	
			
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getRodado() {
		return rodado;
	}
	public void setRodado(String rodado) {
		this.rodado = rodado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(Venta venta) {
		ventas.add(venta);
		int cantidad = venta.getCantidad();
		stock = stock - cantidad;
		
	}
	public void alta(Bicicleta bicicleta) {
		
		System.out.println("s");
		tablaBicicleta.alta(bicicleta);
		
	}
	
}
