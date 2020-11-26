package periodico;

public class Publicidad extends Publicacion implements Facturable   {
	
	protected static final int VALOR_PIXEL = 100;
	protected String auspiciante;
	protected double precio;

	
	public String getAuspiciante() {
		return auspiciante;
	}

	public void setAuspiciante(String auspiciante) {
		this.auspiciante = auspiciante;
	}
	
    public double getPrecio() {
		
		return 0;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public double facturar(int alto, int ancho) {
		return alto * ancho * VALOR_PIXEL;
	}

	

}
