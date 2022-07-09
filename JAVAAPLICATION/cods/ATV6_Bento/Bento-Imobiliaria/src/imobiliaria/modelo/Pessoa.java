package imobiliaria.modelo;

public abstract class Pessoa {

	private String nome, cpf;
	private Endereco end;
	private int fone;
	
	public Pessoa (String nome, String cpf, Endereco end, int fone) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
		this.fone = fone;
	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return cpf;
	}

	public Endereco getEnd() {
		return end;
	}

	public int getFone() {
		return fone;
	}
	
}
