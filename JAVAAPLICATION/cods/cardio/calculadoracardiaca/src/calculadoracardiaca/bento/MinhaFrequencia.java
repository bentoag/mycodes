package calculadoracardiaca.bento;

import java.util.Scanner;

public class MinhaFrequencia {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite seu nome:  ");
		String nome = input.nextLine();
		System.out.print("Digite seu sobrenome:  ");
		String sobrenome = input.nextLine();
		System.out.print("Digite o dia que voc� nasceu:  ");
		int dia = input.nextInt();
		System.out.print("Digite o m�s que voc� nasceu:  ");
		int mes = input.nextInt();
		System.out.print("Digite o ano que voc� nasceu:  ");
		int ano = input.nextInt();
		
		HeartRates bento = new HeartRates(nome, sobrenome, dia, mes, ano);
		
		System.out.println("**** MINHAS INFORMA��ES ****");
		System.out.printf("%s %s %s %n%s %d %s","Bem vindo : ", bento.getNome(), bento.getSobrenome(), "Voc� tem:  ", bento.calculaIdade(), " anos.");
		System.out.printf("%n%s %s","Sua data de nascimento �:  ", bento.getDataNascimento());
		System.out.printf("%n%s %d %s", "Sua Frequ�ncia Card�aca M�xima deve ser: ", bento.frequenciaCardioMax(), " bt/min");
		System.out.printf("%n%s %s %s", "Sua Frequ�ncia Card�aca Ideal ", bento.frequenciaAlvo(), "bt/min");
		
		
		
		
		input.close();


	}

}