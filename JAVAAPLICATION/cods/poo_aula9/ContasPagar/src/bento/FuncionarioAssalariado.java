package bento;

public class FuncionarioAssalariado extends Funcionario {

	private double salarioBase;

	public FuncionarioAssalariado(String nome, String sobrenome, double salarioBase) {
		super(nome, sobrenome);
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return String.format("%s: %s%n\t%s: $ %.2f%n\t%s: $ %.2f%n", "Funcionário assalariado", super.toString(),
				"Salário base", this.salarioBase, "Salário", calcularSalarioMensal());
	}

	@Override
	public double calcularSalarioMensal() {
		return this.salarioBase;
	}
}
