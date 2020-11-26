package ejercicios;

import java.util.Scanner;

//Se tiene una linea de 4 cajas donde se cobran facturas que luego seran cargadas // en el sistema. 
//Se solicitara el numero de caja y el importe cobrado. La carga finaliza con importe cero. 
//Informar la cantidad de facturas cobradas por cada caja y el promedio de todas las //facturas 

//Definir CANT_CAJAS Como Entero CANT_CAJAS=4 Dimensión cajas[CANT_CAJAS] 
// vector de posiciones igual a mi cant de cajas definir cajas como entero Para i<-0 hasta CANT_CAJAS-1 con paso 1 Hacer cajas[i]=0 FinPara 
//definir total_facturas Como Real//Sumatoria de todas las facturas / total de facturas // (acumulador) total_facturas=0 
// inicializo en cero Definir caja Como Entero Definir importe Como Real Mostrar "Bienvenida/o!" Mostrar "-------" 
//Mostrar "Ingrese importe de la factura. 0 para terminar" Leer importe Mientras importe >0 
// Ingresa importe de facturas hasta que ingresa el numero 0 - corte. Mostrar "Ingrese número de caja" Leer caja Si caja <= 
//Leer caja Si caja <= CANT_CAJAS & caja >=1 Mostrar "Ingrese importe de la factura. 
//Para finalizar, ingrese 0" total_facturas = total_facturas + importe cajas[caja-1]=cajas[caja-1]+1 
// para mi vector cajas, en la posicion del numero de caja que ingrese SiNo Mostrar "Número de caja inexistente" FinSi 
//Mostrar "Ingrese importe de la factura. Para finalizar, ingrese 0" Leer importe FinMientras definir cantidad_facturas 
//Como Entero cantidad_facturas=0 Mostrar "Cantidad de facturas por caja: " Mostrar "____________________" 
//Para i<-0 hasta CANT_CAJAS-1 con paso 1 hacer Mostrar "Caja", (i+1) ":" cajas[i] cantidad_facturas = cantidad_facturas + cajas[i] 
//FinPara Mostrar 'Promedio: ' total_facturas/cantidad_facturas FinAlgoritmo 

public class EjercicioCajas {

	private static final int CANT_CAJAS = 4;

	public static void main(String[] args) {

		int cajas[] = new int[CANT_CAJAS];
		cajas[0] = 123;

		int totalCajas = 0;

		System.out.println("Ingrese importe ");
		Scanner sc = new Scanner(System.in);

		double importe = sc.nextDouble();

		while (importe > 0) {
			System.out.println("Ingrese caja ");
			Scanner sc1 = new Scanner(System.in);
			int caja = sc1.nextInt();

		}
		;

		for (int i = 0; i < CANT_CAJAS - 1; i++) {

		}

	}

}
