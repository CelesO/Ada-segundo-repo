package practicageometria;

public class Circulo extends FiguraGeometrica implements Perimetrable{

	@Override
	public double obtenerPerimetro() {
		System.out.println("Calcular perimetro circulo");
		return getLado() * Math.PI * 2;
	}
	
}


