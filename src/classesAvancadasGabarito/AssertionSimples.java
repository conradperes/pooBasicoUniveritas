package classesAvancadasGabarito;

import javax.swing.JOptionPane;

public class AssertionSimples {
	private static final String MSG_FAVOR_DIGITE_NUM = "favor digitar um numero";
	static int x = 0;

	public static void main(String[] args) {
		String numero = assertDigitacao();
		if (validateNumber(numero)) {
			x = new Integer(numero);
			try {
				assertX(x);
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}
	}

	private static String assertDigitacao() {
		String numero = JOptionPane.showInputDialog(null, "Digite um valor para x");
		assert (validateNumber(numero)) : MSG_FAVOR_DIGITE_NUM;
		return numero;
	}

	private static void assertX(Integer i) throws AssertionError {
		assert (i < 0) : "I " + i;
		System.out.println("Se a afirmacao acima for negativa o programa continua seu fluxo normal"
				+ "porém se x for negativo ou 0 uma Excecao AssertionError é disparada ! " + "O valor de X é \t" + i);
	}

	public static boolean validateNumber(Object number) {
		if (number == null || number.toString().trim().length() == 0)
			return false;
		else
			return true;
	}

}
