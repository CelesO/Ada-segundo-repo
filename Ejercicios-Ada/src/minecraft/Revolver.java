package minecraft;

public class Revolver extends Arma implements Recargable, Ejecutable {


	public int disparar(int municiones) {
		int tiros = 0;
		while (tiros <= municiones) {
			tiros++;
		}
		return tiros;
		
	}

}
