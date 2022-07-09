package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class InicialPanel extends JPanel {
	private JButton tarefasBtn;
	private AppFrame frame;
	
	public InicialPanel(AppFrame frame) {
		this.frame = frame;
		
		tarefasBtn = new JButton("Tarefas");		
		tarefasBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.mostrarListaTarefas();				
			}
		} );
		
		add(tarefasBtn);
	}
}
