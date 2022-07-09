package contas_bancarias.bento;

public class ContaPoupanca extends Conta{
	
	private double saldoPoupanca;

	public ContaPoupanca(int numConta, String cliente, double saldoConta) {
		super(numConta, cliente);
		setSaldoPoupanca(saldoConta);
	}
	
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}



	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	void aplicarRendimento() {
		this.saldoPoupanca += this.saldoPoupanca*0.25;
		
	}
	
	@Override
	void depositar(int nConta, double valor) {
		if(super.getNumDaConta() == nConta) {
			this.saldoPoupanca += (valor > 0)? valor :  0;
		}else{
			System.out.println("Conta inválida.");
		}		
	}
	@Override
	void sacar(int nConta, double valor) {		
		if(super.getNumDaConta() == nConta) {
			if(this.saldoPoupanca >= valor) {
				this.saldoPoupanca -= valor;
			}else{
				System.out.println("Saldo insuficiente: ");			
			}
		}else {
			System.out.println("Conta inválida.");
		}		
	}
	@Override
	void sacar(double valor) {
		if (this.saldoPoupanca > 0) {
			this.saldoPoupanca -= valor;
		}		
	}
	@Override
	void depositar(double valor) {
		this.saldoPoupanca += valor;
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
		return String.format("%s %d %n%s%s %n%s%.2f","Nº Conta: ",getNumDaConta(),"Cliente: ",  getCliente(), "Saldo : R$ ", getSaldoPoupanca());
	}


}
