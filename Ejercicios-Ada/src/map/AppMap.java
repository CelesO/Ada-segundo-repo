package map;

import java.util.HashMap;
import java.util.Map;

import mediosdepago.entidades.Tarjeta;

public class AppMap {

	public static void main(String[] args) {
		
		Map<Integer, Tarjeta> mapaTarjetas = new HashMap<Integer, Tarjeta>();
		Tarjeta tarjetaX = new Tarjeta(3000, "ARS", "000001");
		Tarjeta tarjetaY = new Tarjeta(4000, "ARS", "000002");
		Tarjeta tarjetaZ = new Tarjeta(5000, "ARS", "000003");
		mapaTarjetas.put(22222, tarjetaX);
		mapaTarjetas.put(33333, tarjetaY);
		mapaTarjetas.put(44444, tarjetaZ);
		
		System.out.println(mapaTarjetas.get(55555));
		
		System.out.println(mapaTarjetas.get(33333));


	}

}
