package collectionsGabarito;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {
	public static void main(String[] args) {
		Deque<String> dequelist = new ArrayDeque<String>();
		dequelist.add("equity");
		dequelist.add("equity1");
		dequelist.add("equity2");
		dequelist.addFirst("Derivative");
		dequelist.addLast("commondities");
		System.out.println(" " + dequelist);
		dequelist.remove("equity");
		dequelist.removeFirst();
		dequelist.removeLast();
		System.out.println(" " + dequelist);
		// using iterator for deque
		Iterator backwardsIterator = dequelist.descendingIterator(); //itera????o de elementos na ordem reversa
		while (backwardsIterator.hasNext()) {
			System.out.println("ordem reversa " + (String) backwardsIterator.next());
		}
		// foreach no deque
		for (String element : dequelist) {
			System.out.print("\n ordem correta "+element);
		}
	}

}
