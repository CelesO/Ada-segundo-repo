package map;

import java.util.HashMap;
import java.util.Map;

public class AppContarPalabras {
	
	// Buscar en internet un texto (parrafo)
	// Investigar metod split en String (java api String en google)
	// metodo split de String separa un string en un array de string dado un caracter
	// Guardamos en una variable el texto seleccionado, lo separamos mediante el metod split
	// en un array de palabras
	// Generar un mapa que contenga la palabra y la cantidad de veces que se repitio esa palabra
	// en el texto

	// Opcional: obtener la palabra de mayor repeticion

	public static void main(String[] args) {
		
		String texto = "El género Bougainvillea, conocido con los nombres comunes de \r\n"
				+ " trinitaria (Cuba, Panamá, Puerto Rico, República Dominicana y Venezuela),\r\n"
				+ " veranera (El Salvador, Nicaragua, Costa Rica, Panamá y Colombia) \r\n"
				+ "y brisa y santa Rita (Argentina, Bolivia, Paraguay y Uruguay), \r\n"
				+ "es un género de flores de la familia Nyctaginaceae";
		String [] arrayTexto = texto.split(",");
		for (int i = 0; i < arrayTexto.length; i++) {
			System.out.println(arrayTexto[i]);
		}
		System.out.println(arrayTexto.length);
		
		String string1 = new String();
		
		Map<Integer, String> fragmentos = new HashMap<Integer, String>();
		 fragmentos.put(1, "El género Bougainvillea");
		 fragmentos.put(2, "conocido con los nombres comunes de trinitaria (Cuba");
		 fragmentos.put(3, "Panamá");
		 fragmentos.put(4, "Puerto Rico");
		 fragmentos.put(5, "República Dominicana y Venezuela)");
		 fragmentos.put(6, "veranera (El Salvador");
		 fragmentos.put(7, "Nicaragua");
		 fragmentos.put(8, "Costa Rica");

		
	}
	
	

}
