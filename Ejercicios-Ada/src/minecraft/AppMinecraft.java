package minecraft;

//Tenemos diferentes tipos de armas (cuchillo, revolver, arco ). Tenemos 
//la interfaz Recargable con dos metodos: recargar(int cantidad) disparar()
//implementar esos metodos en las clases correspondientes

//Crear una segunda interfaz Ejecutable con el metodo ejecutar con un parametro (String objetivo)
//System.out.println("Ejecutando <arma> en objetivo: " + objetivo)

public class AppMinecraft {

	public static void main(String[] args) {
		
		ArcoyFlecha arc = new ArcoyFlecha();
		arc.ejecutar("zombie");
	
	}

}
