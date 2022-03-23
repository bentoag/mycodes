programa
{
	inclua biblioteca Texto-->txt
	
	funcao inicio()
	{
		cadeia palavra
		inteiro contaVocais, contaConsoantes
		escreva("Digite uma palavra:  ")
		leia(palavra)
		
		contaVocais = retornaNumeroVocais(palavra)
		contaConsoantes = retornaNumeroConsoantes(palavra)

		escreva("Numero de vocais da palavra  " + palavra + "  é igual a:  " + contaVocais+ "\n")
		escreva("Numero de consoantes da palavra  " + palavra + "  é igual a:  " + contaConsoantes)
		
	}

	funcao inteiro retornaNumeroVocais(cadeia palavra){
		inteiro qtdCaracteres = 0, contadorVocais = 0
		qtdCaracteres = txt.numero_caracteres(palavra)		

		para(inteiro i=0; i < qtdCaracteres ;i++){
			caracter letra
			letra = txt.obter_caracter(palavra, i)
			se( letra== 'a' ou letra== 'e' ou letra == 'i' ou letra == 'o'ou letra == 'u' ou
				letra== 'A' ou letra== 'E' ou letra == 'I' ou letra == 'O'ou letra == 'U') {
				contadorVocais++
			}			
		}
		retorne contadorVocais
		
	}
	funcao inteiro retornaNumeroConsoantes(cadeia palavra){
		inteiro qtdCaracteres = 0, contadorConsoantes = 0
		qtdCaracteres = txt.numero_caracteres(palavra)		

		para(inteiro i=0; i < qtdCaracteres ;i++){
			caracter letra
			letra = txt.obter_caracter(palavra, i)
			se( letra != 'a' e letra != 'e' e letra != 'i' e letra != 'o' e letra != 'u' e
				letra != 'A' e letra != 'E' e letra != 'I' e letra != 'O' e letra != 'U') {
				contadorConsoantes++
			}			
		}
		retorne contadorConsoantes
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */