package pi_gamemath;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.management.ObjectName;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class LoginFrame extends PrincipalFrame{
	private static final Insets FIELD_INSETS = new Insets(5, 10, 15, 0);
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	
	public LoginFrame() {
		super("Login");
		JPanel contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		
		layout = new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();
		
		
		init();
		
		
	}

	private void init() {
		
		JLabel label;
		
		JButton voltar = new JButton("VOLTAR");
		voltar.setBackground(Color.RED);
		addComponent(voltar,0,0, 1, 1);
		voltar.setAlignmentY(TOP_ALIGNMENT);
		
		//usuario
		label = new JLabel("LOGIN ");
		label.setForeground(Color.GRAY);
		label.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		addComponent(label, 0, 1, 1, 1);
		
		JTextField userText = new JTextField(30);
		addComponent(userText, 1, 1, 1, 1);
		
		PlaceholderTextField placeholderUser = new  PlaceholderTextField();
		placeholderUser.setPlaceholder("UUUUU");
		
		//Senha
			
		JPasswordField password = new JPasswordField(30);
		addComponent(password, 5, 1, 3, 1);
		password.setText("");
		
		//login
		label = new JLabel();
		addComponent(label, 10, 0, 1, 1);
		JButton entrar = new JButton("ENTRAR");
		entrar.setBackground(Color.ORANGE);
		addComponent(entrar, 15, 4, 1, 1);
		entrar.setAlignmentX(CENTER_ALIGNMENT);
		
		
	}
	
	private void addComponent(JComponent comp, int row, int col, int width, int height) {
		constraints.gridx = col;
		constraints.gridy = row;
		constraints.gridwidth = width;
		constraints.gridheight = height;

		constraints.fill = GridBagConstraints.HORIZONTAL; //redimensionar horizontalmente
		constraints.insets = FIELD_INSETS;
		constraints.anchor = GridBagConstraints.NORTH; //centralizado horizontalmente

		layout.setConstraints(comp, constraints);
		add(comp);
	}
	
}
