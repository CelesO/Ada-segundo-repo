package practicageometria;

public class Cuadrado extends FiguraGeometrica implements Perimetrable{

	private int cantLados;

	public int getCantLados() {
		return cantLados;
	}

	public void setCantLados(int cantLados) {
		this.cantLados = cantLados;
	}

	@Override
	public double obtenerPerimetro() {
		System.out.println("El perímetro del cuadrado es ");
		return cantLados * getLado();
	}

}

	
	
