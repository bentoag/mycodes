package pi_gamemath;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class AdmFrame extends PrincipalFrame {
	
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	
	public AdmFrame() {
		super("Administrador");
		
		layout = new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();
		
		init();
	}

	private void init() {
		JLabel title;
		JLabel subtitle;
		JLabel description;
		
		//ADM
		title = new JLabel("  ADMINISTRADOR, ");
		title.setForeground(Color.RED);
		addComponent(title, 1, 1, 1, 1);
		
		//Seja bem vindo
		subtitle = new JLabel(" seja bem vindo ao GameMath! ");
		subtitle.setForeground(Color.RED);
		addComponent(subtitle, 2, 1, 1, 1);
		
		//o que deseja fazer
		description = new JLabel(" O que deseja fazer? ");
		description.setForeground(Color.BLACK);
		addComponent(description, 3, 1, 1, 1);
		
		//Bot�o add
		JButton add = new JButton("ADICIONAR QUEST�O");
		add.setBackground(Color.ORANGE);		
		addComponent(add,5, 1, 1, 1);
		add.setAlignmentX(LEFT_ALIGNMENT);
		
		//Bot�o atualizar
		JButton update = new JButton("ATUALIZAR QUEST�O");
		update.setBackground(Color.ORANGE);		
		addComponent(update,5, 2, 1, 1);
		update.setAlignmentX(RIGHT_ALIGNMENT);
		
		//Bot�o consultar
		JButton consult = new JButton("CONSULTAR QUEST�O");
		consult.setBackground(Color.ORANGE);		
		addComponent(consult,6, 1, 1, 1);
		consult.setAlignmentX(LEFT_ALIGNMENT);
		
		//Bot�o deletar
		JButton delete = new JButton("DELETAR QUEST�O");
		delete.setBackground(Color.ORANGE);		
		addComponent(delete,6, 2, 1, 1);
		delete.setAlignmentX(RIGHT_ALIGNMENT);
		

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
