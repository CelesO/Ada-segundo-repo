package periodico;

public abstract class Publicacion {
	
	protected int ancho;
	protected int alto;
	protected int ubicacion;

	
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
}
