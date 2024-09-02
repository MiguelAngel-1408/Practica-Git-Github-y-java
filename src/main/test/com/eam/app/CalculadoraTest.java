package main.test.com.eam.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.eam.app.Calculadora;

class CalculadoraTest {

	Calculadora calculadora;
	
	@BeforeEach
	void antes () {
		calculadora = new Calculadora();
	}
	
	@AfterEach
	void despues() {
		System.out.println("Prueba finalizada");
	}
	
	@Test
	void testSumar() {
		int resultado = calculadora.sumar(2, 2);
		assertEquals(4, resultado);
	}
	
	@Test
	void testRestar () {
		int resultado = calculadora.restar(3, 2);
		assertEquals(1, resultado);
	}
	
	
	

}
