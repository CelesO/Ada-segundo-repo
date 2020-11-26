package aleatorios.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MazoDeCartas {

	public static void main(String[] args) {
		// Metemos en una lista los números del 1 al 10.
		List<Integer> numeros = new ArrayList<>(10);
		for (int i=1;i<11;i++){
		   numeros.add(i);
		}

		// Instanciamos la clase Random
		Random random = new Random();

		// Mientras queden cartas en el mazo (en la lista de numbers)
		while (numeros.size()>1){
		   // Elegimos un índice al azar, entre 0 y el número de cartas que quedan por sacar
		   int randomIndex = random.nextInt(numeros.size());

		   // Damos la carta al jugador (sacamos el número por pantalla)
		   System.out.println("Número aleatorio sin repetir: " + numeros.get(randomIndex));

		   // Y eliminamos la carta del mazo (la borramos de la lista)
		   numeros.remove(randomIndex);
		   System.out.println(numeros.size());
		}
	}

}
