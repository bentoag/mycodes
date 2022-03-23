programa
{
	
	funcao inicio()
	{
		real salario, prestacao

		escreva("Digite seu salário:  ")
		leia(salario)
		escreva("Digite o valor da prestação:  ")
		leia(prestacao)

		se(prestacao <= (0.3*salario) ) {
			escreva(" Você pode pegar o emprestimo")
		}senao{
			escreva(" Prestação muito alta, você não pode pegar o emprestimo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 39; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */