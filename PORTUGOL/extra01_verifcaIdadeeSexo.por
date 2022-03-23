programa
{
	
	funcao inicio()
	{	
		cadeia nome = " "
		inteiro idade = 0
		caracter sexo = ' '
		
		escreva("Digite seu nome:  ")
		leia(nome)
		escreva ("Digite seu sexo (ex: M-Masculino e F-feminino):  ")
		leia(sexo)
		escreva( "Digite sua idade:  ")
		leia(idade)

		se(((sexo=='f' ou sexo=='F') e (idade < 25) e (idade >= 0))) {
			escreva( nome+ " Aceita")
		}senao{
			escreva (nome+ " Não aceita")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */