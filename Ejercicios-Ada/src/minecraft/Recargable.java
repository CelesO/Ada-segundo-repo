package minecraft;

public interface Recargable {
	
	
	default int recargar() {
		int municiones = 6;
		System.out.println("Disparos disponibles: " + municiones);
		return municiones;
	}
	
	int disparar(int municiones);
	
}
