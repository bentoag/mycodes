programa
{	
	funcao inicio() {
		inteiro limsuperior = 0, liminferior = 0, decremento = 0, celsius = 0
		
		escreva("Para fazer a conversão de Graus Celsius-Fahrenheit Informe: \n\n")
		escreva("Qual o limite superior:  ")
		leia(limsuperior)
		escreva("Qual o limite inferior:  ")
		leia(liminferior)
		escreva("Qual o decremento:  ")
		leia(decremento)
		escreva("\n")

		para(inteiro f = limsuperior; f>=liminferior; f= f-decremento){
			celsius = 5*(f-32)/9
			escreva( f + " Fahrenheit " + " = " + celsius + " Celsius" + "\n\n")
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */