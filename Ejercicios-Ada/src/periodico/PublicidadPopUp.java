package periodico;

public class PublicidadPopUp extends Publicidad implements Facturable {
	
	private int tiempo;

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	@Override
	public double facturar(int alto, int ancho) {
		return alto * ancho * VALOR_PIXEL * 2;
	}

}
