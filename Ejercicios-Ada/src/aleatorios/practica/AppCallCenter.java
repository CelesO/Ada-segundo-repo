package aleatorios.practica;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import aleatorios.practica.clima.Medicion;

//se desea conocer para cada uno de los dias del mes, la cantidad de ventas y de reclamos
//por dia que realizaron al call center en el mes
//Listar la informacion generada

//Usar random y list

public class AppCallCenter {
	

	public static void main(String[] args) {
		List<Tramite> tramites = new ArrayList<Tramite>();
		Random randomVenta = new Random();
		Random randomReclamo = new Random();

		Tramite tramite;
		for (int i = 0; i < 30; i++) {
			int venta = randomVenta.nextInt(30);
			int reclamo = randomReclamo.nextInt(30);
			
			tramite = new Tramite(venta, reclamo);
			tramites.add(tramite);
		}
		
		for(Tramite itemTramite : tramites)
		System.out.println(itemTramite);

}

}