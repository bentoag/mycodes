package bento.testesjava.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Exercicio Tabuada
		Scanner num = new Scanner(System.in);
		System.out.println("Digite um n: ");
		int n = num.nextInt();
		
		for(int i=0; i< n; i++) {
			
			try {
				int x = num.nextInt();
				System.out.println(x);
			} catch (InputMismatchException e) {
				num.nextLine();
				System.out.println(String.format(
						"Gerou o erro InputMismatchException", e.getMessage()));
				
			}
			
		}
		
		num.close();
		
			
	}

}
