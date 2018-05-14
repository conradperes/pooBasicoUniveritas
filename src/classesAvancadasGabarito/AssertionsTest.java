package classesAvancadasGabarito;

import java.awt.HeadlessException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AssertionsTest {

	private static final String MSG_ERR0_ASSERT = "N??mero fora do range: ";
	private static final String MSG_NUMERO_DIGITADO = "n??mero digitado %d\n";
	private static final String MSG_RANGE_NUMERO = "Digite n??mero entre 0 and 10: ";

	public static void main(String args[]) {
		//assertUsingScanner();
		assertComJoptionPane();
	} 
	private static void assertUsingScanner() {
		Scanner input = new Scanner(System.in);

		System.out.print(MSG_RANGE_NUMERO);
		int number = input.nextInt();

		assert (number >= 0 && number <= 10) : MSG_ERR0_ASSERT + number;

		System.out.printf("You entered %d\n", number);
	}

	private static void assertComJoptionPane() {
		String numero = JOptionPane.showInputDialog(null,
				MSG_RANGE_NUMERO);

		try {
			int num = new Integer(numero);
			assert (num >= 0 && num <= 10) : MSG_ERR0_ASSERT + num;

			JOptionPane.showMessageDialog(null, MSG_NUMERO_DIGITADO + num);
		} catch (NumberFormatException | HeadlessException e) {
			e.printStackTrace();
		}
	}
}

