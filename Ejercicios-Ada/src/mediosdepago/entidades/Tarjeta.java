package mediosdepago.entidades;

public class Tarjeta extends MedioDePago {
	
	private String numero; // 09090 9808 9877 9879
	private String vencimiento;
	private String titular;
	private String codigoSeguridad;
	private float recargoPorCiento;
	private float importeRecargo;

	public Tarjeta(float importe, String moneda, String numero) {
		super(importe, moneda);
		this.numero = numero;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validar() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getVencimiento() {
		// TODO Auto-generated method stub
		return null;
	}

}
