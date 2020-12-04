package ec.edu.ups.model;

public class LibroImpreso extends Libro{

	public LibroImpreso() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularGastoEnvio() {
		// TODO Auto-generated method stub
		return 20;
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
