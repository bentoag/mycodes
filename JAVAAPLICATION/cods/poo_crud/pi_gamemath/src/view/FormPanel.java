package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.DataBase;
import model.MasterPanel;
import model.Question;

//classe que permite a inserção de questões preenchendo o formulario
public class FormPanel extends MasterPanel {
	private MainFrame mainFrame;
	private JLabel label;
	private JButton backButton;
	private JButton saveButton;
	private JTextArea question;
	private JTextField id;
	private JTextField answer;
	private Question qst;

	public FormPanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		setLayout(null);
		qst = null;
		start();
	}

	public void setQst(Question qst) {
		this.qst = qst;
	}

	private void start() {
		label = new JLabel("<html><b>Formulário</b></html>");
		label.setFont(new Font("Arial", Font.PLAIN, 50));
		label.setForeground(Color.ORANGE);
		addComponent(label, 500, 50, 300, 70);

		createButtons();
		createForm();
	}

	private void createButtons() {
		backButton = new JButton("VOLTAR");
		backButton.setBackground(Color.RED);
		backButton.setForeground(Color.WHITE);
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.showAdmin();
				clearFields();

			}
		});
		addComponent(backButton, 50, 50, 100, 25);

		saveButton = new JButton("SALVAR");
		saveButton.setBackground(Color.ORANGE);
		saveButton.setForeground(Color.WHITE);
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Question qst = new Question();

				if (FormPanel.this.qst == null) {
					if (question.getText().equals("") || answer.getText().equals("")) {
						JOptionPane.showMessageDialog(FormPanel.this, "Preencha os campos necessários");
					} else {
						qst.setQuestion(question.getText());
						qst.setAnswer(answer.getText());
						DataBase.insert(qst);
						JOptionPane.showMessageDialog(FormPanel.this, "Pergunta adicionada com sucesso");
						mainFrame.showAdmin();
						clearFields();
					}
				} else {
					qst.setId(Integer.parseInt(id.getText()));
					if (question.getText().equals("") || answer.getText().equals("")) {
						JOptionPane.showMessageDialog(FormPanel.this, "Preencha os campos necessários");
					} else {
						qst.setQuestion(question.getText());
						qst.setAnswer(answer.getText());
						DataBase.update(qst);
						JOptionPane.showMessageDialog(FormPanel.this, "Pergunta adicionada com sucesso");
						mainFrame.showAdmin();
						clearFields();
					}
				}
			}
		});
		addComponent(saveButton, 550, 480, 200, 50);
	}

	private void createForm() {
		label = new JLabel("ID");
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		addComponent(label, 180, 250, 300, 25);
		id = new JTextField(4);
		id.setEditable(false);
		addComponent(id, 300, 240, 700, 50);

		label = new JLabel("Questão");
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		addComponent(label, 180, 310, 300, 25);
		question = new JTextArea(5, 30);
		JScrollPane scrollPane = new JScrollPane(question);
		addComponent(scrollPane, 300, 300, 700, 50);

		label = new JLabel("Resposta");
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		addComponent(label, 180, 370, 300, 25);
		answer = new JTextField(50);
		addComponent(answer, 300, 360, 700, 50);
	}

	private void clearFields() {
		id.setText("");
		question.setText("");
		answer.setText("");
	}

	public void setFields() {
		if (qst != null) {
			id.setText(Integer.toString(qst.getId()));
			question.setText(qst.getQuestion());
			answer.setText(qst.getAnswer());
		}
	}

}
