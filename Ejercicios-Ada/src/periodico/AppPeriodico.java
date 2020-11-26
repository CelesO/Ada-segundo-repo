package periodico;

import java.util.Scanner;

//Existen publicaciones que pueden ser notas (escritas o videos) y publicidad.
//El portal puede tener 10 publicaciones online.
//Las publicidades se cobran en funcion del tamaño que ocupan en la pantalla.
//Las notas tiene autor, seccion, etc
//Descubrir las clases y atributos que necesitamos para modelar nuestro sistema
//Conocer el total facturado en la publicacion del portal.

public class AppPeriodico {
	

	public static void main(String[] args) {
		
		Object[] portal = new Object[10];
		for (int i = 0; i < 10; i++) {
			int opcion = solicitarOpcion();
			switch (opcion) {
			case 1: // Nota
				Nota nota = new Nota();
				//pedir los valores de los atributos
				nota.setAutor("autor");
				nota.setTitulo("titulo");
				portal[i] = nota;
				break;
			case 2: // Publicidad
				Publicidad pub = new Publicidad();
				pub.setAlto(300);
				pub.setAncho(200);
				pub.setAuspiciante("Fulbito");
				pub.setPrecio(3000);
				portal[i] = pub;
				break;

			default:
				break;
			}
		}
		double total = 0;
		// recorre array para obtener el total
		for (int i = 0; i < 10; i++) {
			if (portal[i] instanceof Publicidad) {
				// casting: el casteo no se recomienda
				Publicidad aux = (Publicidad) portal[i];
				total += aux.getPrecio();
			}
		}
	}

	private static int solicitarOpcion() {
		Scanner sc = new Scanner(System.in);
		return 0;

	}

}
