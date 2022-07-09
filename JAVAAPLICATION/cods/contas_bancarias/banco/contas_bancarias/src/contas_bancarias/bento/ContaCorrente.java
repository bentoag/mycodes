package contas_bancarias.bento;

public class ContaCorrente extends Conta{	
	
	private double saldoContaCorrente;

	public ContaCorrente(int numConta, String cliente, double saldoConta) {
		super(numConta, cliente);	
		this.saldoContaCorrente = saldoConta;
	}
	
	public double getSaldoContaCorrente() {
		return this.saldoContaCorrente;
	}

	public void setSaldoContaCorrente(double saldoContaCorrente) {
		this.saldoContaCorrente = saldoContaCorrente;
	}
	
	void pagarConta (int numConta, double valor) {
		if(super.getNumDaConta() == numConta) {
			this.saldoContaCorrente -= valor;
		}
	}
	
	void cobrarTaxa (int numConta) {
		if(super.getNumDaConta() == numConta) {
			this.saldoContaCorrente -= 15.50;
		}
	}
	@Override
	void depositar(int nConta, double valor) {
		if(super.getNumDaConta() == nConta) {
			this.saldoContaCorrente += (valor > 0)? valor :  0;
		}else{
			System.out.println("Conta inv�lida.");
		}		
	}
	@Override
	void sacar(int nConta, double valor) {		
		if(super.getNumDaConta() == nConta) {
			if(this.saldoContaCorrente >= valor) {
				this.saldoContaCorrente -= valor;
			}else{
				System.out.println("Saldo insuficiente: ");			
			}
		}else {
			System.out.println("Conta inv�lida.");
		}		
	}
	
	@Override
	void sacar(double valor) {
		if (this.saldoContaCorrente > 0) {
			this.saldoContaCorrente -= valor;
		}		
	}
	@Override
	void depositar(double valor) {
		this.saldoContaCorrente += valor;
	}
	@Override
		void transferir(Conta contaDestino, double valor) {
			if (valor > 0) {
				this.sacar(valor);
				contaDestino.depositar(valor);
			}
		}
	@Override
	public String toString() {
		return String.format("%s %d %n%s%s %n%s%.2f","N� Conta: ",getNumDaConta(),"Cliente: ",  getCliente(), "Saldo : R$ ", getSaldoContaCorrente());
	}

}