package mediosdepago;

import java.util.Scanner;

import mediosdepago.entidades.Cheque;
import mediosdepago.entidades.Efectivo;
import mediosdepago.entidades.Tarjeta;

public class AppMediosdePago {
	public static void main(String[] args) {

		float totales[] = new float[3];
		System.out.println("Welcome to Medios de pago App");
		System.out.println();

		float importe = solicitarImporte();

		int medio;
		String numero;
		while (importe != 0) {
			medio = solicitarMedioDePago();
			String moneda = solicitarMoneda();
			switch (medio) {
			case 1:
				Efectivo efectivo = new Efectivo(importe, moneda);
				totales[0] += efectivo.getImporte();
				break;
			case 2:
				numero = solicitarTexto("Numero de tarjeta");
				Tarjeta tarjeta = new Tarjeta(importe, moneda, numero);
				totales[1] += tarjeta.getImporte();
				break;
			case 3:
				numero = solicitarTexto("Numero de cheque");
				Cheque cheque = new Cheque(importe, moneda, numero);
				totales[2] += cheque.getImporte();

			}

			importe = solicitarImporte();
		}

	}

	private static String solicitarTexto(String mensaje) {
		System.out.println("Ingrese " + mensaje);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	private static String solicitarNumeroTarjeta() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String solicitarMoneda() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int solicitarMedioDePago() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static float solicitarImporte() {
		// TODO Auto-generated method stub
		return 0;
	}

}
