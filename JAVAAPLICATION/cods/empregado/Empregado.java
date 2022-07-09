package bento.poo.empregado;

public class Empregado {

	private String nome, sobrenome;
	private double salario;

	// Instancia Empregado{
	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (salario > 0.0) {
			this.salario = salario;
		}
	}

	// metodo dar aumento: salario + percentual
	public void darAumento(float percentual) {
		this.salario = this.salario + this.salario * (percentual / 100);
	}

	// metodo getSalarioAnual multiplica por 13 pelo 13� salario
	public double getSalarioAnual() {
		return this.salario * 13;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}