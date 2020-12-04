package ec.edu.ups.main;

import java.util.Scanner;

import ec.edu.ups.controller.Controlador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		Controlador controlador = new Controlador();
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------- APLICACION VENTA DE LIBROS ---------");
		do {
			System.out.println("\n----------------------------------------------");
			System.out.println("              *****Menu*****                 |");
			System.out.println("1. Listar todos los libros disponibles       |");
			System.out.println("2. Buscar un libro especifico                |");
			System.out.println("3. Consulta de Saldo                         |");
			System.out.println("4. Recargo de Saldo                          |");
			System.out.println("5. Realizar una compra                       |");
			System.out.println("6. Lista de compras realizadas               |");
			System.out.println("7. Salir                                     |");
			System.out.println("----------------------------------------------");
			System.out.print("Por favor ingrese la opcion deseada Ejemplo(1): ");
			opcion = teclado.nextInt();
			switch (opcion) {
				case 1:
					System.out.println();
					System.out.println("\n----Lista de libros----\n");
					controlador.listarLibros();
				break;
				case 2: 
					System.out.println("\n----Buscar un libro----\n");
					System.out.print("Por favor ingrese el nombre del libro: ");
					String titulo = teclado.next();
					System.out.println();
					controlador.buscarLibro(titulo);
				break;
				case 3:
					System.out.println("\n----Consulta de Saldo----\n");
					double saldo = controlador.consultaSaldo();
					System.out.println("Su saldo es de: "+saldo);
				break;
				case 4:
					System.out.println();
					System.out.println("\n----Recargo de Saldo----\n");
					System.out.println("Por favor ingrese el valor de la recarga: ");
					Double recargo = teclado.nextDouble();
					controlador.recargarCredito(recargo);
				break;
				case 5:
					System.out.println();
					System.out.println("\n----Realizar Compra----\n");
					System.out.println("Por favor ingrese el nombre del libro que desea comprar: ");
					String titulo2 = teclado.next();
					int valor = controlador.buscarLibro(titulo2);
					controlador.agregarCompra(valor);
				break;
				case 6:
					System.out.println("\n----Lista de compras realizadas----\n");
					controlador.listarCompras();
				break; 
				case 7:
					System.out.println();
					System.out.println("Gracias por usar la aplicacion :)");
					break;
			}
		}while(opcion != 7);
		/*
		controlador.agregarCompra(valor);
		controlador.agregarCompra(2);
		controlador.agregarCompra(8);
		controlador.agregarCompra(15);
		*/
	}

}
