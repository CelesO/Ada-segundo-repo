package practicageometria;

public abstract class Figura {

	private int numeroLados; //atributo
	
	
	public Figura() {  //constructor
		this.numeroLados = 0;
	}
	
	//metodo. la clase es abstracta
	//porque posee un metodo abstracto
	//el cual tiene cuerpo vacio
	
	public abstract float area();

}

/*si no fuera abstracto seria asi:
 * public float area() {
        return 0f;
    }
 */
 
