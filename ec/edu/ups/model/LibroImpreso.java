package ec.edu.ups.model;

public class LibroImpreso extends Libro{

	public LibroImpreso() {
	}

	@Override
	public double calcularGastoEnvio() {
		return 20;
	}

	@Override
	public double calcularComision() {
		double valor = getPrecio() * 0.02;
		return valor;
	}

	@Override
	public double calcularPrecioCosto() {
		return getPrecio();
	}

}
