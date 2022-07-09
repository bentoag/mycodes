 import java.util.Scanner;

 public class PontoExtra {

	public static void main (String [] args) {

	 Scanner in = new Scanner (System.in);
	 
	 String nome,divi2, digitado, separa;
	 char c, c2;
	
	 
	 System.out.println("Digite Seu Nome :");
	 digitado = in.nextLine();
	 
//Separa o que foi digitado cada vez que aparecer um espaço
  
	 String[] arrayValores = digitado.split(" ");
	 
			for (int i=0; i < arrayValores.length; i++) {
			
    		  separa = arrayValores[i];
    		  c = separa.charAt(i);
    		  int atuali = i;
    		  System.out.println(separa + atuali + c);
    		  
    		  
    	 }	  
    		  
   System.out.println("Digite Seu Nome :");
	 nome = in.nextLine();

//Separa o que foi digitado cada vez que aparecer um espaço
	 
	  String[] arrayValores2 = nome.split(" ");
	 
			for (int j=0; j < arrayValores.length; j++) {
			
    		  divi2 = arrayValores2[j];
    		  c2 = divi2.charAt(j);
    		  int atualj = j;
    		  System.out.println(divi2 + atualj + c2);
    		  
	 
	 
	 
	 		}
	 
    		  	    		  	
    		  		/*if (i == 1 && c == c2) {
    		  			
    		  			System.out.println("Mãe e Filho"); 
    		  			   		  	
    		  		}
    		  	
    		     		  	
    		  		
    		  			if (i == 2 && c == c2) {
    		  	
    		  
    		           System.out.println("Pai e filho");
    		  	
    		  	}*/
    		
    		  
    		
	   
			

  	}
}

