package junitGabarito;

import javax.swing.JOptionPane;

import org.junit.Test;

import herancaGabarito.Conta;
import herancaGabarito.Transferencia;

public class TransferenciaTest {

	@Test
	public void test() {
		Transferencia transferencia= new Transferencia();
		Conta c2 = new Conta();
		Conta c1 = new Conta();
		String a = JOptionPane.showInputDialog(null, "valor a depositar");
		c1.setSaldo(7779);
		transferencia.transferir(c1,c2, new Float(a));
		assert(c2.getSaldo()>0):"transferencia n?o ocorrida com sucesso";
		
	}

}
