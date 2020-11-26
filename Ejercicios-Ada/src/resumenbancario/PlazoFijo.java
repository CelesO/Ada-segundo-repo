package resumenbancario;

public class PlazoFijo extends ProductoBancario implements Precancelable{

	public void cancelar(String motivo) {
		System.out.println("Cancecla plazo fijo por el mmitvo: " + motivo);
		
		//al implementar tengo que decirle el cuerpo del metodo
		
	}

}
