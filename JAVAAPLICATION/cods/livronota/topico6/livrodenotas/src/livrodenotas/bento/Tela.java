package livrodenotas.bento;

import java.util.Scanner;

public class Tela {

	static Scanner input = new Scanner(System.in);

	public static void boasVindas() {
		System.out.println("Bem vindo a execu��o do Programa Livro de Notas!");
		System.out.println();
	}

	public static double pedirNota(int idAluno) {

		double nota = 0, entrada;
		boolean valido;
		
		do {
			System.out.printf("%n%s %d %s", "A nota do aluno ", idAluno, " :  ");
			entrada = input.nextDouble();
			valido = entrada >=0.0 && entrada<=10.0;			
		} while (!valido);
			
		if(valido) {
			nota = entrada;
		}else {
			pedirNota(idAluno);
		}
		return nota;
		
	}

	public static void imprimeMedias(double[][] medias, String nomeUC) {

		System.out.println(" M�dias da UC: " + nomeUC);
		for (int i = 0; i < medias.length; i++) {
			System.out.printf("%n %.2f",medias[i][0]);
		}
	}

	public static void imprimeMedia(double media, String nomeUC, int idAluno) {
		System.out.println(" M�dia do aluno  " + idAluno +  " na UC, " + nomeUC);
		imprimeMedia(media, idAluno);
		System.out.println();
	}

	private static void imprimeMedia(double media, int idAluno) {
		System.out.printf("%n%s %d %s %s %.2f" ,"Aluno ", idAluno," - " , "  m�dia igual: ",  media);
	}

}
