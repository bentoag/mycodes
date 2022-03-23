programa {
		
	funcao inicio() {	
		inteiro meses = 0
		real renda, valoremprestimo, parcela, saldo = 0, pgto = 0
		cadeia nomecliente
		escreva("Digite o seu nome:  ")
		leia(nomecliente)
		escreva("Digite sua renda familiar:  ")
		leia(renda)
		escreva("Digite o valor do emprestimo:  ")
		leia(valoremprestimo)
		
		se(renda <= 1045.00){
			parcela = valoremprestimo*(0.10)
			
			enquanto (meses < 10){
				
				saldo = valoremprestimo  //saldo devedor
				pgto = parcela + pgto 
				saldo = saldo - pgto
				meses++
				
				escreva( meses + "º  Mês " + ", " +  nomecliente + " você pagou: " + pgto + " seu saldo devedor é de: " + saldo +"\n\n")
			} 			
		}senao{
			escreva("Você não tem permissão para solicitar empréstimo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 525; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */