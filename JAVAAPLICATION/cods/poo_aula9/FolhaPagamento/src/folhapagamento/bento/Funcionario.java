package folhapagamento.bento;

public abstract class Funcionario {

	private String nome;
	private String sobrenome;

	public Funcionario(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return String.format("%s %s", this.nome, this.sobrenome);
	}

	//todas as subclasses tem de implementar esse metodo
	public abstract double calcularSalarioMensal();
}
