programa
{
	inclua biblioteca Tipos -->tp
	inclua biblioteca Matematica --> mat
	inclua biblioteca Texto --> txt
	
	funcao inicio() {
		cadeia binario = ""	
		//variaveis de teste
		cadeia duzentosecinquentaecinco, zero, centoeseis, numerodigitado
		
		escreva("BEM-VINDO AO CONVERSOR BINÁRIO DICIMAL!" + "\n\n")
		escreva ("Digite um valor em binário (8 bits):  ")
		leia(binario)

		//testes: passando numeros conhecidos para a função
		duzentosecinquentaecinco = conveterBinarioDecimal("11111111")
		zero = conveterBinarioDecimal("00000000")
		centoeseis = conveterBinarioDecimal("01101010")

		//passando o numero que o usuario vai digitar
		numerodigitado = conveterBinarioDecimal(binario)

		//verificando o resultado dos testes
		escreva(duzentosecinquentaecinco + "\n")
		escreva(zero + "\n")
		escreva(centoeseis + "\n")
		escreva(numerodigitado)		
		
		
				
	}

	funcao cadeia conveterBinarioDecimal (cadeia numero){
		caracter primeiroDigito = ' ', segundoDigito = ' ', terceiroDigito =' ', quartoDigito = ' ',
			    quintoDigito = ' ', sextodigito = ' ', setimoDigito = ' ', oitavoDigito = ' '
		inteiro valorPrimeiroDigito, valorSegundoDigito, valorTerceiroDigito, valorQuartoDigito,
			   valorQuintoDigito, valorSextoDigito, valorSetimoDigito,valorOitavoDigito
		real potenciaPrimeiroDigito=0.0, potenciaSegundoDigito=0.0, potenciaTerceiroDigito=0.0, potenciaQuartoDigito=0.0,
			potenciaQuintoDigito=0.0, potenciaSextoDigito=0.0, potenciaSetimoDigito=0.0, potenciaOitavoDigito=0.0
		inteiro digitoUm =0,digitoDois=0, digitoTres=0, digitoQuatro=0, digitoCinco=0, digitoSeis=0,
			   digitoSete=0, digitoOito=0, resultado = 0
			   
		se(txt.numero_caracteres(numero) == 8){

			//separando e convertendo em inteiro cada digito
			primeiroDigito = txt.obter_caracter(numero, 0)
			valorPrimeiroDigito = tp.caracter_para_inteiro(primeiroDigito)
			potenciaPrimeiroDigito = valorPrimeiroDigito*(mat.potencia(2.0, 7.0))	
			digitoUm = tp.real_para_inteiro(potenciaPrimeiroDigito)

			segundoDigito = txt.obter_caracter(numero, 1)
			valorSegundoDigito = tp.caracter_para_inteiro(segundoDigito)
			potenciaSegundoDigito = valorSegundoDigito*(mat.potencia(2.0, 6.0))
			digitoDois = tp.real_para_inteiro(potenciaSegundoDigito)
			
			terceiroDigito = txt.obter_caracter(numero, 2)
			valorTerceiroDigito = tp.caracter_para_inteiro(terceiroDigito)
			potenciaTerceiroDigito = valorTerceiroDigito*(mat.potencia(2.0, 5.0))
			digitoTres = tp.real_para_inteiro(potenciaTerceiroDigito)
			
			
			quartoDigito = txt.obter_caracter(numero, 3)
			valorQuartoDigito = tp.caracter_para_inteiro(quartoDigito)
			potenciaQuartoDigito = valorQuartoDigito*(mat.potencia(2.0, 4.0))
			digitoQuatro = tp.real_para_inteiro(potenciaQuartoDigito)
			
			quintoDigito = txt.obter_caracter(numero, 4)
			valorQuintoDigito = tp.caracter_para_inteiro(quintoDigito)
			potenciaQuintoDigito = valorQuintoDigito*(mat.potencia(2.0, 3.0))
			digitoCinco = tp.real_para_inteiro(potenciaQuintoDigito)
			
			sextodigito = txt.obter_caracter(numero, 5)
			valorSextoDigito = tp.caracter_para_inteiro(sextodigito)
			potenciaSextoDigito = valorSextoDigito*(mat.potencia(2.0, 2.0))
			digitoSeis = tp.real_para_inteiro(potenciaSextoDigito)
			
			setimoDigito = txt.obter_caracter(numero, 6)
			valorSetimoDigito = tp.caracter_para_inteiro(setimoDigito)
			potenciaSetimoDigito = valorSetimoDigito*(mat.potencia(2.0, 1.0))
			digitoSete = tp.real_para_inteiro(potenciaSetimoDigito)
			
			oitavoDigito = txt.obter_caracter(numero, 7)
			valorOitavoDigito = tp.caracter_para_inteiro(oitavoDigito)
			potenciaOitavoDigito = valorOitavoDigito*(mat.potencia(2.0, 0.0))
			digitoOito = tp.real_para_inteiro(potenciaOitavoDigito)

			se((valorPrimeiroDigito != 0 e valorPrimeiroDigito != 1) ou (valorSegundoDigito!=0 e valorSegundoDigito!=1) ou 
			   (valorTerceiroDigito!=0 e valorTerceiroDigito!=1) ou (valorQuartoDigito!=0 e valorQuartoDigito!=1) ou 
			   (valorQuintoDigito!=0 e valorQuintoDigito!=1) ou (valorSextoDigito!=0 e valorSextoDigito!=1) ou
			   (valorSetimoDigito!=0 e valorSetimoDigito!=1) ou (valorOitavoDigito!=0 e valorOitavoDigito!=1)){
				retorne "O número informado " + numero + " não é binário, algum digito diferente de 0 ou 1"
			}senao{
				resultado = digitoUm + digitoDois + digitoTres + digitoQuatro + digitoCinco + digitoSeis + digitoSete + digitoOito
				retorne "O número " + numero+ " convertido para decimal é igual a: " + resultado
			}					  
		
		}senao{
			retorne "Número inválido, não contém 8 bits."
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */