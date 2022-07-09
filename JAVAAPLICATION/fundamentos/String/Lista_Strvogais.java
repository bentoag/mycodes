 import java.util.Scanner;

 public class Lista_Strvogais {

	public static void main (String [] args) {

	 Scanner in = new Scanner (System.in);
	 
	 String var, str="aeiouAEIOU";
	 char c, cs;

	 System.out.println("Digite uma palavra");
	 var = in.next();

		for ( int i = 0 ; i < var.length(); i++) {
		 
		 c = var.charAt(i);

			for ( int j = 0; j < str.length(); j++) {
			  
			  cs = str.charAt(j);

			  if ( c == cs) {

		             System.out.println(c);
			  }

			}

		}
	
	}

 }


