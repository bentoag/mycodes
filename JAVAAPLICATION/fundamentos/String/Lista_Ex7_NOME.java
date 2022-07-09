 import java.util.Scanner;

 public class Lista_Ex7_NOME {

	public static void main (String [] args) {

	 Scanner in = new Scanner (System.in);
	 
//*****Declaração de Variáveis********
	 
	 String nome = " ", meio = " ", ult = " ", digitado, primeiro = " ", segundo = " ", terceiro = " ", cond2;
	 char c, cm, ct, pc2,sc2,tc2;
	 boolean p = false, m = false, v= true, a = false, b = false, r= true;
	 int cont = 0, cont2 = 0, cont3 = 0, cont4 = 0;
	 
	 
//************Primeiro Nome**************************
	 

	 System.out.println("Digite Seu Nome :");
	 digitado = in.nextLine();

		for ( int i = 0 ; i < digitado.length(); i++) {

		  c = digitado.charAt(i);
		  cont = cont + 1;
		  
		 if ( c == ' ' && v) {
		  
                  System.out.println(nome);
		  p= true;

		  }else{

		   nome = nome + c;

		   }


			//para seperar o sobrenome do meio
			for ( int j =cont ; j < (digitado.length() - cont); j++) {

		           cm = digitado.charAt(j);
		           
		           cont2 = cont + 1;

				if ( cm == ' ' && p) {

			 	  meio = digitado.split(" ")[digitado.split(" ").length - 2]; 

                                  System.out.println(meio);
                                  m = true;
                                  p = false;
			
				}else{ 

			   	  meio = (String) meio + cm;
			  
			  	}
			}
			
						
			
			
			  for ( int k =cont2 ; k < (digitado.length() - cont); k++) {

		           ct = digitado.charAt(k);
		           
		        if ( ct != ' ' && m) {
		           ult = ult + ct;
		           v = false;
		           p = false;
		                                     
  				
  				} 
  				if ( ct == ' ' && m) {
                  
                 ult = digitado.split(" ")[digitado.split(" ").length - 1];
                 System.out.println(ult);
                 m= false;
               
			 	                                  			
				}

			   	
			}
		}
	
	
	
//******************Para o segundo nome ********************



System.out.println("Digite Seu Nome :");
	 cond2 = in.nextLine();

		for ( int l = 0 ; l < cond2.length(); l++) {

		  pc2 = cond2.charAt(l);  //primeiro nome da condição 2 pc2
		  cont3 = cont3 + 1;
		  
		 if ( pc2 == ' ' && r) {
		  
                  System.out.println(primeiro);
		  a= true;

		  }else{

		   primeiro = primeiro + pc2;

		   }

			
			for ( int o =cont3 ; o < (cond2.length() - cont3); o++) {

		           sc2 = cond2.charAt(o); //segundo (meio) nome da leitura 2
		           
		           cont4 = cont3 + 1;

				if ( sc2 == ' ' && a) {

			 	 segundo = cond2.split(" ")[cond2.split(" ").length - 2];

                                  System.out.println(segundo);
                                  b = true;
                                  a = false;
			
				}else{ 

			   	  segundo = (String) segundo + sc2;
			  
			  	}
			}
			
						
			
			
			  for ( int n =cont4 ; n < (cond2.length() - cont3); n++) {

		           tc2 = cond2.charAt(n); //tc2 último sobrenome do 2 nome informado
		           
		        if ( tc2 != ' ' && b) {
		           terceiro = terceiro + tc2;
		           r = false;
		           a = false;
		                                     
  				
  				} 
  				if ( tc2 == ' ' && b) {
                  
                 terceiro = cond2.split(" ")[cond2.split(" ").length - 1];
                 System.out.println(terceiro);
                 b= false;
               
			 	                                  			
				}

			   	
			}
		}
		
		
//***************Comparar Parentesco***************************


 		
 				for (int j =cont ; j < (digitado.length() - cont); j++) {
		 
		             cm = digitado.charAt(j);

			for ( int o =cont3 ; o < (cond2.length() - cont3); o++) {
			  
			  sc2 = cond2.charAt(o);

			  if ( cm == sc2) {

		             System.out.println("maaaae");
			  }

			}

		}
 
		//modo para comparar Strings
			/*if (indiceDiferenca == 0) {
			
			 System.out.println();
			 System.out.println("Mãe e Filho"); 
			 System.out.println();
			
			}
		
				 if (ult == terceiro) {
				 
			        System.out.println();
			 	   	System.out.println("Pai e Filho");
			 	   	System.out.println(); 
			
				  }
			
						if (meio == segundo && ult == terceiro ) {
						
			              System.out.println();
			 			  System.out.println("São Irmãos"); 
			 			  System.out.println();
			
						}else{
						System.out.println();
						System.out.println("Parentesco Não Definido");
						System.out.println();
						}*/

	}

 }


