package aleatorios.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MazoDeCartas {

	public static void main(String[] args) {
		// Metemos en una lista los n�meros del 1 al 10.
		List<Integer> numeros = new ArrayList<>(10);
		for (int i=1;i<11;i++){
		   numeros.add(i);
		}

		// Instanciamos la clase Random
		Random random = new Random();

		// Mientras queden cartas en el mazo (en la lista de numbers)
		while (numeros.size()>1){
		   // Elegimos un �ndice al azar, entre 0 y el n�mero de cartas que quedan por sacar
		   int randomIndex = random.nextInt(numeros.size());

		   // Damos la carta al jugador (sacamos el n�mero por pantalla)
		   System.out.println("N�mero aleatorio sin repetir: " + numeros.get(randomIndex));

		   // Y eliminamos la carta del mazo (la borramos de la lista)
		   numeros.remove(randomIndex);
		   System.out.println(numeros.size());
		}
	}

}
