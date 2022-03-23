programa
{
	
	funcao inicio()
	{
		inteiro media

		escreva("Digite a média final do aluno:  ")
		leia(media)

		se((media < 0) ou (media > 100)){
			escreva(" NOTA INVÁLIDA ")
		} senao se ((media >= 0) e (media <= 49)){
			escreva(" INSUFICIENTE ")
		}senao se ((media >= 50) e (media <= 64)){
			escreva(" REGULAR ")
		}senao se ((media >= 65) e (media <= 84)){
			escreva(" BOM ")
		}senao se ((media >= 85) e (media <= 100)){
			escreva(" ÓTIMO ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */