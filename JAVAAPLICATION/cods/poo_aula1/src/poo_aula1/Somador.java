package poo_aula1;

import java.util.Scanner;

public class Somador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.print ("Informe o 1º número inteiro:   ");
		numero1 = entrada.nextInt();
		
		System.out.print("Informe o 2º número inteiro:   ");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.printf("A Soma é %d%n", soma);
		System.out.printf(" %s%d %s%d %s%d","A Soma de ",numero1, " + ", numero2, " é igual a: ", soma);
		//System.out.println("A Soma de " + numero1 + " + " + numero2 + " é igual a: " + soma);
		
		entrada.close();
	}
}
