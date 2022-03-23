programa {
	
	funcao inicio(){
		inteiro qtd, numero, maior = 0, menor = 0, contadornumeros=0, aux=1
		escreva("Quantos nº você quer digitar? ")
		leia(qtd)

		se(qtd >=1){
			enquanto (contadornumeros < qtd){			
			escreva("Digite um nº:  ")
			leia(numero)
			
				se ((numero >= 1) e (numero <=10000)){			
					 
					se(aux == 1){
						maior = numero
						menor = numero
						aux++																																																				
						contadornumeros++					
					}senao{
						se((aux >=2) e (numero > maior)){
							maior = numero
							contadornumeros++
						}senao se((aux >=2) e (numero < menor)){
							menor= numero
							contadornumeros++
						}senao{
							contadornumeros++				
						}
					}		
					 
				}senao{
					escreva("O número digitado é inválido!")
					retorne
				}			
			}
		}senao{
			escreva("Obrigado por responder, você não quer digitar nenhum nº")
			retorne
		}		

		escreva("O maior é:  " + maior + "\n")
		escreva("O menor é:  " + menor + "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */