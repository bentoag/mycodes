package pi_gamemath;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class PlayerFrame extends PrincipalFrame {

	private GridBagLayout layout;
	private GridBagConstraints constraints;

	public PlayerFrame() {
		super("Jogador");

		layout = new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();

		init();
	}

	private void init() {
		JLabel title;
		JLabel subtitle;		

		// ADM
		title = new JLabel("  JOGADOR, ");
		title.setForeground(Color.RED);
		addComponent(title, 1, 1, 1, 1);

		// Seja bem vindo
		subtitle = new JLabel(" seja bem vindo ao GameMath! ");
		subtitle.setForeground(Color.RED);
		addComponent(subtitle, 2, 1, 1, 1);

		// Bot�o Jogar
		JButton add = new JButton("JOGAR");
		add.setBackground(Color.ORANGE);
		addComponent(add, 5, 1, 1, 1);
		add.setAlignmentX(LEFT_ALIGNMENT);
		

	}

	private void addComponent(JComponent comp, int row, int col, int width, int height) {
		constraints.gridx = col;
		constraints.gridy = row;
		constraints.gridwidth = width;
		constraints.gridheight = height;

		constraints.fill = GridBagConstraints.VERTICAL;
		constraints.anchor = GridBagConstraints.NORTH;

		layout.setConstraints(comp, constraints);
		add(comp);
	}
}