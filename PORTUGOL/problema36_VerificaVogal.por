programa
{
	inclua biblioteca Texto-->txt
	
	funcao inicio()
	{
		cadeia palavra, ehVocal = " "
		escreva("Digite uma palavra:  ")
		leia(palavra)
		ehVocal = verificaVocal(palavra)
		escreva(ehVocal)
	}

	funcao cadeia verificaVocal (cadeia palavra){
		cadeia primeiraLetra = " "		
		primeiraLetra = txt.extrair_subtexto(palavra, 0, 1)

		se(primeiraLetra == "a" ou primeiraLetra == "A" ou primeiraLetra == "e" ou primeiraLetra == "E" ou
		   primeiraLetra == "i" ou primeiraLetra == "I" ou primeiraLetra == "o" ou primeiraLetra == "O" ou
		   primeiraLetra == "u" ou primeiraLetra == "U"){
		   	retorne " A palavra começa por uma vogal. "
		   }senao{
		   	retorne "A palavra NÃO começa por uma vogal. "
		   }

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 200; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */