package com.todo1.calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
	private final Calculadora calculadora = new Calculadora();

	@Test
	public void testSuma() {
		double actual = calculadora.suma(100, 35);
		double esperado = 135;
		assertEquals(esperado, actual, 0.01);
	}

	@Test
	public void testResta() {
		double actual = calculadora.resta(100, 35);
		double esperado = 65;
		assertEquals(esperado, actual, 0.01);

	}

	@Test
	public void testMulplica() {
		double actual = calculadora.multiplica(6, 5);
		double esperado = 30;
		assertEquals(esperado, actual, 0.01);
	}

	@Test
	public void testDivide() {
		double actual = calculadora.divide(55, 5);
		double esperado = 11;
		assertEquals(esperado, actual, 0.01);
	}
}