programa
{
	
	funcao inicio()
	{	inteiro numero = 1, tabuada, contador = 0
		caracter resposta = ' '
		escreva("Você quer visualizar a tabuada entre 1 e 10:  ")
		leia(resposta)

		se(resposta == 's' ou resposta == 'S'){
			enquanto(contador < 10){
				contador++
				tabuada = numero*contador				
				escreva(numero + " x " + contador + " = " + tabuada + "\n")			
				se (contador == 10 e numero < 10){
					numero++
					contador = 0	
					escreva("\n\n")		
				}

			}
			
		}senao{
			escreva(" RESPOSTA INVÁLIDA ")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */