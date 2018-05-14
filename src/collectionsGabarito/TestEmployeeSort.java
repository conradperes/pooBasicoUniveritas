package collectionsGabarito;

import java.util.Collections;
import java.util.List;

public class TestEmployeeSort {

	public static void main(String[] args) {
		testComparable();
		testComparator();
	}

	private static void testComparator() {
		List<Employee> coll = Util.getEmployees();
		Collections.sort(coll, new EmpSortByName());
		System.out.println("\t Testando Comparator");
		printList(coll);
	}

	private static void testComparable() {
		List<Employee> coll = Util.getEmployees();
		Collections.sort(coll); // sort method
		System.out.println("\t Testando Comparable");
		printList(coll);
	}

	private static void printList(List<Employee> list) {
		System.out.println("EmpId\tName\tAge");
		for (Employee e : list) {
			System.out.println(e.getEmpId() + "\t" + e.getName() + "\t"
					+ e.getAge());
		}
	}

}
