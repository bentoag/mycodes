programa
{
	
	funcao inicio()
	{
		cadeia estado = " "
		
		escreva("Digite o seu Estado:  ")
		leia(estado)

		se ((estado == "RJ") ou (estado == "rj")){
			escreva(" Carioca ")
		} senao se ((estado == "SP") ou (estado == "sp")){
			escreva(" Paulista ")
		} senao se ((estado == "MG") ou (estado == "mg")){
			escreva(" Mineiro ")
		} senao{
			escreva(" Outros Estados ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */