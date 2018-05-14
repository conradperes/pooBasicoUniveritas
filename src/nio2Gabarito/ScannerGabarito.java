package nio2Gabarito;

import java.util.Scanner;

public class ScannerGabarito {

	public static void main(String[] args) {

		try {
			leTeclado();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void leTeclado() throws Exception {
		String s;
		Scanner scan = new Scanner(System.in);
		System.out.println("Unix: Digite ctrl-d ou ctrl-c para sair"
				+ "\n windows ctrl-c para sair");
		while (scan.hasNext()) {
			s = scan.next();
			System.out.println("Lendo=" + s);
		}
	}

}
