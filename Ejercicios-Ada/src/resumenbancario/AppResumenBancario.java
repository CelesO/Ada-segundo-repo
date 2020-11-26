package resumenbancario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//El resumen bancario del cliente tiene los ultimos 5 movimientos de su cuenta.
//Los movimientos tienen fecha, importe y pueden ser retiros o depositos
//Se pide ingresar los movimientos y luego listarlos ordenados de menor a mayor
//entre las fechas dadas o bien todos los movimientos

/*
 * le pedimos al usuario que ingrese los cuatro movimientos
 * los parametros son importe y fecha y tipo
 * armamos un vector con esa info y luego ordenamos con ord. burbuja
 * lo cual requiere un for
 * segun las fechas
 * para hacer ese ordenamiento necesitamos un aux, que es la cajita donde vamos
 * poniendo las cosas
 */

public class AppResumenBancario {

	private static final int CANT_MOV = 4;

	public static void main(String[] args) throws ParseException {
		
		System.out.println("Resumen bancario");
		
		Scanner scan = new Scanner(System.in);
		Movimiento[] movimientos = new Movimiento[CANT_MOV];
		
		for (int i = 0; i < CANT_MOV; i++) {
			
			Date fecha = solicitarFecha();
			float importe = solicitarImporte();
			
			System.out.println("Tipo de movimiento (1) Retiro (2) Deposito: ");
			int opcion = scan.nextInt();
			if (opcion == 1) {
				Retiro retiro = new Retiro(importe, fecha);
				movimientos[i] = retiro;		
			} else {
				Deposito deposito = new Deposito(importe, fecha);
				movimientos[i] = deposito;
			}
			
			System.out.println();	
		}

		imprimirDetalle(movimientos);		

	}
	
	private static void imprimirDetalle(Movimiento[] movimientos) {
		//ordenar fechas de mayor a menor
		Movimiento aux = null;
		for (int i = 0; i < movimientos.length - 1; i++) {
			for (int j = 0; j < movimientos.length - i - 1; j++) {
				// Para ordenar de mayor a menor usar after
				if (movimientos[j + 1].getFecha().before(movimientos[j].getFecha())){
					aux = movimientos[j + 1];
					movimientos[j + 1] = movimientos[j];
					movimientos[j] = aux;
				}
				
			}
			
		}
		// Imprimir
				System.out.println();
				System.out.println("Detalle de movimientos por fecha");
				for (int i = 0; i < CANT_MOV; i++) {
					System.out.println(movimientos[i]);
				}
		
	}
	

	private static float solicitarImporte() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese importe del mov: ");
		return scan.nextFloat();
	}


	private static Date solicitarFecha() throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese fecha del mov (formato ddMMyyyy): ");
		String fechaIngresada = scan.next();
//las fechas ingresadas por user siempre son strings y 
//debemos convertirlas a Date. Puede llevar mas de un paso
//por eso lo de throws Parse Exception
		
		SimpleDateFormat simpledate = new SimpleDateFormat("ddMMyyyy");
		return simpledate.parse(fechaIngresada);
	}

}
