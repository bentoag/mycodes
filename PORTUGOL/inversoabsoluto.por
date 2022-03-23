programa
{
	
	funcao inicio()
	{
		real n, inv, abs
		escreva("Digite um número:  ")
		leia(n)

		se ( n > 0){
			inv = 1/n
			escreva("Inverso igual a:  " + inv)
		}senao{
			abs = n*(-1)
			escreva ("Absoluto igual a:  " + abs)
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */