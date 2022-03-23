programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	real num1, num2, quadrado, raiz
	
		escreva("Digite o primeiro número:  ")
		leia(num1)
		escreva("Digite o segundo número: ")
		leia(num2)

		se(num1 == num2){
			escreva(" São Iguais! ")
		}senao{
			se(num1 > num2){
				raiz = mat.raiz(num1, 2)
				raiz = mat.arredondar(raiz, 3)
				quadrado = num2*num2
				escreva("A raiz de " + num1 + " é igual a:  "+raiz + "\n")
				escreva("O quadrado de " + num2 + " é igual a:  "+ quadrado)
			}senao{
				raiz = mat.raiz(num2, 2)
				raiz = mat.arredondar(raiz, 3)
				quadrado = num1*num1
				escreva("A raiz de " + num2 + " é igual a:  "+raiz+ "\n")
				escreva("O quadrado de " + num1 + " é igual a:  "+ quadrado)
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 667; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */