package contas_bancarias.bento;

public class ContaInvestimento extends Conta{
	
	private double saldoInvestimento;
	
	public ContaInvestimento(int numConta, String cliente, double saldoConta) {
		super(numConta, cliente);	
		this.setSaldoInvestimento(saldoConta);
	}

	public double getSaldoInvestimento() {
		return this.saldoInvestimento;
	}

	public void setSaldoInvestimento(double saldoInvestimento) {
		this.saldoInvestimento = saldoInvestimento;
	}
	
	void aplicarRendimento() {
		this.saldoInvestimento += this.saldoInvestimento*0.30;
	}
	
	void cobrarImpostoAnual() {	
		this.saldoInvestimento-= this.saldoInvestimento*0.275;		
	}
	
	@Override
	void depositar(int nConta, double valor) {
		if(super.getNumDaConta() == nConta) {
			this.saldoInvestimento += (valor > 0)? valor :  0;
		}else{
			System.out.println("Conta inv�lida.");
		}		
	}
	@Override
	void sacar(int nConta, double valor) {		
		if(super.getNumDaConta() == nConta) {
			if(this.saldoInvestimento >= valor) {
				this.saldoInvestimento -= valor;
			}else{
				System.out.println("Saldo insuficiente: ");			
			}
		}else {
			System.out.println("Conta inv�lida.");
		}		
	}
	
	@Override
	void sacar(double valor) {
		if (this.saldoInvestimento > 0) {
			this.saldoInvestimento-= valor;
		}		
	}
	@Override
	void depositar(double valor) {
		this.saldoInvestimento += valor;
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
		return String.format("%s %d %n%s%s %n%s%.2f","N� Conta: ",getNumDaConta(),"Cliente: ",  getCliente(), "Saldo : R$ ", getSaldoInvestimento());
	}
	

}
