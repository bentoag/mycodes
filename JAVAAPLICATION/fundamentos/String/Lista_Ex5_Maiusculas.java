 import java.util.Scanner;

 public class Lista_Ex5_Maiusculas {

	public static void main (String [] args) {

	 Scanner in = new Scanner (System.in);
	 
	 String var;
	 char c;
	
	 System.out.println("Digite uma palavra");
	 var = in.nextLine();

		for ( int i = 0 ; i < var.length(); i++) {
		 
		 c = var.charAt(i);
		 
		 int asc = c; //conversao ascii

			if ( asc >= 97 && asc <= 122) {

			  asc = asc - 32;  //valor da letra maiuscula

		 	  c = (char) asc;

		 	}		
		 
		  System.out.println(c);
		}
	
	   
	}

 }


