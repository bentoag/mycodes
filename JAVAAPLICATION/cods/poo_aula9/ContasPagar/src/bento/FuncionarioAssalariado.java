package bento;

public class FuncionarioAssalariado extends Funcionario {

	private double salarioBase;

	public FuncionarioAssalariado(String nome, String sobrenome, double salarioBase) {
		super(nome, sobrenome);
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return String.format("%s: %s%n\t%s: $ %.2f%n\t%s: $ %.2f%n", "Funcion�rio assalariado", super.toString(),
				"Sal�rio base", this.salarioBase, "Sal�rio", calcularSalarioMensal());
	}

	@Override
	public double calcularSalarioMensal() {
		return this.salarioBase;
	}
}
