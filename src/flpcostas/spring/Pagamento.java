package flpcostas.spring;


public class Pagamento {

	private Conta conta;

	public Pagamento(Conta conta) {
		super();
		this.conta = conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Conta getConta() {
		return conta;
	}
}
