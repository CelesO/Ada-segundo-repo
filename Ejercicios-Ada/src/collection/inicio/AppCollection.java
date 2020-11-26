package collection.inicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppCollection {

	public static void main(String[] args) {
		
		pruebaListas();
		pruebaSet();
		
	}

	private static void pruebaSet() {
		Set<String> conj = new HashSet<String>();
		System.out.println("size " + conj.size());
		conj.add("20-123123");
		conj.add("20-123124");
		System.out.println("size " + conj.size());
		conj.add("20-123124");
		System.out.println("size " + conj.size());
		
	}

	private static void pruebaListas() {
		List<String> lista = new ArrayList<String>();
		System.out.println("size: " + lista.size());
		lista.add("elemento1");
		lista.add("elemento2");
		System.out.println("size: " + lista.size());
		System.out.println(lista);
		lista.remove(0);
		System.out.println("size: " + lista.size());
				
	}

}
