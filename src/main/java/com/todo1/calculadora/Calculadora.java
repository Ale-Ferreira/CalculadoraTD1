package com.todo1.calculadora;
import java.util.Scanner;


public class Calculadora {


		public static double suma (double n1, double n2) {
			return n1+n2;
			}
			public static double resta (double n1, double n2) {
			return n1-n2;
			}
			public static double multiplica (double n1, double n2) {
			return n1*n2;
			}
			public static double divide (double n1, double n2) {
			return n1/n2;
			}

			public static void main(String[] args) {
			double n1, n2, result;
			int opc;
			Scanner sc = new Scanner(System.in);
			boolean control = true;
			System.out.println("Esta es una calculadora de consola.\n Si es decimal utiliza comas y no puntos\n\n");
			while (control) {
			System.out.println("Selecciona una opción:\n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
			System.out.println("Ingresa el primer número");
			n1 = sc.nextDouble();
			System.out.println("Ingresa el segundo número");
			n2 = sc.nextDouble();
			result = suma(n1,n2);
			System.out.println(n1+" + "+n2+" = "+result);
			break;
			case 2:
			System.out.println("Ingresa el primer número");
			n1 = sc.nextDouble();
			System.out.println("Ingresa el segundo número");
			n2 = sc.nextDouble();
			result = resta(n1,n2);
			System.out.println(n1+" - "+n2+" = "+result);
			break;
			case 3:
			System.out.println("Ingresa el primer número");
			n1 = sc.nextDouble();
			System.out.println("Ingresa el segundo número");
			n2 = sc.nextDouble();
			result = multiplica(n1,n2);
			System.out.println(n1+" * "+n2+" = "+result);
			break;
			case 4:
			System.out.println("Ingresa el primer número");
			n1 = sc.nextInt();
			System.out.println("Ingresa el segundo número");
			n2 = sc.nextInt();
			result = divide(n1,n2);
			System.out.println(n1+" / "+n2+" = "+result);
			break;
			case 5:
			System.out.println("Gracias por usar la calculadora :)");
			control = false;
			break;
			default:
			System.out.println("Por favor. Selecciona una opción correcta.");
			break;
			}
			System.out.println("¿Deseas realizar otra operación?\n1.Si\n2.No");
			opc = sc.nextInt();
			if (opc==2) {
			control=false;
			System.out.println("Gracias por usar la calculadora :)");
			}
			}
			sc.close();
			}
			
	}


