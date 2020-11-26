package ejercicios;

import java.util.Scanner;

public class EjercicioExpensas {
	private static final int NUM_PISOS = 4;

	public static void main(String[] args) {

		int expensas[] = new int[NUM_PISOS];

		float expensasTotal = 0;

		darBienvenida("Bienvenido al sistema de registro de consorcio");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < expensas.length; i++) {
			System.out.println("Ingrese expensas departamento " + (i + 1));
			expensas[i] = sc.nextInt();
			expensasTotal += expensas[i]; // += EQUIVALE A ESTO: expensasTotal = expensasTotal + expensas[i]
		}
		sc.close();

		float promedio = expensasTotal / NUM_PISOS;
		System.out.println("El valor promedio de expensas es " + promedio);

	}

	private static void darBienvenida(String mensajeBienvenida) {

		dibujarDivisor(mensajeBienvenida.length(), "=");
		System.out.println(mensajeBienvenida.toUpperCase());
		dibujarDivisor(mensajeBienvenida.length(), "=");
		System.out.println();
	}

	private static void dibujarDivisor(int longitud, String simbolo) {
		for (int i = 0; i < longitud; i++) {
			System.out.print(simbolo);

		}
		System.out.println();
	}


}
