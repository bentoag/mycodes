 import java.util.Scanner;

 public class Lista_Ex3 {

	public static void main (String [] args) {

	 Scanner in = new Scanner (System.in);
	 
	 String var;
	 System.out.println("Digite uma palavra");
	 var = in.next();

		for ( int i = 0 ; i < var.length(); i++) {
		 
			if (var.charAt(i) == 'a' || var.charAt(i) == 'A' || var.charAt(i) == 'e' || var.charAt(i) == 'E' || var.charAt(i) == 'I' || var.charAt(i) == 'i' || var.charAt(i) == 'O' || var.charAt(i) == 'o' || var.charAt(i) == 'U' || var.charAt(i) == 'u') {

		 System.out.println(var.charAt(i));

			}

		}
	
	}

 }

//ASCII A =65  a=97   E=69 e=101  I=73 i=105   O=79 o=111 U=85  u=117
