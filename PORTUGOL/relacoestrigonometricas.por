programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()	{
		const real pi = 3.1415
		real angulo = 0.0, rad = 0.0
		real seno, cos, tag
		
		escreva("Digite um Ângulo: ")
		leia(angulo)

		rad = (angulo*pi)/180

		seno = mat.seno(rad)
		seno = mat.arredondar(seno, 4)
		cos = mat.cosseno(rad)
		cos = mat.arredondar(cos, 4)
		tag = mat.tangente(rad)
		tag = mat.arredondar(tag, 4)

		

		escreva(" o seno de " + angulo + "º" + " é igual a: " + seno + "\n")
		escreva(" o Cosseno de " + angulo + "º" + " é igual a: " + cos + "\n")
		escreva(" A tangente de " + angulo + "º" + " é igual a: " + tag)

	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 147; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */