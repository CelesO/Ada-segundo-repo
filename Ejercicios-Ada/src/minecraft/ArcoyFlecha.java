package minecraft;

public class ArcoyFlecha extends Arma implements Recargable, Ejecutable {

	private int municionesdisponibles;
	
	@Override
	public int recargar() {
		int municiones = 10;
		System.out.println("Flechas disponibles: " + municiones);
		return municiones;
	}

	@Override
	public int disparar(int municiones) {
		
		return (municionesdisponibles - municiones);
		
	}

	
}
