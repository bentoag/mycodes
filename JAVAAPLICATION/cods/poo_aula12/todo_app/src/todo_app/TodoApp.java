package todo_app;

import javax.swing.SwingUtilities;

import view.AppFrame;

public class TodoApp {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				criarMostrarGUI();				
			}
			
		});
	}
	private static void criarMostrarGUI() {
		AppFrame frame = new AppFrame();
		frame.mostrar();
	}
}//fim da classe TodoApp
