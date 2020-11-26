package collection.inicio;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class AppComparator {

	private static final Comparator<? super String> MiComparator = null;

	public static void main(String[] args) {
		
		MiComparator miComparator = new MiComparator();
		Set<String> set = new TreeSet<String>(MiComparator);
		set.add("primerStr");
		set.add("segundoStr");
		
		ComparadorTarjeta comparadorTarjeta = new ComparadorTarjeta();
		

		

	}

}
