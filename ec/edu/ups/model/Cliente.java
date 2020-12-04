package ec.edu.ups.model;

import java.util.List;

public class Cliente {
	private double Creditos;
	private List<Compra> compra;
	
	public Cliente() {
	}
	
	public double getCreditos() {
		return Creditos;
	}
	
	public void setCreditos(double creditos) {
		Creditos = creditos;
	}
	
	public List<Compra> getCompra() {
		return compra;
	}
	
	public void setCompra(List<Compra> compra) {
		this.compra = compra;
	}
	
}
