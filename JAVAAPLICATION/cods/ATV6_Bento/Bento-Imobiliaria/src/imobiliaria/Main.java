package imobiliaria;

import java.time.LocalDate;
import java.util.ArrayList;

//todas as regras criadas
import imobiliaria.modelo.Apartamento;
import imobiliaria.modelo.Cancelamento;
import imobiliaria.modelo.Casa;
import imobiliaria.modelo.Cliente;
import imobiliaria.modelo.ContratoServico;
import imobiliaria.modelo.DataPassadaException;
import imobiliaria.modelo.Endereco;
import imobiliaria.modelo.Finalidade;
import imobiliaria.modelo.Funcionario;
import imobiliaria.modelo.FuncionarioNaoEncontradoException;
import imobiliaria.modelo.Imovel;
import imobiliaria.modelo.ImovelNaoEncontradoException;
import imobiliaria.modelo.Pessoa;
import imobiliaria.modelo.SalaComercial;
import imobiliaria.modelo.Terreno;
import imobiliaria.modelo.TipoCliente;
import imobiliaria.modelo.TipoFuncionario;
import imobiliaria.modelo.ClienteNaoEncontradoException;
import imobiliaria.modelo.Anuncio;

public class Main {

	

	public static void main(String[] args) throws ClienteNaoEncontradoException, FuncionarioNaoEncontradoException, ImovelNaoEncontradoException {
		
		//Teste dos Enums
		Finalidade f = Finalidade.Alugar;
		System.out.println(f);
		System.out.println(f.name());
		System.out.println(f.ordinal());
		
		Finalidade f1 = Finalidade.Permuta;
		System.out.println(f1.name());
		System.out.println(f1.ordinal());
		
		System.out.println();		
		TipoCliente cl = TipoCliente.Locatario;
		System.out.println(cl.name());
		System.out.println(cl.ordinal());
		
		System.out.println();
		TipoFuncionario func = TipoFuncionario.Gerente;
		System.out.println(func.name());
		System.out.println(func.ordinal());
		System.out.println();
		
		
		
		//Teste Add Cliente		
		
		Cliente bento = new Cliente ("Bento Gonzaga", "06720080011",new Endereco("Luiz Conego", "Parque Universitário", "9600026", 65), 
				999720000, 01, TipoCliente.Locador);		
		
		Cliente paulo = new Cliente ("Paulo Gonzaga", "06727780011",new Endereco("rua", "bairro", "CEP", 12), 
				999720000, 13, TipoCliente.Comprador);		
		
		Cliente Alfredo = new Cliente ("Alfredo Gonzaga", "12340080011",new Endereco("rua", "bairro", "CEP", 12), 
				999720000, 02, TipoCliente.Locatario);		
		
		Cliente Mario = new Cliente ("Mario Gonzaga", "06721234511",new Endereco("rua", "bairro", "CEP", 12), 
				999720000, 22, TipoCliente.Locador);		
		
		
		//Teste Add Funcionario 
		
		Funcionario jose = new Funcionario("José Paulo", "05522211100", new Endereco("rua", "bairro", "CEP", 13), 
				999880221, 2500.00, 02, TipoFuncionario.Corretor);
		
		Funcionario pedro = new Funcionario("Pedro Silva", "05522254321", new Endereco("rua", "bairro", "CEP", 13), 
				999880221, 2500.00, 02, TipoFuncionario.Gerente);
		
		Funcionario Maria = new Funcionario("Maria Conceição", "09872211100", new Endereco("rua", "bairro", "CEP", 13), 
				999880221, 2500.00, 02, TipoFuncionario.Contador);
		
		
		//Criar um contrato		
		ContratoServico contrato = new ContratoServico (123, new Funcionario("José Paulo", "05522211100"),
				new Cliente ("Bento Gonzaga", "06720080011"), LocalDate.of(2018, 07, 13));
		
//		ContratoServico contrato2 = new ContratoServico (123, new Funcionario("José Paulo", "05522211100"),
//				new Cliente ("Bento Gonzaga", "06720080011"), LocalDate.of(2018, 04, 13));    //DataException
		
				//Cadastrar Cliente e Funcionario
				
				contrato.cadastrarCliente(bento);
				contrato.cadastrarCliente(paulo);
				contrato.cadastrarCliente(Alfredo);
				contrato.cadastrarCliente(Mario);
				contrato.cadastrarFuncionario(jose);
				contrato.cadastrarFuncionario(Maria);
				contrato.cadastrarFuncionario(pedro);
		
		
		//Buscar por Cliente e Funcionario
		
		System.out.println(contrato.buscarCliente("06720080011"));
		System.out.println();
		System.out.println(contrato.buscarCliente("06721234511"));
		System.out.println();
		System.out.println(contrato.buscarCliente("12340080011"));
		System.out.println();
		System.out.println(contrato.buscarCliente("06727780011"));
		System.out.println();
		System.out.println();
		System.out.println(contrato.buscarFuncionario("05522211100"));
		System.out.println();
		System.out.println(contrato.buscarFuncionario("09872211100"));
		System.out.println();
		System.out.println(contrato.buscarFuncionario("05522254321"));
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		Casa casabento = new Casa (1234, 300, 12, new Endereco("rua", "bairro", "CEP", 13), Finalidade.Venda, 300000.00, LocalDate.of(2018, 07, 13), 3, 2, 2);
		
					Anuncio cs = new Anuncio(1234);					
					cs.cadastrarCasa(casabento);
					System.out.println(cs.buscarCasa(1234));					
					System.out.println();
					System.out.println();
					
		Apartamento aptobento = new Apartamento (23, 245, 24, new Endereco("rua", "bairro", "CEP", 13), Finalidade.Alugar, 800.00, LocalDate.of(2018, 07, 13), 2, 1, 1, "Feliz");			
					
						Anuncio apt = new Anuncio(1234);					
						apt.cadastrarApartamento(aptobento);
						System.out.println(apt.buscarApartamento(23));
						System.out.println();
						System.out.println();
						
								
		SalaComercial salatop = new SalaComercial(666, 90, 12, new Endereco("rua", "bairro", "CEP", 13), Finalidade.Alugar, 1500.00, LocalDate.of(2018, 07, 01), 2, 13);
						
						Anuncio sala = new Anuncio(1234);					
						sala.cadastrarSalaComercial(salatop);
						System.out.println(sala.buscarSalaComercial(666));
						System.out.println();
						System.out.println();
		
					
		Terreno t = new Terreno (51, 600, 1,new Endereco("rua", "bairro", "CEP", 13), Finalidade.Permuta, 0.0, LocalDate.of(2018, 07, 01), false);
		
		Terreno t2 = new Terreno (233, 2000, 1,new Endereco("rua", "bairro", "CEP", 13), Finalidade.Venda, 150000.0, LocalDate.of(2018, 07, 01), true);
		
							Anuncio tr = new Anuncio(1234);					
							tr.cadastrarTerreno(t);
							System.out.println(tr.buscarTerreno(51));
							System.out.println();
							System.out.println();
							tr.cadastrarTerreno(t2);
							System.out.println(tr.buscarTerreno(233));
							System.out.println();
							System.out.println();
							
							
			//try and catchs - Exceções
				try {
					contrato.buscarCliente("06720080022");  //Exception ClienteNaoEncontrado
				} catch (ClienteNaoEncontradoException ex) {
					System.out.println("Exceção esperada: " + ex);
				} catch (Exception ex) {
					System.out.println("Exceção NÃO esperada: " + ex);
				}
				
				try {
					contrato.buscarFuncionario("05522211199");  //Exception FuncionarioNaoEncontrado
				} catch (FuncionarioNaoEncontradoException ex) {
					System.out.println("Exceção esperada: " + ex);
				} catch (Exception ex) {
					System.out.println("Exceção NÃO esperada: " + ex);
				}
				
				try {
					cs.buscarCasa(12); //Exception ImovelNaoEncontrado
				} catch (ImovelNaoEncontradoException ex) {
					System.out.println("Exceção esperada: Casa  " + ex);
				} catch (Exception ex) {
					System.out.println("Exceção NÃO esperada: Casa  " + ex);
				}
				
				try {
					apt.buscarApartamento(33); //Exception ImovelNaoEncontrado
				} catch (ImovelNaoEncontradoException ex) {
					System.out.println("Exceção esperada: Apto  " + ex);
				} catch (Exception ex) {
					System.out.println("Exceção NÃO esperada: Apto  " + ex);
				}
				try {
					sala.buscarSalaComercial(54); //Exception ImovelNaoEncontrado
				} catch (ImovelNaoEncontradoException ex) {
					System.out.println("Exceção esperada: Comercial  " + ex);
				} catch (Exception ex) {
					System.out.println("Exceção NÃO esperada: Comercial  " + ex);
				}
				try {
					tr.buscarTerreno(54); //Exception ImovelNaoEncontrado
				} catch (ImovelNaoEncontradoException ex) {
					System.out.println("Exceção esperada: Terreno  " + ex);
				} catch (Exception ex) {
					System.out.println("Exceção NÃO esperada: Terreno  " + ex);
				}
	}//main

}
