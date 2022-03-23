programa
{
	
	funcao inicio()
	{	inteiro numero, tabuada, contador = 0
		escreva("Digite um nº entre 1 e 10 para saber a tabuada:  ")
		leia(numero)

		se(numero >=1 e numero <=10){
			enquanto(contador < 10){
				contador++
				tabuada = numero*contador			
				escreva(numero + " x " + contador + " = " + tabuada + "\n")

			}
		}senao{
			escreva(" Número informado é inválido. ")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */