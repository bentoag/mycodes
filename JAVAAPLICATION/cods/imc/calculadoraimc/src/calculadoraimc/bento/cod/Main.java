package calculadoraimc.bento.cod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o seu peso (em quilogramas):  ");
		float peso = input.nextFloat();
		System.out.print ("Informe a sua altura (em metros):  ");
		float altura = input.nextFloat();
		CalculadoraIMC meuIndice = new CalculadoraIMC(peso, altura);
		meuIndice.calcularIMC(peso, altura);
		
		System.out.println("**CALCULANDO SEU IMC: ****");		
		System.out.printf("%n %s %.2f %n", "Seu IMC é igual a: ", meuIndice.getIMC());
		System.out.printf("%n%n%s %n%s %n%s %n%s ", "ABAIXO DO PESO --> IMC < 18,5", "PESO NORMAL--> 18,5 < IMC < 24,9 ", "SOBREPESO --> 25,0 < IMC < 29,9", "OBESIDADE --> IMC > 30,0");
		
		input.close();

	}

}
