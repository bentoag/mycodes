programa
{
	
	funcao inicio()
	{	inteiro numero, fatorial = 1, contador = 0
		
		escreva("Digite um nº para calcular o fatorial:  ")
		leia(numero)

		contador = numero

		se (numero > 0){
			enquanto (contador > 1){
			fatorial = fatorial*contador
			contador--			
			}			
		}senao se (numero == 0){
			fatorial = 1
		}senao{
			escreva("Não é permitido fatorial de nº negativo")
			retorne
		}
		
		escreva ("O fatorial de " + numero + " é igual a:  " + fatorial)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */