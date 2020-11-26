package aleatorios.practica;

public class Tramite {

	private int venta;
	private int reclamo;

	public Tramite(int venta, int reclamo) {
		this.setVenta(venta);
		this.setReclamo(reclamo);
		
	}

	public int getVenta() {
		return venta;
	}

	public void setVenta(int venta) {
		this.venta = venta;
	}

	public int getReclamo() {
		return reclamo;
	}

	public void setReclamo(int reclamo) {
		this.reclamo = reclamo;
	}
	
	public String toString() {
		return "Venta: " + venta + " - Reclamo: " + reclamo;
	}
	

}
