package trigonometria.bento;

public class TestaFormas {

	public static void main(String[] args) {
		Forma[] formas = new Forma[6];

		// criando um c�rculo
		double raio = 7.5;
		formas[0] = new Circulo(raio);
		// criando um quadrado
		double lado = 17;
		formas[1] = new Quadrado(lado);
		// criando um tri�ngulo
		double base = 9.7;
		double altura = 12.3;
		formas[2] = new Triangulo(base, altura);

		// criando um c�rculo
				double r = 2;
				formas[3] = new Circulo(r);
				// criando um quadrado
				double l = 2;
				formas[4] = new Quadrado(l);
				// criando um tri�ngulo
				double b = 5;
				double a= 2;
				formas[5] = new Triangulo(b, a);
		for (Forma forma : formas) {
			System.out.printf("�rea do %s: %.2f%n", forma.getClass().getName(), forma.calcularArea());
		}
	}
} // fim da classe TestaFormas
