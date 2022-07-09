package imobiliaria.modelo;

import java.util.ArrayList;

public class Funcionario extends Pessoa{
	
	private ArrayList <ContratoServico> contratos = new ArrayList <>();
	private int cod;
	private TipoFuncionario cargo;
	private double salario;

	public Funcionario(String nome, String cpf, Endereco end, int fone, double sal, int cod, TipoFuncionario cargo) {
		super(nome, cpf, end, fone);
		this.cod = cod;
		this.cargo = cargo;
		this.salario = sal;
	}
	
	public Funcionario(String nome, String cpf, int cod, TipoFuncionario cargo) {
		super(nome, cpf);
		this.cod = cod;
		this.cargo = cargo;
	
	}
	
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
			
	}

	public ArrayList<ContratoServico> getContratoServico() {
		return contratos;
		
	}
	public int getCod() {
		return cod;
	}

	public TipoFuncionario getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void addContratoServico(ContratoServico contratoServico) {
		contratos.add(contratoServico);
		
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Funcionario)) return false;
		Funcionario fun = (Funcionario) o;
		return this.getCPF().equals(fun.getCPF());
	}
	
	@Override
	public String toString() {
		return "Funcionario : "+ getNome() + "  CPF:  " + getCPF() + "  Código:  " 
				+ cod + "  Função:   " + cargo;
	}
}
