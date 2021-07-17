package com.todo1.calculadora;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
	private final Calculadora calculadora = new Calculadora();

	@Test
	public void testSuma() {
		double actual = calculadora.suma(100, 35);
		double esperado = 135;
		assertEquals (esperado,actual, 0.01);
		
	}
 
	@Test
	public void testResta() {
		double actual = Calculadora.resta(100, 35);
		double esperado = 65;
		assertEquals (esperado,actual, 0.01);
		
	}
	
	@Test
	public void testMulplica() {
		double actual = Calculadora.multiplica(100, 35);
		double esperado = 3500;
		assertEquals (esperado,actual, 0.01);
		
	}
	
	@Test
	public void testDivide() {
		double actual = Calculadora.divide(75, 5);
		double esperado = 15;
		assertEquals (esperado,actual, 0.01);
		
	}
}
