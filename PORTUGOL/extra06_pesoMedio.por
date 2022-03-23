programa
{
	
	funcao inicio()
	{		
		inteiro idade, contador = 0, pessoasfaixa1 = 0, pessoasfaixa2 = 0, pessoasfaixa3 = 0, pessoasfaixa4 = 0
		real peso, mediafaixa1 = 0.0, mediafaixa2 = 0.0, mediafaixa3 = 0.0, mediafaixa4= 0.0

		enquanto (contador < 15) {
			escreva("Digite sua idade:  ")
			leia(idade)
			escreva("Digite seu peso:  ")
			leia(peso)

			se((idade >= 1) e (idade<=10)){
				mediafaixa1 = mediafaixa1 + peso
				contador++
				pessoasfaixa1++
				escreva("\n\n")				
			}senao se((idade >= 11) e (idade<=20)){
				mediafaixa2 = mediafaixa2 + peso
				contador++
				pessoasfaixa2++
				escreva("\n\n")
			}senao se ((idade >= 21) e (idade<=30)){
				mediafaixa3 = mediafaixa3 + peso
				contador++
				pessoasfaixa3++
				escreva("\n\n")
			}senao se ( idade > 30){
				mediafaixa4 = mediafaixa4 + peso
				contador++
				pessoasfaixa4++
				escreva("\n\n")
			}senao{
				escreva("Idade Inválida, continue")
				escreva("\n\n")
			}
		}

		escreva("Média de peso das pessoas entre 1 e 10 anos:  " + mediafaixa1/pessoasfaixa1 + "\n\n")
		escreva("Média de peso das pessoas entre 11 e 20 anos:  " + mediafaixa2/pessoasfaixa2 + "\n\n")
		escreva("Média de peso das pessoas entre 21 e 30 anos:  " + mediafaixa3/pessoasfaixa3 + "\n\n")
		escreva("Média de peso das pessoas com mais de 30 anos:  " + mediafaixa4/pessoasfaixa4 + "\n\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 927; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */