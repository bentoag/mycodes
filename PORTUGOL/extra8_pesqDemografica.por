programa {	
	inclua biblioteca Matematica --> mat
	funcao inicio() {	
		caracter estadocivil =' '
		inteiro casado = 0, solteiro = 0, viuvo = 0, separado = 0, controle = 0, idade, total
		real mediaidadeviuvos = 0.0, somaidadeviuvos = 0.0, percentagem = 0.0
		

		enquanto (controle >= 0){
			escreva("Digite sua idade:  ")
			leia(idade)
			escreva("Digite seu estado civil:  ")
			leia(estadocivil)

			se(idade >= 0){
				se(estadocivil == 'C'){
					casado++
					escreva("\n\n")
				}senao se(estadocivil == 'S'){
					solteiro++
					escreva("\n\n")
				}senao se(estadocivil == 'V'){
					viuvo++
					escreva("\n\n")
					somaidadeviuvos= somaidadeviuvos + idade
				}senao se(estadocivil == 'X'){
					separado++
					escreva("\n\n")
				}
				
			}senao{
				controle = -1
			}
		}

		mediaidadeviuvos = somaidadeviuvos/viuvo
		mediaidadeviuvos = mat.arredondar(mediaidadeviuvos, 2)

		total = casado + solteiro + viuvo + separado

		percentagem = (100.00*separado)/total
		percentagem = mat.arredondar(percentagem, 2)

		escreva("O total de casados é igual a:  " + casado + "\n\n")
		escreva("O total de solteiros é igual a:  " + solteiro + "\n\n")
		escreva("A média de idade dos viúvos é de:  " + mediaidadeviuvos + "\n\n")
		escreva("O percentual de separados é igual a:  " + percentagem + " %")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */