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
	
	
	

}
