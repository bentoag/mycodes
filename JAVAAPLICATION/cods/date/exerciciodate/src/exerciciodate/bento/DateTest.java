package exerciciodate.bento;

import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Forne�a um m�s:  ");
		int mes = input.nextInt();
		System.out.print("Forne�a um dia:  ");
		int dia = input.nextInt();
		System.out.print("Forne�a um ano:  ");
		int ano = input.nextInt();
		
		Date datafornecida = new Date(mes, dia, ano);
		
		System.out.println(datafornecida.displayDate());
		
		input.close();
		
	}
}
