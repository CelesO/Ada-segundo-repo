package expensas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//El pago de expensas se realiza del 1 al 10 de cada mes, en caso de pagar luego, 
//se suma interes por recargo del 1% diario
//Solicitar la fecha de pago y el importe
//Calcular el total a pagar
public class AppExpensas {
	
// si el dia de pago es el dia 25, debo calcular intereses del 10
//al 25 que entonces sumo 15% al total a pagar

	public static void main(String[] args) throws ParseException {
		
		// ingreso en formato string
				String diaDiez = "10-10-2020";
				String diaPago = "25-10-2020";
				
				System.out.println("Ingrese importe de expensas: ");
				Scanner sc = new Scanner(System.in);
				float importe = sc.nextFloat();

				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

				Date diaPagoDate = dateFormat.parse(diaPago);
				Date diaDiezDate = dateFormat.parse(diaDiez);

				Calendar cal1 = Calendar.getInstance();
				Calendar cal2 = Calendar.getInstance();

				cal1.setTime(diaDiezDate);
				cal2.setTime(diaPagoDate);

				long diferencia = diasDiferencia(cal1, cal2);
				System.out.println(diferencia);
				
				
				/*
				 * private static void calcularRecargo(long dif, float pago) {
				 * float interes = (dif * 0.01f);
					System.out.println("Recargo por mora = " + (interes * 100) + "%");
					float result = (pago * interes) + pago;
					System.out.println("El pago tal es " + result);
				}
				 * 
				 */
			}

			private static long diasDiferencia(Calendar calendar1, Calendar calendar2) {
				return Duration.between(calendar1.toInstant(), calendar2.toInstant()).toDays();
			}

	}


