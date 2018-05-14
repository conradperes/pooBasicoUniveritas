package herancaGabarito;

public class Conta {

	public Conta() {
	}

	protected float saldo;

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	protected void saque(float s) {
		saldo -= s;
	}

	public float getSaldo() {
		return saldo;
	}

}
