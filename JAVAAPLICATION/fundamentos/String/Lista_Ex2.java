 import java.util.Scanner;

 public class Lista_Ex2 {

	public static void main (String [] args) {

	 Scanner in = new Scanner (System.in);
	 
	 String var;
	 System.out.println("Digite uma palavra");
	 var = in.next();

		for ( int i = var.length() -1 ; i >= 0; i--) {
		 
		 System.out.println(var.charAt(i));

		}
	
	}

 }
