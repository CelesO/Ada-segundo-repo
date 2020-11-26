package ejercicios;

import java.util.Scanner;

public class EjercicioDirecTv {

/*
 * Una empresa de comunicaciones ofrece servicio de telefonía, banda ancha y tv digital. 
 * Cada uno de los servicios tiene un precio diferente (Telefonía: 10, Banda ancha: 15, TV, 20). 
 * Se desea contar cuántos clientes optan por cada servicio para luego conocer 
 * la facturación de cada uno de los servicios. 
 * Se deben ingresar los clientes por número (cliente = 0 para finalizar) 
 */

	private static final int TODOS_SERVICIOS = 3;
	private static final int COSTO_1 = 200;
	private static final int COSTO_2 = 300;
	private static final int COSTO_3 = 400;

	// servicios es un vector con tres lugares, cada uno corresponde a un servicio
	// y cada valor es el numero de clientes que tiene ese servicio
	// luego, si hago cada valor de i * el costo correspondiente, tengo la
	// facturacion de cada uno de los servicios
	// el numero de clientes no es exacto, asi que para llenar el vector tendre
	// que usar un while del que saldre con 0, entonces ese vector debe estar dentro
	// del while

	public static void main(String[] args) {
		int servicios[] = inicializarServicios();

		System.out.println("Bienvenido al sistema de carga");
		System.out.println("Ingrese numero de cliente. 0 para terminar");

		Scanner sc = new Scanner(System.in);
		int numeroCliente = sc.nextInt();
		while (numeroCliente != 0) {
			if (numeroCliente > 0) {
				System.out.println("Ingrese servicio a facturar: 1 para telefonia; 2 para banda ancha; 3 para cable");
				int tipo_servicio = sc.nextInt();
				if (tipo_servicio > 0 && tipo_servicio < 4) {
					servicios[tipo_servicio - 1] = servicios[tipo_servicio - 1] + 1; // acumulador

				} else {
					System.out.println("Nro de servicio incorrecto.1 para telefonia; 2 para banda ancha; 3 para cable");
				}
			} else {
				System.out.println("Nro de cliente incorrecto");
			}
			System.out.println("Ingrese numero de cliente. 0 para terminar");
			numeroCliente = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < TODOS_SERVICIOS; i++) {
			System.out.println("La cantidad de clientes de " + (i + 1) + " es " + servicios[i]);
		}
		System.out.println("El total recaudado por el servicio de telefonia (1) es " + (servicios[0] * COSTO_1));
		System.out.println("El total recaudado por el servicio de internet (2) es " + (servicios[1] * COSTO_2));
		System.out.println("El total recaudado por el servicio de TV cable (3) es " + (servicios[2] * COSTO_3));

	}

	private static int[] inicializarServicios() {
		int servicios[] = new int[TODOS_SERVICIOS];
		for (int i = 0; i < TODOS_SERVICIOS; i++) {
			servicios[i] = 0;
		}

		return servicios;
	}
	}



	

