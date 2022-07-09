package maximo;

public class Maximo {
	public static void main(String[] args) {
		if (args.length == 1) {
			int exemplo = Integer.parseInt(args[0]);
			switch (exemplo) {
			case 1:
				System.out.printf("M�ximo �: %d%n", max(7, 9));
				break;
			case 2:
				System.out.printf("M�ximo �: %d%n", max(-1234, 12, 23, 9908293, -9908393));
				break;
			case 3:
				System.out.printf("M�ximo �: %f%n", max(2.9, 6.5));
				break;
			case 4:
				System.out.printf("M�ximo �: %f%n", max(94.2, 76.588, 33.46, -982, 12345.67));
				break;
			default:
				System.out.println("N�mero de exemplo inv�lido! Abortando.");
			} // fim do switch
		} else {
			System.out.println("N�mero do exemplo n�o informado! Abortando.");
		} // fim do if
	} // fim do m�todo main

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int max(int... numeros) {
		int max = Integer.MIN_VALUE;

		for (int num : numeros) {
			if (num > max) {
				max = num;
			}
		}

		return max;
	} // fim do m�todo max de inteiros

	public static double max(double... numeros) {
		double max = Double.MIN_VALUE;

		for (double num : numeros) {
			if (num > max) {
				max = num;
			}
		}

		return max;
	} // fim do m�todo max de doubles
}