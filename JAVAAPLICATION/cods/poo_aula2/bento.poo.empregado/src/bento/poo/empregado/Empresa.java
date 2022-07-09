package bento.poo.empregado;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// solicitando informacoes empregado 1
		System.out.print("Informe o nome do 1� Empregado:  ");
		String nome1 = scanner.nextLine();
		System.out.print("Informe o sobrenome do 1� Empregado:  ");
		String sobrenome1 = scanner.nextLine();
		System.out.print("Informe o salario do 1� Empregado:  ");
		double salario1 = scanner.nextDouble();

		// instanciando, criando, empregado 1
		Empregado empregado1 = new Empregado(nome1, sobrenome1, salario1);
		scanner.nextLine();
		System.out.println();
		// solicitando informacoes empregado 2
		System.out.print("Informe o nome do 2� Empregado:  ");
		String nome2 = scanner.nextLine();
		System.out.print("Informe o sobrenome do 2� Empregado:  ");
		String sobrenome2 = scanner.nextLine();
		System.out.print("Informe o salario do 2� Empregado:  ");
		double salario2 = scanner.nextDouble();

		// instanciando, criando, empregado 2
		Empregado empregado2 = new Empregado(nome2, sobrenome2, salario2);
		scanner.nextLine();

		System.out.printf("%nEmpregado 1: %s %s Salario: R$  %.2f Salario Anual: R$  %.2f", empregado1.getNome(), empregado1.getSobrenome(),
				empregado1.getSalario(), empregado1.getSalarioAnual());
		System.out.printf("%nEmpregado 2: %s %s Salario: R$  %.2f Salario Anual: R$  %.2f%n%n", empregado2.getNome(), empregado2.getSobrenome(),
				empregado2.getSalario(), empregado2.getSalarioAnual());
		
		// solicitando um percentual de aumento
		System.out.print("Informe o aumento do 1� Empregado:  ");
		float aumento1 = scanner.nextFloat();
		empregado1.darAumento(aumento1);
		System.out.println("***AUMENTO 1: Informado de " + aumento1 + " %");
		System.out.printf("%nEmpregado 1: %s %s Salario: R$  %.2f Salario Anual: R$  %.2f", empregado1.getNome(), empregado1.getSobrenome(),
				empregado1.getSalario(), empregado1.getSalarioAnual());
		

	}

}
