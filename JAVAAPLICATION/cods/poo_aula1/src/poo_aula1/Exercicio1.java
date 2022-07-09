package poo_aula1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int num;

		Scanner numero = new Scanner(System.in);

		System.out.print("Digite um número:  ");
		num = numero.nextInt();

		if (num % 2 == 0) {
			System.out.println("O número " + num + " é PAR");
		} else {
			System.out.println("O número " + num + " é ÍMPAR");
		}

		numero.close();
	}
}
