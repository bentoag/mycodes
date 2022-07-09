package imobiliaria.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContratoServico {
	
	private final ArrayList <Funcionario> funcionarios = new ArrayList<>();
	private final ArrayList <Cliente> clientes = new ArrayList<>();
	

	private  Funcionario responsavel;
	private Cliente cliente;
	private int cod;
	private LocalDate data;
	private Cancelamento cancelamento;
	
	
	
		public ContratoServico (int cod, Funcionario resp, Cliente solicitante, LocalDate data) {
			
			this.cod = cod;
			
			this.responsavel = resp;
			resp.addContratoServico(this);
			this.cliente = solicitante;
			solicitante.addContratoServico(this);
			
			if (data.isBefore(LocalDate.now())) {
				throw new DataPassadaException();
			}
			this.data = data;
			
			
		}		
				
				//Cadastro de Pessoas		
		
				public void cadastrarCliente (Cliente c) {
					clientes.add(c);		
				}
				
		
				public void cadastrarFuncionario (Funcionario func) {
					funcionarios.add(func);
				}
				
				//Buscar Pessoas: Funcionaro e Cliente
				
				public Cliente buscarCliente (String cpf) throws ClienteNaoEncontradoException {
					
					for (Cliente cliente : clientes) {
						if(cliente.getCPF().equals(cpf)) {
							return cliente;
						} 
					}
					throw new ClienteNaoEncontradoException();			
				}
				
				public Funcionario buscarFuncionario (String cpf) throws FuncionarioNaoEncontradoException {
					
					for (Funcionario func : funcionarios) {
						if(func.getCPF().equals(cpf)) {
							return func;
						} 
					}
					throw new FuncionarioNaoEncontradoException();			
				}
				
			
				//Getters
				public Funcionario getResponsavel() {
					return responsavel;
				}						
		
				public Cliente getCliente() {
					return cliente;
				}
		
		
				public int getCod() {
					return cod;
				}
		
		
				public LocalDate getData() {
					return data;
				}
		
		
				public Cancelamento getCancelamento() {
					return cancelamento;
				}
				
				
				public Cancelamento cancelarContratoServico (int cod) { 
					
					if (this.cod == cod) getCancelamento();
											
					return getCancelamento();
					
				}
		
		
}
