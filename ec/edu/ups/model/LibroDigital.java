package ec.edu.ups.model;

public class LibroDigital extends Libro{

	public LibroDigital() {
	}

	@Override
	public double calcularGastoEnvio() {
		return 0;
	}

	@Override
	public double calcularComision() {
		double valor = getPrecio() * 0.2;
		return valor;
	}

	@Override
	public double calcularPrecioCosto() {
		return getPrecio();
	}

}
