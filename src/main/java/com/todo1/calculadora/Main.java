package com.todo1.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		double n1;
		double n2;
		double result;
		int opc;
		Scanner sc = new Scanner(System.in);
		boolean control = true;
		System.out.println("Esta es una calculadora de consola.\n Si es decimal utiliza comas y no puntos\n\n");
		while (control) {
			System.out.println("Selecciona una opcion:\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division");
			opc = sc.nextInt();
			switch (opc) {
				case 1:
					System.out.println("Ingresa el primer numero");
					n1 = sc.nextDouble();
					System.out.println("Ingresa el segundo numero");
					n2 = sc.nextDouble();
					result = calculadora.suma(n1, n2);
					System.out.println(n1 + " + " + n2 + " = " + result);
					break;
				case 2:
					System.out.println("Ingresa el primer numero");
					n1 = sc.nextDouble();
					System.out.println("Ingresa el segundo numero");
					n2 = sc.nextDouble();
					result = calculadora.resta(n1, n2);
					System.out.println(n1 + " - " + n2 + " = " + result);
					break;
				case 3:
					System.out.println("Ingresa el primer numero");
					n1 = sc.nextDouble();
					System.out.println("Ingresa el segundo numero");
					n2 = sc.nextDouble();
					result = calculadora.multiplica(n1, n2);
					System.out.println(n1 + " * " + n2 + " = " + result);
					break;
				case 4:
					System.out.println("Ingresa el primer numero");
					n1 = sc.nextInt();
					System.out.println("Ingresa el segundo numero");
					n2 = sc.nextInt();
					result = calculadora.divide(n1, n2);
					System.out.println(n1 + " / " + n2 + " = " + result);
					break;
				default:
					System.out.println("Por favor. Selecciona una opcion correcta.");
					break;
			}
			System.out.println("Deseas realizar otra operacion?\n1.Si\n2.No");
			opc = sc.nextInt();
			if (opc == 2) {
				control = false;
				System.out.println("Gracias por usar la calculadora :)");
			}
		}
		sc.close();
	}
}