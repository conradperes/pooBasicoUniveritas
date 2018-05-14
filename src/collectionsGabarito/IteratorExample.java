package collectionsGabarito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class IteratorExample {
	public static void main(String[] args) {
		SortedSet frutas = new TreeSet();
		for (String fruta : Arrays.asList("mango", "apple", "banana", "banana")) {
			frutas.add(fruta);
		}
		for (Object object : frutas) {
			if(object.equals("mango"))
				frutas.remove(object);
		}
		frutas.forEach(item -> System.out.println(item));
		Iterator iterator = frutas.iterator();
		while (iterator.hasNext()) {
			String fruta = (String) iterator.next();
			System.out.println(fruta);
		}
		List l = new ArrayList();
		l.addAll(frutas);
		ListIterator listIterator = l.listIterator();
		while (listIterator.hasNext()) {
			String fruta = (String) listIterator.next();
			System.out.println(fruta);
			if(fruta.equalsIgnoreCase("banana")) {
				System.out.println(listIterator.previous());
				break;
			}
			
		}
	}
}
