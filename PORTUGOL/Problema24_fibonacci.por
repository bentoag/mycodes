programa
{
	
	funcao inicio()
	{	inteiro  numero, atual = 0, anterior = 1, proximo = 0, contador = 0
	
		escreva("Digite o número de elementos da sequencia de Fibonacci:  ")
		leia(numero)

		enquanto ( contador < numero){
			contador ++
			proximo = atual + anterior
			escreva( proximo + " , " )
			anterior = atual
			atual = proximo
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 86; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */