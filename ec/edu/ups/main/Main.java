package ec.edu.ups.main;

import ec.edu.ups.controller.Controlador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controlador controlador = new Controlador();
		
		controlador.listarLibros();
		int valor = controlador.buscarLibro("Titulo1");
		controlador.agregarCompra(valor);
		controlador.agregarCompra(2);
		controlador.agregarCompra(8);
		controlador.agregarCompra(15);
		controlador.listarCompras();
		controlador.recargarCredito(1000);
		
		controlador.buscarLibro("Titulo1 (Digital)");
	}

}
