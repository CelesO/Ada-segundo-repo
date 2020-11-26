package aleatorios.practica.clima;

public class Medicion {
	
	private int temp;
	private int lluvia;
	
	public Medicion(int temp, int lluvia) {
		this.temp = temp;
		this.lluvia = lluvia;
	}
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getLluvia() {
		return lluvia;
	}

	public void setLluvia(int lluvia) {
		this.lluvia = lluvia;
	}
	
	public String toString() {
		return "Lluvia: " + lluvia + " - Temp: " + temp;
	}
	
	

}
