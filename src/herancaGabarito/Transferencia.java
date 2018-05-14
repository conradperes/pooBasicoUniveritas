package herancaGabarito;

public class Transferencia {

	public void transferir(Conta c1, Conta c2, float valor) {
		c1.saque(valor);
		c2.saldo += valor;
		
	}

}
