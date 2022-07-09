package bento.poo.aula2;

public class Conta {
	private String nome;
	private double saldo;	
	
	public Conta (String nome, double saldo) {
		this.nome = nome;
		if(saldo > 0.0) {
			this.saldo = saldo;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//metodos para depositar e sacar
	public void depositar (double valor) {
		if(valor > 0.0) {
			this.saldo = this.saldo + valor;
		}
	}
	
	public void sacar (double valor) {
		if(valor > 0.0) {
			this.saldo = this.saldo - valor;
		}
	}
}
