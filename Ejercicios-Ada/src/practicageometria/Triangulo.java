package practicageometria;

public class Triangulo extends FiguraGeometrica implements Perimetrable {
	
	private int cantLados = 3;

	public int getCantLados() {
		return cantLados;
	}

	public void setCantLados(int cantLados) {
		this.cantLados = cantLados;
	}
	
	@Override
	public double obtenerPerimetro() {
	
		return cantLados * getLado();
	}

}
