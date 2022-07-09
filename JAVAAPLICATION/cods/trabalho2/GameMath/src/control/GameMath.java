package control;

import javax.swing.SwingUtilities;

import view.MainFrame;

public class GameMath {
	public static void main(String[] args) {
		// cria uma thread para a GUI
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createGUI();
			}
		});
		MainFrame frame = new MainFrame();

		frame.showFrame();
	}

	private static void createGUI() {

	}
} // fim da classe Gamemath