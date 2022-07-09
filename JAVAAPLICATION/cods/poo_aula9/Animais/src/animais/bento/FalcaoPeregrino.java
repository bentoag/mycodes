package animais.bento;

public class FalcaoPeregrino extends Animal {

	private static final int VELOCIDADE_KMH = 390;

	@Override
	public void mover(int segundos) {
		if (segundos > 0) {
			somaMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);

			System.out.printf("O falcão peregrino voou %.1f metros.%n", getMetrosPercorridos());
		}
	}
}
