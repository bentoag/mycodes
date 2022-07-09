package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.MasterPanel;

public class LoginPanel extends MasterPanel {
	private MainFrame mainFrame;

	private JButton enterButton;
	private JButton backButton;
	private JLabel label;
	private JTextField textFieldUser;
	private JTextField textFieldPassw;

	public LoginPanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		setLayout(null);
		start();
	}

	private void start() {
		label = new JLabel("<html><b>GAMEMATH</b></html>");
		label.setFont(new Font("Arial", Font.PLAIN, 50));
		label.setForeground(Color.ORANGE);
		addComponent(label, 540, 150, 300, 50);

		label = new JLabel("<html><b>LOGIN</b></html>");
		label.setFont(new Font("Arial", Font.PLAIN, 35));
		label.setForeground(Color.DARK_GRAY);
		addComponent(label, 630, 250, 300, 50);

		enterButton = new JButton("ENTRAR");
		enterButton.setBackground(Color.ORANGE);
		enterButton.setForeground(Color.WHITE);
		enterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.showAdmin();
				mainFrame.setIsAdmin(true);
			}
		});
		addComponent(enterButton, 590, 512, 200, 50);

		textFieldUser = new JTextField("Usuário");
		textFieldUser.setHorizontalAlignment(textFieldUser.CENTER);
		textFieldUser.setForeground(Color.GRAY);
		textFieldUser.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldUser.getText().isEmpty()) {
					textFieldUser.setForeground(Color.GRAY);
					textFieldUser.setText("Usuário");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (textFieldUser.getText().equals("Usuário")) {
					textFieldUser.setText("");
					textFieldUser.setForeground(Color.BLACK);
				}

			}
		});
		addComponent(textFieldUser, 540, 330, 300, 50);

		textFieldPassw = new JTextField("Senha");
		textFieldPassw.setHorizontalAlignment(textFieldPassw.CENTER);
		textFieldPassw.setForeground(Color.GRAY);
		textFieldPassw.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldPassw.getText().isEmpty()) {
					textFieldPassw.setForeground(Color.GRAY);
					textFieldPassw.setText("Senha");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (textFieldPassw.getText().equals("Senha")) {
					textFieldPassw.setText("");
					textFieldPassw.setForeground(Color.BLACK);
				}

			}
		});
		addComponent(textFieldPassw, 540, 420, 300, 50);

		backButton = new JButton("VOLTAR");
		backButton.setBackground(Color.RED);
		backButton.setForeground(Color.WHITE);
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.showHome();
			}
		});
		addComponent(backButton, 50, 50, 100, 25);
	}

}
