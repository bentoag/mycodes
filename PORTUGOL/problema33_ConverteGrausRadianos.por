programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	real angulo, resultado
		escreva("Digite um ângulo (em graus):  ")
		leia(angulo)
		resultado = converter_radianos(angulo)
		resultado = mat.arredondar(resultado, 3)
		escreva("O valor em radianos é igual a:  " + resultado + " rad ")
		
	}
	funcao real converter_radianos(real angulo){
		real radianos, pi = 3.1415
		radianos = (angulo*pi)/180
		retorne radianos
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 235; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */