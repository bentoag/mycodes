 import java.util.Scanner;

 public class Lista_Ex4_Consoantes {

	public static void main (String [] args) {

	 Scanner in = new Scanner (System.in);
	 
	 String var;
	 char c;

	 System.out.println("Digite uma palavra");
	 var = in.next();

		for ( int i = 0 ; i < var.length(); i++) {
		 
		 c = var.charAt(i);

			if (c != 'a' && c != 'A' && c != 'e' && c != 'E' && c != 'I' && c != 'i' && c != 'O' && c != 'o' && c != 'U' && c != 'u') {

		 System.out.println(c);

			}

		}
	
	}

 }


