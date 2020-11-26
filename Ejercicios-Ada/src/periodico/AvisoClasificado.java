package periodico;

public class AvisoClasificado extends Publicacion implements Facturable {

	private static final int VALOR_CLASIFICADO = 10;

	@Override
	public double facturar(int alto, int ancho) {
		return ancho * alto * VALOR_CLASIFICADO;
	}

}
