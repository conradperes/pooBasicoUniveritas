package herancaGabarito;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class UsandoPolimorfismoOperacao {
	public static void main(String[] args) {
		Operacoes operacao = null;
		String opcao = JOptionPane.showInputDialog("Digite Operação Desejada:\n" + "1-Fatorial\n" + "2-Divisão");
		String fator = JOptionPane.showInputDialog("Digite fator ou divisor da operação");
		String num = JOptionPane.showInputDialog("Digite numero a realizar a operação");
		boolean operacaoValida = true;
		if (opcao.equals("1")) {
			operacao = new Fatorial();
		} else if (opcao.equals("2")) {
			operacao = new Divisao();
		} else {
			operacaoValida = false;
			JOptionPane.showMessageDialog(null, "Operação Desconhecida");
		}
		if (operacaoValida) {
			BigDecimal resultadoOperacao = operacao.calculo(new Double(fator), new BigDecimal(num));
			System.out.println("Resultado operação=" + resultadoOperacao.toString());
		}
	}

}
