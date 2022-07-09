package contas_bancarias.bento;

public class Conta {

	private String cliente;
	private double saldo = 0;
	private final int NUMCONTA;

	public Conta(int numConta, String cliente, double saldoConta) {
		this.cliente = cliente;
		if (saldoConta >= 0) {
			this.saldo = saldoConta;
		} else {
			this.saldo = 0;
		}
		this.NUMCONTA = numConta;
	}

	public Conta(int numConta, String cliente) {
		this.cliente = cliente;
		this.NUMCONTA = numConta;
	}

	public Conta(int numConta, double valor) {
		this.NUMCONTA = numConta;
		if (valor > 0) {
			this.saldo = valor;
		}
	}

	public Conta(int numConta) {
		this.NUMCONTA = numConta;
	}

	public String getCliente() {
		return this.cliente;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumDaConta() {
		return this.NUMCONTA;
	}

	// m�todos
	void depositar(int nConta, double valor) {
		if (this.NUMCONTA == nConta) {
			this.saldo += (valor > 0) ? valor : 0;
		} else {
			System.out.println("Conta inv�lida.");
		}
	}

	void sacar(int nConta, double valor) {
		if (this.NUMCONTA == nConta) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
			} else {
				System.out.println("Saldo insuficiente: ");
			}
		} else {
			System.out.println("Conta inv�lida.");
		}
	}
	
void sacar(double valor) {
	if (this.saldo > 0) {
		this.saldo -= valor;
	}		
}

void depositar(double valor) {
	this.saldo += valor;
}

	void transferir(Conta contaDestino, double valor) {
		if (valor > 0) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}

	

	public String toString() {
		return String.format("%s %d %n%s%s %n%s%.2f", "N� Conta: ", getNumDaConta(), "Cliente: ", getCliente(),
				"Saldo : R$ ", getSaldo());
	}

}
