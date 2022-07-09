package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.Answer;
import model.AnswerDataBase;
import model.MasterPanel;
import model.Question;
import model.QuestionDataBase;
import model.Table;

public class AdminPanel extends MasterPanel {

	public AdminPanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		setLayout(null);
		start();
	}

	private MainFrame mainFrame;

	private JTable table;
	private Table gameMathTable;

	private JButton backButton;
	private JButton addButton;
	private JButton updateButton;
	private JButton deleteButton;
	private JLabel label;

	private void start() {

		label = new JLabel("<html><b>Bem-vindo, Administrador</b></html>");
		label.setFont(new Font("Arial", Font.PLAIN, 18));
		label.setForeground(Color.RED);
		addComponent(label, 180, 50, 300, 25);

		createButtons();
		disableButtons();
		createTable();
	}

	private void createTable() {
		gameMathTable = new Table(QuestionDataBase.list());

		table = new JTable(gameMathTable);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					if (table.getSelectedRow() >= 0) {
						enableButtons();
					} else {
						disableButtons();
					}
				}
			}
		});

		JScrollPane scrollPane = new JScrollPane(table);
		addComponent(scrollPane, 1, 160, 1262, 568);
	}

	private void createButtons() {

		addButton = new JButton("Adicionar Questao");
		addButton.setBackground(Color.ORANGE);
		addButton.setForeground(Color.WHITE);
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.showForm(null);
			}
		});
		addComponent(addButton, 180, 80, 200, 50);

		updateButton = new JButton("Atualizar Questao");
		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Question question = gameMathTable.getQuestion(table.getSelectedRow());
				List<Answer> answersList = new ArrayList<>();
				mainFrame.showForm(question);
			}
		});
		addComponent(updateButton, 560, 80, 200, 50);

		deleteButton = new JButton("Remover Questao");
		deleteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(AdminPanel.this, "REMOVER QUESTAO?", mainFrame.TITLE,
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (option == JOptionPane.YES_NO_OPTION) {
					Question question = gameMathTable.getQuestion(table.getSelectedRow());
					List<Answer> ans = new ArrayList<>();
					ans = AnswerDataBase.list(question.getId());
					for (int i = 0; i < ans.size(); i++) {
						if (!AnswerDataBase.delete(ans.get(i))) {
							JOptionPane.showMessageDialog(AdminPanel.this,
									"Ocorreu um erro inesperado, contate o administrador!");
							i = ans.size();
						}
					}
					QuestionDataBase.delete(question);
					reload();
				}
			}
		});
		addComponent(deleteButton, 930, 80, 200, 50);

		backButton = new JButton("VOLTAR");
		backButton.setBackground(Color.RED);
		backButton.setForeground(Color.WHITE);
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.showLogin();
			}
		});
		addComponent(backButton, 50, 50, 100, 25);
	}

	private void enableButtons() {
		deleteButton.setBackground(Color.ORANGE);
		deleteButton.setForeground(Color.WHITE);
		updateButton.setBackground(Color.ORANGE);
		updateButton.setForeground(Color.WHITE);
		updateButton.setEnabled(true);
		deleteButton.setEnabled(true);
	}

	private void disableButtons() {
		deleteButton.setBackground(Color.LIGHT_GRAY);
		deleteButton.setForeground(Color.WHITE);
		updateButton.setBackground(Color.LIGHT_GRAY);
		updateButton.setForeground(Color.WHITE);
		updateButton.setEnabled(false);
		deleteButton.setEnabled(false);
	}

	public void reload() {
		gameMathTable.load(QuestionDataBase.list());
	}

}