package naipes;

public class Naipe {
	
	private NumeroCarta numero;
	private Palo palo;
	
	public Naipe(NumeroCarta nume, Palo palo) {
		setNumero(nume);
		this.setPalo(palo);
	}

	public NumeroCarta getNumero() {
		return numero;
	}

	public void setNumero(NumeroCarta numero) {
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	
	public String toString() {
		return "Naipe: " + numero + palo;
	}


}
