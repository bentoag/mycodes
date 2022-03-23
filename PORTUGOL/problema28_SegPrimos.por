programa
{
	
	funcao inicio() {
		inteiro soma = 0, qtd = 0
		real media
				
		para (inteiro i=2; i<100; i++){
			logico primo = verdadeiro
			
			para (inteiro j=2; j<=i; j++){
				se(((i % j) == 0) e (j != i)){					
				 primo = falso				 	
				}					
			}					
						
				se(primo){
					soma = soma + i
					qtd++
					escreva (i + ", ")
				}							
		}	
		media = soma / qtd
		
		escreva ("\n\n" + "A soma dos numeros primos é igual a:  " + soma + "\n\n")
		escreva ("A Media dos numeros primos somados é igual a:  " + media)			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */