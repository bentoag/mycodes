package bento.fundamentosjava.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Parte 1
		System.out.println("Ol�, mundo!");
		System.out.print("Ol�, mundo de novo. \n"); // \n � um metacarecter
		System.out.print("Ol�, mundo mais uma vez");
		 												*/
		
		/* Parte 2
		Scanner variavel = new Scanner (System.in);		
		System.out.print("Digite seu nome: ");
		String nome = variavel.nextLine();
		System.out.println(nome);
		variavel.close();  */
		
												/*
												 * Comentar: ctrl + 7 - linha por linha 
												 * ou ctrl+shift+/ - comenta um bloco inteiro
												 */
		
		//Parte 3 - Calculadora	
		Scanner variavel = new Scanner (System.in);
		System.out.print("Digite o primeiro n�:  ");
						//int num1 = Integer.parseInt(variavel.nextLine()); //cast implicito
		int num1 = variavel.nextInt();
		
		System.out.print("Qual a opera��o para realizar:  ");
		char operacao = variavel.next().charAt(0);
		System.out.print("Digite o segundo n�:  ");
		int num2 = variavel.nextInt();
		//System.out.println("Voc� quer fazer a opera��o "+ num1 + operacao + num2);
		//System.out.println(String.format("Voc� quer fazer a opera��o %d %c %d ", num1, operacao, num2));
		
		
		int resultado = 0;
			//parte 4
//			if (operacao == '+') {
//				resultado = num1 + num2;
//				System.out.println(String.format("%d %c %d = %d", num1, operacao, num2, resultado));
//			}else if(operacao == '-') {
//				resultado = num1-num2;
//				System.out.println(String.format("%d %c %d = %d", num1, operacao, num2, resultado));
//			}else if(operacao == '*') {
//				resultado = num1*num2;
//				System.out.println(String.format("%d %c %d = %d", num1, operacao, num2, resultado));
//			}else if(operacao == '/') {
//				resultado = num1/num2;
//				System.out.println(String.format("%d %c %d = %d", num1, operacao, num2, resultado));
//			}else {
//				System.out.println("Opera��o Inv�lida!");
//			}
		
			//parte 5
			switch(operacao) {
				case '+': 
					resultado = num1 + num2;					
					break;
				case '-':
					resultado = num1-num2;					
					break;
				case '*':
					resultado = num1*num2;					
					break;
				case '/':
					resultado = num1/num2;					
					break;
				default:
					System.out.println("Opera��o Inv�lida!");
					break;
			}
			
			ArrayList<String> historico = new ArrayList<String>();
			String entradadohistorico = String.format("%d %c %d = %d", num1, operacao, num2, resultado);
			historico.add(entradadohistorico);
			System.out.println(entradadohistorico);
			System.out.println(historico);
			
		variavel.close();
		
		
		
		

	}

}
