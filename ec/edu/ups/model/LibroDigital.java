package ec.edu.ups.model;

public class LibroDigital extends Libro{

	public LibroDigital() {
	}

	@Override
	public double calcularGastoEnvio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularComision() {
		// TODO Auto-generated method stub
		double valor = getPrecio() * 0.2;
		return valor;
	}

	@Override
	public double calcularPrecioCosto() {
		// TODO Auto-generated method stub
		double valor = getPrecio() + calcularComision() + calcularGastoEnvio();
		return valor;
	}

}
