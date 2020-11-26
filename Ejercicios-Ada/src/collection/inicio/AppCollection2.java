package collection.inicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AppCollection2 {
	
	//generar una lista y agregar valores. ejecutar add, size y remove
	//generar un conjunto y agregar valores. ejecutar add, size y remove

	public static void main(String[] args) {
		
		List<String> asistentes = new ArrayList<String>();
		asistentes.add("Victoria");
		asistentes.add("Nerina");
		asistentes.add("Flor");
		System.out.println(asistentes);
		System.out.println("size: " + asistentes.size());
		asistentes.remove(2);
		System.out.println(asistentes);
		System.out.println("new size: " + asistentes.size());
		
		Set<String> ciudades = new HashSet<String>();
		ciudades.add("Buenos Aires");
		ciudades.add("Azul");
		ciudades.add("Bahía Blanca");
		ciudades.add("Viedma");
		ciudades.add("Viedma");
		System.out.println(ciudades);
		System.out.println("size: " + ciudades.size());
		ciudades.remove("Bahía Blanca");
		System.out.println(ciudades);
		System.out.println("size: " + ciudades.size());
		
		System.out.println("Comienzo bucle...");
        for (int i = 0; i < asistentes.size(); i++) {
            String item = asistentes.get(i);
            System.out.println(item);
        }

        System.out.println("for sin indice...");
        for (String pos : asistentes) {
            System.out.println(pos);
        }

        System.out.println("function lambda (arrow function)...");
        asistentes.forEach(x -> {
            System.out.println(x);
        });
        
        Iterator<String> it = ciudades.iterator();
        while (it.hasNext()) {
           System.out.println(it.next());
        }
        
        System.out.println("Iterator...");
        Iterator<String> it1 = ciudades.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println("Foreach...");
        ciudades.forEach(elem -> System.out.println(elem));


		

		

		
		
		
		
		

	}

}
