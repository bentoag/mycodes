 import java.util.Scanner;

 public class Lista_Ex6_ASCII {

	public static void main (String [] args) {

	 Scanner in = new Scanner (System.in);
	 
	 String var;
	 char c;
	
	 System.out.println("Digite uma palavra");
	 var = in.nextLine();

		for ( int i = 0 ; i < var.length(); i++) {
		 
		 c = var.charAt(i);
		 
		 int asc = c; //conversao ascii

		 System.out.println("Char  = " + c + "    Cod. ASCII  =" + asc);
		}
	
	   
	}

 }


