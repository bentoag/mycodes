package healthprofile.bento;

import java.util.Scanner;

public class MyProfile {

	public static void main(String[] args) {
		
		
		Scanner inputopcao = new Scanner(System.in);
		System.out.println("**** BEM VINDO AO SISTEMA DE CADASTRO DE PERFIL M�DICO: ****");
		System.out.println("Digite 1 para Cadastrar  ||  Digite 0 para sair");
		int opcao = inputopcao.nextInt();
		
		if(opcao == 1) {
			
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
			System.out.print("Digite a sua altura (em metros):  ");
			float altura = input.nextFloat();
			System.out.print("Digite o seu peso (em quilogramas):  ");
			float peso = input.nextFloat();
			
			HealthProfile user = new HealthProfile(nome, sobrenome, dia, mes, ano, peso, altura);
			System.out.println("**** MINHAS INFORMA��ES ****");
			System.out.printf("%s %s %s %n%s %d %s","Bem vindo : ", user.getNome(), user.getSobrenome(), "Voc� tem:  ", user.calculaIdade(), " anos.");
			System.out.printf("%n%s %s","Sua data de nascimento �:  ", user.getDataNascimento());
			System.out.printf("%n%s %d %s", "Sua Frequ�ncia Card�aca M�xima deve ser: ", user.frequenciaCardioMax(), " bt/min");
			System.out.printf("%n%s %s", "Sua Frequ�ncia Card�aca Ideal ", user.frequenciaAlvo());
			
			//validando o IMC
			if(user.getIMC() == -1) {
				System.out.println();
				System.out.println("Par�metros inv�lidos, n�o podemos calcular seu IMC!");
			}else {
				System.out.printf("%n%s %.2f %n", "Seu IMC � igual a: ", user.getIMC());
				System.out.printf("%n%s %n%s %n%s %n%s ", "ABAIXO DO PESO --> IMC < 18,5", "PESO NORMAL--> 18,5 < IMC < 24,9 ", "SOBREPESO --> 25,0 < IMC < 29,9", "OBESIDADE --> IMC > 30,0");
			}
			
		}else {
			System.out.println("OBRIGADO PELA VISITA");
		}	
		
	}

}