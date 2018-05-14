package collectionsGabarito;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> qe = new LinkedList<String>();
		for (String fruta : Arrays.asList("b", "a", "c", "e", "d")) {
			qe.add(fruta);
		}
		Iterator<String> it = qe.iterator();
		System.out.println("Tamanho inicial do Queue :" + qe.size());
		while (it.hasNext()) {
			String iteratorValue = (String) it.next();
			System.out.println("Pr??ximo Value do queue :" + iteratorValue);
		}
		// pega o valor do primeiro elemento mas nao remove do queue
		System.out.println("Queue peek :" + qe.peek());
		System.out.println("Tamanho da fila depois do peek :" + qe.size());
		// pega o priemiro valor e remove o objeto do queue
		System.out.println("Queue poll :" + qe.poll());
		System.out.println("tamanho fina do  Queue :" + qe.size());
	}
}
