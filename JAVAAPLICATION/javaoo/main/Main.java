package bento.javaoo.main;

import bento.javaoo.classes.Carro;
import bento.javaoo.classes.VeiculoBase;
import bento.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import bento.javaoo.excecoes.ChassiInvalidoException;

public class Main {

	public static void main(String[] args) {

		try {
			// renomear variavel ALT+SHIFT+R
			VeiculoBase meuveiculo = new Carro("FORD", "KA");

			/*
			 * Veiculo bis = new Moto(); //polimorfismo : LSP
			 */

			meuveiculo.setChassi("ABCSE");
			System.out.println(String.format("O tanque esta com   %f  litros", meuveiculo.getQtdCombustivel()));
			System.out.println(meuveiculo.getMarca());
			System.out.println(meuveiculo.getNome());
			System.out.println(meuveiculo.getChassi());
//			System.out.println(
//					String.format("O veiculo  %s   esta ligado?  %b \n", meuveiculo.getNome(), meuveiculo.isLigado()));
			
			meuveiculo.abastecer(10);
			meuveiculo.preparar();
			meuveiculo.ligar();
			meuveiculo.acelerar();
			System.out.println(String.format("veloc atual:   %f", meuveiculo.getVelocidade()));
			meuveiculo.acelerar();
			meuveiculo.acelerar();			
			System.out.println(String.format("veloc atual:   %f", meuveiculo.getVelocidade()));
			meuveiculo.freiar();
			System.out.println(String.format("veloc atual:   %f", meuveiculo.getVelocidade()));			
			
			meuveiculo.desligar();
			System.out.println(String.format("veloc atual:   %f", meuveiculo.getVelocidade()));
			meuveiculo.abastecer(10);
			System.out.println(String.format("O tanque esta com   %f  litros", meuveiculo.getQtdCombustivel()));
			
		} catch (AbastecimentoVeiculoLigadoException e) {
			System.out.println("Você não pode abastecer com o veiculo ligado.");
		} catch (ChassiInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}

	}

}
