package ec.edu.ups.main;

import ec.edu.ups.controller.Controlador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controlador controlador = new Controlador();
		
		controlador.listarLibros();
		controlador.agregarCompra(1);
//		controlador.agregarCompra(2);
//		controlador.agregarCompra(3);
//		controlador.agregarCompra(4);
		controlador.listarCompras();
		controlador.recargarCredito(1000);
		controlador.buscarLibro("Titulo1");
		controlador.buscarLibro("Titulo1 (Digital)");
	}

}
