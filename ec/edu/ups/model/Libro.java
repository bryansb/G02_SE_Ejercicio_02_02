package ec.edu.ups.model;

public abstract class Libro {
	private String titulo;
	private String autor;
	private int edicion;
	private double precio;
	
	public Libro(String titulo, String autor, int edicion, double precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.edicion = edicion;
		this.precio = precio;
	}
	
	public abstract double calcularGastoEnvio();
	
	public abstract double calcularComision();

	public abstract double calcularPrecioCosto();
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", edicion=" + edicion + ", precio=" + precio + "]";
	}

}
