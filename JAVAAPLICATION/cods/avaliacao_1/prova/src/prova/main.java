package prova;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//		String nome = "Jos�";
//		int idade = 28;
//		double salario_liquido = 2630.4597;
//
//		System.out.print("Declarante: ");
//		System.out.println();
//		System.out.printf("%s, %d anos%nSal�rio l�quido: R$ %.2f%n",
//				  nome, idade, salario_liquido);
		
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.printf("Informe a temperatura da sopa: ");
//		int temp = scanner.nextInt();
//
//		if (temp > 90) {
//		  System.out.println("Esta sopa est� muito quente!");
//
//		  temp = temp - (temp > 150 ? 100 : 20);
//		} else {
//		  if (temp < 70) {
//		    System.out.println("Esta sopa est� muito fria!");
//
//		    temp = temp + (temp < 50 ? 30 : 20);
//		  }
//		}
//
//		if (temp == 80) {
//		  System.out.println("A temperatura desta sopa est� boa!");
//		}
		
		int a = 4;
		int b = 12;
		int c = 37;
		int d = 51;
		int resultado = d % a * c + d / a - b;
		
		System.out.println(resultado);

	}

}
