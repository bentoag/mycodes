programa
{
	
	funcao inicio()
	{
		inteiro numero
		logico primo
	
		escreva("Digite um numero:  ")
		leia(numero)

		primo = ehPrimo(numero)

		escreva("O número " + numero + " é primo?  " + primo)
	}

	funcao logico ehPrimo (inteiro numero){
		inteiro contador = 0
		se(numero >= 1) {
			para (inteiro i=1; i<=numero; i++){
				para(inteiro j=1; j<=i;j++){
					se((i%j)==0){
						contador++
					}
				}
			se(contador==2){
				retorne verdadeiro
			}senao{
				retorne falso
			}
		}
			
		}
	
		
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */