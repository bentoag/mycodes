programa
{
	
	funcao inicio()
	{
		real num1, num2, num3, maior, menor

		escreva("Digite o primeiro numero: ")
		leia(num1)
		escreva("Digite o segundo numero: ")
		leia(num2)
		escreva("Digite o terceiro numero: ")
		leia(num3)

		//descobrindo o maior
		se(num1 > num2){
			se(num1 > num3){
				maior = num1
			}senao{
				maior = num3
			}
		}senao{ 
			se(num2>num3){
				maior = num2
			}senao{
				maior = num3
			}			
		}

		//descobrindo o menor
		se(num1 < num2){
			se(num1 < num3){
				menor = num1
			}senao{
				menor = num3
			}
		}senao{
			se(num2 < num3){
				menor = num2
			}senao{
				menor = num3
			}
		}	

	//se houver igualdade
	se(num1 == num2) {
		se(num1 == num3){
			escreva("Os números são IGUAIS")
			retorne
		}senao{
			se (num1 > num3){
				maior = num1
				menor = num3 
			}senao{
				maior = num3
				menor = num1
			}			
		}
	}
	
			escreva("O maior é: " + maior + "\n")
			escreva("O menor é: " + menor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 805; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */