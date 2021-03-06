package resumenbancario;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Deposito extends Movimiento{

	public Deposito(float importe, Date fecha) {
		super(importe, fecha);
	}
	
	@Override
	public String toString() {
		SimpleDateFormat simpledate = new SimpleDateFormat("dd-MM-yyyy");
		return "Mov fecha: " + simpledate.format(fecha) + " importe: " + importe;
	}
	

}
