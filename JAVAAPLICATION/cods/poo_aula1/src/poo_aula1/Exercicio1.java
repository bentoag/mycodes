package poo_aula1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int num;

		Scanner numero = new Scanner(System.in);

		System.out.print("Digite um n�mero:  ");
		num = numero.nextInt();

		if (num % 2 == 0) {
			System.out.println("O n�mero " + num + " � PAR");
		} else {
			System.out.println("O n�mero " + num + " � �MPAR");
		}

		numero.close();
	}
}
