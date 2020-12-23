package ec.edu.ups.model;

import java.util.Date;

public class Compra {
	private Libro libro;
	private Date fechaCompra;
	
	public Compra() {
	}
	
	public Compra(Libro libro, Date fechaCompra) {
		super();
		this.libro = libro;
		this.fechaCompra = fechaCompra;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
}
