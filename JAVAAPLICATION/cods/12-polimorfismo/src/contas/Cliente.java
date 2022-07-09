package contas;

public class Cliente {

	private String nome;
	private SuperConta[] contas
		= new SuperConta[10];
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {		
		return nome;
	}
	// addConta polimórfico
	public void addConta(SuperConta c) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] == null) {
				contas[i] = c;
				return;
			}
		}		
	}
	// getSaldo polimórfico
	public double getSaldo() {
		double total = 0.0;
		// for (int i = 0; i < contas.length; i++) {
		//	  SuperConta c = contas[i];
		for (SuperConta c : contas) {
			if (c != null) {
				total += c.saldo();
			}
		}
		return total;
	}
	
	
	
	
	
	
	
	
	
}
