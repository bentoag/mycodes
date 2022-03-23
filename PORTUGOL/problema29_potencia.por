programa
{
	
	funcao inicio(){
		inteiro b, n
		
		escreva("Digite o valor da base:  ")
		leia(b)
		escreva("Digite o valor do expoente:  ")
		leia(n)

		se((b>=2) e (n>1)){
			inteiro resultado = 1
			para(inteiro i=1; i<=n;i++){
				resultado= resultado*b
			}
			escreva(b + "^"+ n + " = " + resultado)
		}senao{
		  escreva(" O valor da base deve ser maior ou igual a 2 e o valor do expoente deve ser maior que 1. ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 257; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */