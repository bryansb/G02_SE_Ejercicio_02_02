package ec.edu.ups.model;

public class LibroDigital extends Libro{

	public LibroDigital(String titulo, String autor, int edicion, double precio) {
		super(titulo, autor, edicion, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularGastoEnvio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularComision() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPrecioCosto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
