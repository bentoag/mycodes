package view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Tarefa;

public class AppFrame extends JFrame {

	public static final String TITULO = "TODO App";
	
	//trocar de layout
	private CardLayout layout;
	private JPanel cardsPanel;
	
	//minhas telas "panel"
	private InicialPanel inicialPanel;
	private TarefaListPanel tarefaListPanel;
	private TarefaFormPanel tarefaFormPanel;
	
	public AppFrame() {
		super(TITULO);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		layout = new CardLayout();
		cardsPanel = new JPanel();
		cardsPanel.setLayout(layout);
		add(cardsPanel);
		
		criarCards();
	}
	
	private void criarCards() {
		inicialPanel = new InicialPanel(this);
		cardsPanel.add(inicialPanel, InicialPanel.class.getName());
		
		tarefaListPanel = new TarefaListPanel(this);
		cardsPanel.add(tarefaListPanel, TarefaListPanel.class.getName());
		
		tarefaFormPanel = new TarefaFormPanel(this);
		cardsPanel.add(tarefaFormPanel, TarefaFormPanel.class.getName());
	}

	public void mostrar() {
		pack();
		setLocationRelativeTo(null); //janela aparece no centro
		setVisible(true);
	}
	
	public void mostrarListaTarefas() {
		tarefaListPanel.recarregar();
		layout.show(cardsPanel, TarefaListPanel.class.getName());
	}
	
	public void mostrarFromTarefas(Tarefa tarefa) {
		tarefaFormPanel.setTarefa(tarefa);
		layout.show(cardsPanel, TarefaFormPanel.class.getName());
	}
}//fim da classe AppFrame
