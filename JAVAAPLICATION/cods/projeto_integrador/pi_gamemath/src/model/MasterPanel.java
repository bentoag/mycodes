package model;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class MasterPanel extends JPanel {

	public void addComponent(JComponent component, int row, int col, int width, int height) {
		//setBounds coloca o componente no canto superior esquerdo
		component.setBounds(row, col, width, height);
		add(component);
	}

}
