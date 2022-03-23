programa
{
	
	funcao inicio()
	{
		real num1, num2, num3

		escreva("Digite o primeiro número:  ")
		leia(num1)
		escreva("Digite o segundo número:  ")
		leia(num2)
		escreva("Digite o terceiro número:  ")
		leia(num3)

		se( (num1==num2) ou (num1==num3) ou (num2==num3)){
			escreva (" ENTRADA INVÁLIDA: OS NÚMEROS TEM QUE SER DIFERENTES ")
		}senao se((num1 < num2) e (num1 < num3)){
				se (num2 < num3) {
					escreva("o menor é: " + num1 + " o do meio é: " + num2 + " e o maior é: "+num3)
				}
				senao{
					escreva("o menor é: " + num1 + " o do meio é: " + num3 + " e o maior é: "+num2)
				}
			}senao se((num2 < num1) e (num2 < num3)){
					se(num1 < num3){
						escreva("o menor é: " + num2 + " o do meio é: " + num1 + " e o maior é: "+num3)
					}senao{
						escreva("o menor é: " + num2 + " o do meio é: " + num3 + " e o maior é: "+num1)
					}
				}senao se((num3 < num1) e (num3 < num2)){
						se(num1 < num2){
							escreva("o menor é: " + num3 + " o do meio é: " + num1 + " e o maior é: "+num2)
						}senao{
							escreva("o menor é: " + num3 + " o do meio é: " + num2 + " e o maior é: "+num1)
						}
				}				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */