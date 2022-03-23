programa
{
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{	
		real raio, perimetro, area
		escreva("Digite o valor do Raio (em metros):  ")
		leia(raio)
		area = calcular_area(raio)
		area = mat.arredondar(area, 2)
		perimetro = calcular_perimetro(raio)
		perimetro = mat.arredondar(perimetro, 2)

		escreva("A área da circunferência é igual a:  " + area +"\n")
		escreva("O perimetro da circunferência é igual a:  " + perimetro)
	}

	funcao real calcular_area(real raio){
		real pi = 3.1415, area
		area = pi*(raio*raio)
		retorne area
	}
	funcao real calcular_perimetro (real raio){
		real pi = 3.1415, perimetro
		perimetro = 2*pi*raio
		retorne perimetro
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */