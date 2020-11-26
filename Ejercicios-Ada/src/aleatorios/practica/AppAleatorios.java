package aleatorios.practica;

import java.util.Random;

public class AppAleatorios {

	public static void main(String[] args) {
		
		Random numero1 = new Random();
		int valorDado = numero1.nextInt(6) + 1; 
		//nextInt(int n) devuelve un valor entre 0 y n, excluido n
		System.out.println("El primer número es " + valorDado);

	}

}
