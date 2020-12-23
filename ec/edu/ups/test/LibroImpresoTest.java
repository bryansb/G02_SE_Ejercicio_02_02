package ec.edu.ups.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ec.edu.ups.model.Libro;
import ec.edu.ups.model.LibroImpreso;

class LibroImpresoTest {
	
	private Libro libroImpreso;
	
	@BeforeEach
	void setUp() throws Exception {

		this.libroImpreso = new LibroImpreso();
		libroImpreso.setTitulo("Titulo " + 2);
		libroImpreso.setAutor("Autor " + 2);
		libroImpreso.setEdicion(2);
		libroImpreso.setPrecio(0.0);	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Tag("Precio Impreso")
	void calcularPrecioFinal() {
		this.libroImpreso.setPrecio(50.0);
		double precioEsperado = 71.0;
		double precioObtendio = (this.libroImpreso.calcularPrecioFinal());
		assertEquals(precioEsperado, precioObtendio);
	}
}
