import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);
		boolean repetir = true;		
		
		do {
			try {
				System.out.print("Informe um numerador inteiro: ");
				int numerador = input.nextInt();
				System.out.print("Informe um denominador inteiro: ");
				int denominador = input.nextInt();
				
				if(numerador < denominador) {
					Principal.biggestDenominator();						
				}else {
					int quociente = Calculadora.dividir(numerador, denominador);
					System.out.printf("Resultado: %d / %d = %d%n", numerador, denominador, quociente);
				}						
				
				repetir = false;
				
			}catch (OwnFractionException myException){
				System.out.print("Est� � uma fra��o pr�pria! Resultado menor que 1, n�o podemos apresent�-lo. \n\n");
			} catch (InputMismatchException inputMismatchException) {
				//System.err.printf("%nExce��o: %s%n", inputMismatchException);
				input.nextLine(); // descartar o restante da entrada
				System.out.print("Apenas n�mero inteiros s�o permitidos!\n\n");
			}catch (ArithmeticException arithmeticException) {
				//System.err.printf("%nExce��o: %s%n", arithmeticException);
				System.out.print("Zero � um denominador inv�lido!\n\n");
			}
		} while (repetir);
	}//fim do metodo main
	
	public static void biggestDenominator() throws OwnFractionException{
		throw new OwnFractionException("Est� � uma fra��o impr�pria. O numerador � maior que o denominador");
		
	}
}//fim da classe Principal

