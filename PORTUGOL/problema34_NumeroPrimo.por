programa
{
	
	funcao inicio()
	{	inteiro numero
		logico primo
	
		escreva("Digite um numero:  ")
		leia(numero)

		primo = ehPrimo(numero)

		escreva("O número " + numero + " é primo?  " + primo)
	}

	funcao logico ehPrimo (inteiro numero){
		inteiro contador = 0, numero_de_divisores=2
		se(numero > 1){
			enquanto (contador == 0 e (numero_de_divisores <= (numero/2))){
				se((numero%numero_de_divisores)==0){
					contador = 1
				}
				numero_de_divisores++
			}	

					se(contador == 1){
				retorne falso
			}senao{
				retorne verdadeiro
			}
		}senao{
			retorne falso
		}	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */