package ejercicios;

//hacer un recuadro con un caracter elegido

//y en linea del medio, centrado, escribir la palabra pasada por parametro
//el alto y el ancho del recuadro debe pasarse tambien por parametro

public class EjercicioPantallaMensaje {

	public static void main(String[] args) {
		int ancho = 60;
		int alto = 10;

		dibujarPantalla("mensaje", ancho, alto, '*');
	}

	private static void dibujarPantalla(String string, int ancho, int alto, char caracter) {

		int filaTexto = alto / 2;
		int espacios = ancho - string.length();
		int margen = 0;
		for (int fila = 0; fila < alto; fila++) {

			for (int i = 0; i < ancho; i++) {
				if (fila == 0 || fila == alto - 1) {
					System.out.print(caracter);

				} else {
					// filas intermedias
					int col = 0;
					if (col == 0 || col == ancho - 1) {
						System.out.print(caracter);

					} else {
						if (fila == filaTexto && col == margen) {

						} else {

						}

					}

				}
				System.out.println();
			}

		}

	}

}
