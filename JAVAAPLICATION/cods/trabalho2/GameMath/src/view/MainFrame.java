package view;

import java.awt.CardLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Question;

//classe define janela padrao
public class MainFrame extends JFrame {
	public static final String TITLE = "GameMath";

	private CardLayout layout;
	private JPanel cardsPanel;

	private HomePanel homePanel;
	private LoginPanel loginPanel;
	private AdminPanel adminPanel;
	private FormPanel formPanel;

	private boolean isAdmin = false;

	public MainFrame() {
		super(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //opcao para fechamento da janela

		layout = new CardLayout();
		cardsPanel = new JPanel();
		cardsPanel.setLayout(layout);
		add(cardsPanel);

		createFrame();
		createCards();
		}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	private void createFrame() {

		setSize(1280, 768); //tamanho da tela
		setTitle("GameMath");
		setResizable(false);
	}
	
	private void createCards() {
		
		homePanel = new HomePanel(this);
		cardsPanel.add(homePanel, HomePanel.class.getName());

		loginPanel = new LoginPanel(this);
		cardsPanel.add(loginPanel, LoginPanel.class.getName());

		adminPanel = new AdminPanel(this);
		cardsPanel.add(adminPanel, AdminPanel.class.getName());

		formPanel = new FormPanel(this);
		cardsPanel.add(formPanel, FormPanel.class.getName());
	}

	public void showFrame() {
		setLocationRelativeTo(null); // define a localizacao da janela com relacao aos componentes --> null fica no centro
		setVisible(true);
	}

	public void showLogin() {
		layout.show(cardsPanel, LoginPanel.class.getName());
	}

	public void showHome() {
		layout.show(cardsPanel, HomePanel.class.getName());
	}

	public void showAdmin() {
		adminPanel.reload();
		layout.show(cardsPanel, AdminPanel.class.getName());
	}

	public void showForm(Question question) {
		formPanel.setQst(question);
		formPanel.setFields();
		layout.show(cardsPanel, FormPanel.class.getName());
	}

}// fim da classe MainFrame