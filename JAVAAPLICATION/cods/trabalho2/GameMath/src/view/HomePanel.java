package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePanel extends JPanel {
	private MainFrame mainFrame;

	private JButton adminButton;
	private JButton playerButton;
	private JLabel label;

	public HomePanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		setLayout(null);
		start();
	}

	private void start() {
		label = new JLabel("<html><b>GAMEMATH</b></html>");
		label.setFont(new Font("Arial", Font.PLAIN, 50));
		label.setForeground(Color.ORANGE);
		addComponent(label, 520, 150, 500, 50);

		label = new JLabel("<html><b>SEJA BEM-VINDO</b></html>");
		label.setFont(new Font("Arial", Font.PLAIN, 30));
		label.setForeground(Color.RED);
		addComponent(label, 550, 250, 300, 50);

		label = new JLabel("<html><b>Escolha seu tipo de usuario</b></html>");
		label.setFont(new Font("Arial", Font.PLAIN, 22));
		addComponent(label, 515, 370, 500, 50);

		adminButton = new JButton("ADMINISTRADOR");
		adminButton.setBackground(Color.ORANGE);
		adminButton.setForeground(Color.WHITE);
		adminButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.showLogin();
				mainFrame.setIsAdmin(true);
			}
		});
		addComponent(adminButton, 384, 512, 200, 50);

		playerButton = new JButton("PLAYER");
		playerButton.setBackground(Color.ORANGE);
		playerButton.setForeground(Color.WHITE);
		playerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				mainFrame.showLogin();
//				mainFrame.setIsAdmin(false);
			}
		});
		addComponent(playerButton, 768, 512, 200, 50);
	}

	private void addComponent(JComponent component, int row, int col, int width, int height) {
		component.setBounds(row, col, width, height);
		add(component);
	}

}// fim da classe Home