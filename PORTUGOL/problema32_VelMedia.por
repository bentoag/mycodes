programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	real distancia, tempo, vm
		escreva("Qual foi a distância percorrida na viagem? :  ")
		leia(distancia)
		escreva("Qual foi o tempo gasto com a viagem? (em minutos) :  ")
		leia(tempo)
		vm = calcular_velocidadeMedia(distancia, tempo)
		vm = mat.arredondar(vm, 2)
		escreva("A velocidade média é igual a:  " + vm + "  km/h")
	}

	funcao real calcular_velocidadeMedia(real distancia, real tempoMinutos){
		real velocidadeMedia, tempoHoras

		tempoHoras = tempoMinutos/60
		velocidadeMedia = distancia/tempoHoras		
		retorne velocidadeMedia
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 389; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */