programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro contador = 0, opiniao, idade, qtdregular = 0, qtdbom = 0, qtdexcelente = 0
		real mediaidade = 0.0, percentobom = 0.0, somaidade = 0.0

		enquanto (contador < 15){
			escreva("Digite sua idade:  ")
			leia(idade)
			escreva("Digite sua opinião:  ")
			leia(opiniao)

				se(idade > 0){
					se(opiniao == 1){
							qtdregular++
							contador++
							escreva("\n\n")
						}senao se (opiniao == 2){
							qtdbom++
							contador++
							escreva("\n\n")				
						}senao se(opiniao==3){
							somaidade = somaidade + idade
							qtdexcelente++
							contador++
							escreva("\n\n")			
						}senao{
							escreva("Opinião Inválida: Tente novamente!")
							escreva("\n\n")	
							
						}
				}senao{
					escreva("Idade Inválida: Tente novamente!")
							escreva("\n\n")
				}
			
		}

		percentobom = (100*qtdbom)/15.0
		percentobom = mat.arredondar(percentobom, 2)
		
		mediaidade = somaidade/qtdexcelente
		mediaidade = mat.arredondar(mediaidade, 2)
		
		escreva("A média da idade das pessoas que responderam excelente é:  " + mediaidade + "\n\n")
		escreva("O numero de pessoas que responderam regular é igual a: " + qtdregular + "\n\n")
		escreva("A percentagem de pessoas que responderam BOM é igual a:  " + percentobom + " % ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 814; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */