package imobiliaria.modelo;

import java.util.ArrayList;

public class Cliente extends Pessoa {

	private ArrayList <ContratoServico> contratos = new ArrayList <>();
	private TipoCliente especificaCliente;
	private int codCliente;
	
	
	
	public Cliente(String nome, String cpf, Endereco end, int fone, int cod, TipoCliente clt) {
		super(nome, cpf, end, fone);
		this.especificaCliente = clt;
		this.codCliente = cod;
		
	}
	
	public Cliente(String nome, String cpf, int cod, TipoCliente clt) {
		super(nome, cpf);
		this.especificaCliente = clt;
		this.codCliente = cod;
		
	}
	
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
				
	}

	public TipoCliente getEspecificaCliente() {
		return especificaCliente;
	}

	public int getCodCliente() {
		return codCliente;
	}
	
	
	
	public ArrayList<ContratoServico> getContratoServico() {
		return contratos;
	}

	public void addContratoServico(ContratoServico contratoServico) {
		contratos.add(contratoServico);
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Cliente)) return false;
		Cliente c = (Cliente) o;
		return this.getCPF().equals(c.getCPF());
	}
	
	@Override
	public String toString() {
		return "Cliente : "+ getNome() + "  CPF:  " + getCPF() + "  Código:  " 
				+ codCliente + "  Modalidade   " + especificaCliente ;
	}
}
