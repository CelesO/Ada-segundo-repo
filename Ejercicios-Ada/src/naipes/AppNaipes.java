package naipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
 * Generar la baraja de naipes ingleses (52)
 * 
 *  y repartir naipes a 2 jugadores  en 
 * forma desordenada.
 * Ver que naipe le toco a cada jugador. Una carta a cada jugador
 * El juego es blackjack
 */

public class AppNaipes {

	public static void main(String[] args) {
		
		List<Naipe> mazo = new ArrayList<Naipe>();
		
		for (Palo palo : Palo.values()) {
			for (NumeroCarta num : NumeroCarta.values()) {
				mazo.add(new Naipe(num, palo));
			}
		}
		
		//Collections.shuffle(mazo);
		
		List<Naipe> mazo2 = new ArrayList<Naipe>();
		Random random = new Random();
		
		System.out.println(mazo);
		while (!mazo.isEmpty()) {
			int aleatorio = random.nextInt(mazo.size());
			Naipe naipe = mazo.remove(aleatorio);
			mazo2.add(naipe);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println(mazo2);
		System.out.println("Ingrese cantidad de jugadores: ");
		int jugadores = sc.nextInt();
		Map<String, List<Naipe>> mesa = new HashMap<String, List<Naipe>>();
		int i = 1;
		List<Naipe> cartasJugador;
		do {
			cartasJugador = new ArrayList<Naipe>();

			int opcion = 0;
			System.out.println("Jugador: " + i);

			do {
				// repartir carta a jugador
				Naipe naipeJugador = mazo2.remove(0);

				// agregar carta a lista de cartas de jugador
				cartasJugador.add(naipeJugador);

				System.out.println(naipeJugador);

				System.out.println("Desea otra carta (1:Si 2:No)");
				opcion = sc.nextInt();
			} while (opcion == 1);

			mesa.put("Jugador" + i, cartasJugador);

			jugadores--;
			i++;
		} while (jugadores > 0);
		
		//repartir al segundo jugador
		//sumar los puntos de cada jugador (switch --> asociar valores a enums)
	//	String ganador = "";
	//	int puntajeGanador = 0;
		
	//	int puntaje = 0;
		
		
		
		
	}
	
}
		
