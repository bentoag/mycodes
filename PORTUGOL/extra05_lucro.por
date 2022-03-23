programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real valorproduto, valorvenda

		escreva("Digite o valor do Produto:  ")
		leia(valorproduto)

		se(valorproduto < 20.00){
			valorvenda = valorproduto + (0.45*valorproduto)
			valorvenda = mat.arredondar(valorvenda, 2)
			escreva("O valor da sua compra é de: " + valorvenda)
		}senao{
			valorvenda = valorproduto + (0.30*valorproduto)
			valorvenda = mat.arredondar(valorvenda, 2)
			escreva("O valor da sua compra é de: " + valorvenda)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */