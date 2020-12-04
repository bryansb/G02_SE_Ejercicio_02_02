package ec.edu.ups.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ec.edu.ups.model.Cliente;
import ec.edu.ups.model.Compra;
import ec.edu.ups.model.Libro;
import ec.edu.ups.model.LibroDigital;
import ec.edu.ups.model.LibroImpreso;

public class Controlador {
	private Cliente cliente;
	private List<Libro> libros;
	
	private double credito;
	private List<Compra> compras;
	
	public Controlador() {
		this.libros = new ArrayList<Libro>();
		this.libros = crearLibros();
		this.cliente = new Cliente();
		this.cliente.setCreditos(5000);
 		this.credito = cliente.getCreditos();
		this.compras = new ArrayList<Compra>();
		this.cliente.setCompra(compras);

	}

	public double recargarCredito(double ingreso) {
		System.out.println("--------Creditos--------\n"
				+ "Credito inicial: " + credito + "$");
		credito = credito + ingreso;
		System.out.println("Se acredito la cantidad de: " + ingreso + "$\n"
				+ "Total de creditos actuales: " + credito + "$");
		return credito;
	}
	
	public double consultaSaldo() {
		return credito;
	}
	
	public boolean debitarCredito(double importe) {
		
		if (credito >= importe) {
			System.out.println("--------Debitar--------\n"
					+ "Saldo actual: " + credito + "$\n"
					+ "Se debita de su cuenta la cantidad de: " + importe + "$");
			credito = credito - importe;
			System.out.println("Saldo actual: " + credito + "$");
			return true;
		}else {
			return false;
		}
		
	}
	
	public void agregarCompra(int index) {
		Libro libro = libros.get(index);
		double precio =  libro.calcularPrecioCosto();
		if (debitarCredito(precio)) {
			
			Compra compra = new Compra();
			compra.setFechaCompra(new Date());
			compra.setLibro(libro);
			this.compras.add(compra);
			System.out.println("--------Detalle de la Compra---------\n"
					+ "Se realizo la compra del libro " + libro.getTitulo() + "\n"
					+ "Fecha de compra: " + compra.getFechaCompra() + "\n"
					+ "Precio del libro: " + libro.getPrecio() + "\n"
					+ "Precio de comision: " + libro.calcularComision() + "\n"
					+ "Precio de envio: " + libro.calcularGastoEnvio() + "\n"
					+ "Precio final total: " + libro.calcularPrecioCosto()
					);
		}else {
			System.out.println("Su cuenta no tiene credito suficiente. !Credito actual: " + credito + "$");
		}
		
	}
	
	public void listarCompras() {
		List<Compra> compras = this.compras;
		if (compras.size() == 0) {
			System.out.println("--------No existen compras--------");
		}else {
			for (int i = 0; i < compras.size(); i++) {
				System.out.println(
						"--------Compra #:" + (i+1) + "--------\n"
						+ "Fecha de compra: " + compras.get(i).getFechaCompra() + " \n"
						+ "Titulo del libro: " + compras.get(i).getLibro().getTitulo() + " \n"
						+ "Autor: " + compras.get(i).getLibro().getAutor() + " \n"
						+ "Edicio: " + compras.get(i).getLibro().getEdicion() + " \n"
						+ "Precio: " + compras.get(i).getLibro().calcularPrecioCosto() 
						);
			}
		}
	}
	
	public List<Libro> crearLibros() {
		int precio;
		for (int i = 1; i < 11; i++) {
			precio = (int)(Math.random()*200 + 100);
			Libro libroD = new LibroDigital();
			libroD.setTitulo("Titulo" + i + "(Digital)");
			libroD.setAutor("Autor" + i);
			libroD.setEdicion(1);
			libroD.setPrecio(precio);
			Libro libroI = new LibroImpreso();
			libroI.setTitulo("Titulo" + i);
			libroI.setAutor("Autor" + i);
			libroI.setEdicion(1);
			libroI.setPrecio(precio);	
			libros.add(libroD);
			libros.add(libroI);
		}
		return libros;
	}

	public void listarLibros() {
		System.out.println("--------LIBROS--------");
		for (int i = 0; i < libros.size(); i++) {
			System.out.println("Libro #: " + i + "\n"
					+ "Titulo del libro: " + libros.get(i).getTitulo() + " \n"
					+ "Autor: " + libros.get(i).getAutor() + " \n"
					+ "Edicio: " + libros.get(i).getEdicion() + " \n"
					+ "Precio: " + libros.get(i).getPrecio() + " \n"
					+ "---------------------------------------------"
					);
		}
	}

	public int buscarLibro(String titulo) {
		int index = -1;
		for (int i = 0; i < libros.size(); i++) {
			if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				index = i;
				System.out.println(""
						+ "Libro #: " + i + "\n"
						+ "Titulo del libro: " + libros.get(i).getTitulo() + " \n"
						+ "Autor: " + libros.get(i).getAutor() + " \n"
						+ "Edicio: " + libros.get(i).getEdicion() + " \n"
						+ "Precio: " + libros.get(i).getPrecio() + " \n"
						+ "------------------------------------------"
						);
				return i;
			}
		}
		System.out.println(""
				+ "No se encuentra el Libro: " + titulo); 
		return index;
	}
	
}
