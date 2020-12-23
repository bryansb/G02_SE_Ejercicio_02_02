package ec.edu.ups.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import ec.edu.ups.model.Libro;
import ec.edu.ups.model.LibroDigital;

class LibroDigitalTest {

	private Libro libroDigital;
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.libroDigital = new LibroDigital();
		libroDigital.setTitulo("Titulo " + 1 + " (Digital)");
		libroDigital.setAutor("Autor " + 1);
		libroDigital.setEdicion(1);
		libroDigital.setPrecio(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	@Tag("Precio Digital")
	void calcularPrecioFinal() {
		this.libroDigital.setPrecio(50.0);
		double precioEsperado = 51.0;
		double precioObtendio = (this.libroDigital.calcularPrecioFinal());
		assertEquals(precioEsperado, precioObtendio);
	}


}
