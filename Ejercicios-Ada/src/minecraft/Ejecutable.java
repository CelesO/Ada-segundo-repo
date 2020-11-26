package minecraft;

public interface Ejecutable {
	
	
	default void ejecutar(String objetivo) {
		
		System.out.println("Ejecutando <arma> en objetivo: " + objetivo);
		
	}

}
