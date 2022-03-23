programa
{
	
	funcao inicio()
	{
		cadeia opcao = " "
		real adicao, subtracao, multiplicacao, divisao, num1, num2

		escreva("Digite a operação: Para adição ('+'), Para Subtração ('-'), Para Multiplicação ('*'), Para divisão ('/'): ")
		leia(opcao)

		se (opcao == "+"){
			escreva("Digite o primeiro numero: ")
			leia(num1)
			escreva("Digite o segundo numero: ")
			leia(num2)

			adicao = num1 + num2

			escreva(" A soma de " + num1 + " + " + num2 + " = " + adicao)
			
		} senao se (opcao == "-"){

			escreva("Digite o primeiro numero: ")
			leia(num1)
			escreva("Digite o segundo numero: ")
			leia(num2)

			subtracao = num1 - num2

			escreva(" A subtração de " + num1 + " - " + num2 + " = " + subtracao)
			
		} senao se (opcao == "*") {
			escreva("Digite o primeiro numero: ")
			leia(num1)
			escreva("Digite o segundo numero: ")
			leia(num2)

			multiplicacao = num1 * num2

			escreva(" A multiplicação de " + num1 + " x " + num2 + " = " + multiplicacao)
		} senao se (opcao == "/"){
			escreva("Digite o primeiro numero: ")
			leia(num1)
			escreva("Digite o segundo numero: ")
			leia(num2)

			divisao = num1 / num2

			escreva(" A divisão de " + num1 + " / " + num2 + " = " + divisao)
		}senao{
			escreva ("Opção inválida, tente novamente!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 891; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */