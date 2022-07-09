 import java.util.Scanner;

 public class Lista_Ex3_Luciano {

	public static void main (String [] args) {

	 Scanner in = new Scanner (System.in);
	 
	 String var;
	 char c;

	 System.out.println("Digite uma palavra");
	 var = in.next();

		for ( int i = 0 ; i < var.length(); i++) {
		 
		 c = var.charAt(i);

			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u') {

		 System.out.println(c);

			}

		}
	
	}

 }

//ASCII A =65  a=97   E=69 e=101  I=73 i=105   O=79 o=111 U=85  u=117
