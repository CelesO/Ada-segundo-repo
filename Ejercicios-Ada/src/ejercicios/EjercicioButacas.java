package ejercicios;

import java.util.Scanner;

public class EjercicioButacas {

		private static final int TOTAL_ASIENTOS = 50;

		public static void main(String[] args) {

			// validar el ingreso del numero de butaca
			// implementar metodos privados

			int butacas[] = new int[TOTAL_ASIENTOS];

			for (int i = 0; i < TOTAL_ASIENTOS; i++) {
				butacas[i] = 0;
			}

			mostrarMensajeBienvenida();

			System.out.println("Ingrese numero de asiento");

			Scanner sc = new Scanner(System.in);
			int solicitudAsiento = sc.nextInt();

			while (solicitudAsiento != 99) {

				// probamos switch
				// solicitudAsiento 0-9 -> informar costo 100
				// solicitudAsiento 10-19 -> informar costo 80
				// solicitudAsiento 20-29 -> informar costo 60
				// solicitudAsiento 30-39 -> informar costo 40
				// solicitudAsiento 40-49 -> informar costo 20
				// le mete eso xq solicitudAsiento es entero, la division da Entero, o sea sera
				// alguno de los casos del switch.
				// el switch evalua enteros o strings

				switch (solicitudAsiento / 10) {
				case 0:
					System.out.println("El costo es $100");
					break;
				case 1:
					System.out.println("El costo es $80");
					break;
				case 2:
					System.out.println("El costo es $60");
					break;
				case 3:
					System.out.println("El costo es $40");
					break;
				case 4:
					System.out.println("El costo es $20");
					break;
				default:
					System.out.println("Numero invalido");
					break;
				}

				while (solicitudAsiento < 0 || solicitudAsiento > 49) {
					System.out.println("Numero de butaca invalido, por favor ingrese otro asiento");
					solicitudAsiento = sc.nextInt();
				}
				System.out.println("Butaca " + solicitudAsiento + "= " + butacas[solicitudAsiento]);
				if (butacas[solicitudAsiento] == 0) {
					butacas[solicitudAsiento] = 1;
					System.out.println("Venta confirmada");
				} else {
					System.out.println("Butaca ya vendida. Seleccione otra ubicacion");
				}

				System.out.println("Ingrese numero de asiento");
				solicitudAsiento = sc.nextInt();

			}

			sc.close();
			int contador = 0;
			System.out.println("Mostrar butacas vendidas");

			for (int i = 0; i < butacas.length; i++) {
				if (butacas[i] == 1) {
					System.out.println("Butaca " + i);
					contador++;
				}
			}

			System.out.println("Butacas vendidas: " + contador);
			dibujarButacas(butacas);

		}

		private static void mostrarMensajeBienvenida() {
			System.out.println("Bienvenido");
			System.out.println("********");
		}

		private static void dibujarButacas(int[] butacas) {
			// (int[] butacas) es para darle datos al metodo privado, y tambien tengo que
			// indicarle el tipo de dato
			// por ejemplo en este caso es un vector de enteros

			for (int i = 0; i < butacas.length; i++) {
				if (butacas[i] == 0) {
					System.out.print(" _ ");
				} else {
					System.out.print(" X ");
				}
				// esto queda asi para que le den las cuentas
				if ((i + 1) % 10 == 0) {
					System.out.println();
				}
			}

		}

	}



