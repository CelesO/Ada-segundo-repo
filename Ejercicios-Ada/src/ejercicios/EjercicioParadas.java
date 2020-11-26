package ejercicios;

import java.util.Scanner;

/*
 * Algoritmo de Karina trayecto_ciudades Definir paradas Como Entero 
 * Mostrar '*********************BIENVENIDA*************************' Mostrar 'Ingrese la ciudad de partida' 
Leer partida Mostrar 'Ingrese la ciudad de destino' Leer destino 
Mostrar 'Ingrese cantidad de ciudades (paradas) por las que pasará en su trayecto' 
Leer paradas Definir kilometros Como Real 
Definir trayecto Como Entero promedio_km = 0 min_km = -1 paradas_cercanas = 0 
Para i <- 0 hasta paradas-1 con paso 1 Hacer 
Mostrar 'Ingrese kilómetros que realizará en el trayecto ' i+1 Leer kilometros 
promedio_km = promedio_km + kilometros Si min_km == -1 o kilometros < min_km 
Entonces paradas_cercanas = i + 1 min_km = kilometros 
Fin Si FinPara 
Mostrar 'Los km promedio entre las ciudades que pasará para llegar de ', partida , ' a ', destino, ' es ', promedio_km / paradas, ' km.' 
Mostrar 'Las paradas más cercanas son las del trayecto ', paradas_cercanas 
FinAlgoritmo 
 */

public class EjercicioParadas {

	public static void main(String[] args) {
		System.out.println("Bienvenido");
		System.out.println("========");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese cantidad de estaciones intermedias: ");
		int totalEstaciones = sc.nextInt();

		// vector de distancias de trayectos:
		System.out.println();

		int ciudades[] = new int[totalEstaciones];
		int acumulador = 0;

		// itero tantas veces como paradas y pido la distancia entre cada una:
		// int i puede definirse fuera del for
		// lo del medio del parentesis del for es la condicion de corte

		for (int i = 0; i < ciudades.length; i++) {
			System.out.println("Ingrese km estacion " + (i + 1) + ": ");
			ciudades[i] = sc.nextInt();
			// acumulador = acumulador + ciudades[i];
			acumulador += ciudades[i];
		}

		sc.close();
		System.out
				.println("La distancia promedio en kilometros entre las ciudades es " + (acumulador / totalEstaciones));
		// lo que viene ahora es de regalo

		System.out.println("*");

		// para j desde 0 hasta totalEstaciones con paso 1

		for (int j = 0; j < totalEstaciones; j++) {

			dibujarTrayecto(ciudades[j]);

		}

	}

	/**
	 * Dibuja el trayecto de una ciudad a otra.
	 */
	private static void dibujarTrayecto(int distancia) {
		// por cada estacion(bucle)imprimo la cantidad de lineas segun km
		// No esta exouesto al mundo esxterior xq esta fuera del main
		// es como entrar a una habitacion oscura. le tengo que volver a dar el datp
		// quiere hacer mas ordenado el codigo: el main queda mas chico y eso hace el
		// algoritmo mas manejable
		for (int i = 0; i < distancia; i++) {
			System.out.print("-");

		}

		// y luego un asterisco (*)
		System.out.print("*");

	}
}
