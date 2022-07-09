package pi_gamemath;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class StartFrame extends PrincipalFrame {

	private GridBagLayout layout;
	private GridBagConstraints constraints;
	
	public StartFrame() {
		super("Inicio");
		
		layout = new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();
		
		init();
	}
	
	public void init() {
		JLabel title;
		JLabel subtitle;
		JLabel description;
		//Titulo GameMath
		title = new JLabel("  GAMEMATH  ");
		title.setForeground(Color.ORANGE);
		addComponent(title, 1, 1, 1, 1);
		
		//Seja bem vindo
		subtitle = new JLabel(" SEJA VEM VINDO! ");
		subtitle.setForeground(Color.RED);
		addComponent(subtitle, 2, 1, 1, 1);
		
		//tipo de usuario
		description = new JLabel(" Escolha seu tipo de usu�rio! ");
		description.setForeground(Color.BLACK);
		addComponent(description, 3, 1, 1, 1);

		//Bot�o adm
		JButton adm = new JButton("ADMINISTRADOR");
		adm.setBackground(Color.ORANGE);		
		addComponent(adm,5, 1, 1, 1);
		adm.setAlignmentX(LEFT_ALIGNMENT);
		
		//Bot�o jogador
		JButton jogador = new JButton("JOGADOR");
		jogador.setBackground(Color.ORANGE);		
		addComponent(jogador,5, 2, 1, 1);
		jogador.setAlignmentX(RIGHT_ALIGNMENT);
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