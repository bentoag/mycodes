package bento.poo.aula2;

import java.util.Scanner;

public class MeuBanco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	

		System.out.print("Informe o nome do 1� Cliente:  ");
		String cliente1 = scanner.nextLine();
		System.out.print("Informe o saldo inicial do 1� Cliente: ");
		double saldo1 = scanner.nextDouble();
		
		Conta conta1 = new Conta(cliente1, saldo1);
		scanner.nextLine();
			
		System.out.print("Informe o nome do 2� Cliente:  ");
		String cliente2 = scanner.nextLine();
		System.out.print("Informe o saldo inicial do 2� Cliente: ");
		double saldo2 = scanner.nextDouble();
		
		Conta conta2 = new Conta(cliente2, saldo2);
		scanner.nextLine();
		
		System.out.printf("%nConta1: Nome=%s, Saldo=$ %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("Conta2: Nome=%s, Saldo=$ %.2f%n%n", conta2.getNome(), conta2.getSaldo());
		
		//intera��es depositar na conta 1
		System.out.print("Informe o valor do dep�sito na conta1: ");
		double valor1 = scanner.nextDouble();
		conta1.depositar(valor1);
		
		System.out.printf("%nNovo saldo conta1: $ %.2f%n%n", conta1.getSaldo());
		
		//intera��es sacar na conta 2
		System.out.print("Informe o valor do saque na conta2: ");
		double valor2 = scanner.nextDouble();
		conta2.sacar(valor2);
		System.out.printf("%nNovo saldo conta2: $ %.2f%n%n", conta2.getSaldo());
	}
}
