programa
{
	
	funcao inicio()
	{
		cadeia tipo = " "
		real distancia, consumo

		escreva("Digite o tipo de carro:  ")
		leia(tipo)
		escreva("Qual foi a distencia percorrida:  ")
		leia(distancia)

		se((tipo == "A") ou (tipo == "a")){
			consumo = distancia/12
			escreva("Seu consumo foi de " + consumo + " Litros")			
		} senao se ((tipo == "B") ou (tipo == "b")){
			consumo = distancia/9
			escreva("Seu consumo foi de " + consumo + " Litros")			
		} senao se ((tipo == "C") ou (tipo == "c")) {
			consumo = distancia/8
			escreva("Seu consumo foi de " + consumo + " Litros")			
		}senao{
			escreva ("TIPO DE CARRO NÃO ENCONTRADO")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */