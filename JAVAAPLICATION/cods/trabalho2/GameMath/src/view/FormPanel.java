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
import javax.swing.JTextArea;
import javax.swing.JTextField;

import control.Validator;
import control.ValidatorIsBlank;
import control.ValidatorIsNumber;
import model.Answer;
import model.AnswerDataBase;
import model.MasterPanel;
import model.Question;
import model.QuestionDataBase;

//classe que permite a insercao de questoes preenchendo o formulario
public class FormPanel extends MasterPanel {
	private MainFrame mainFrame;
	private JLabel label;
	private JButton backButton;
	private JButton saveButton;
	private JTextArea question;
	private JTextField id;
	private JTextField correctAnswer;
	private JTextField incorrectAnswer1;
	private JTextField incorrectAnswer2;
	private JTextField incorrectAnswer3;
	private Question qst;
	private List<Answer> ans = new ArrayList<>();

	public void setQst(Question qst) {
		this.qst = qst;
		if (this.qst != null)
			ans = AnswerDataBase.list(qst.getId());
	}

	public FormPanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		setLayout(null);
		qst = null;

		start();
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public JTextField getId() {
		return id;
	}

	public JTextArea getQuestion() {
		return question;
	}

	public JTextField getAnswer() {
		return correctAnswer;
	}

	public Question getQst() {
		return qst;
	}

	private void start() {
		label = new JLabel("<html><b>Formulario</b></html>");
		label.setFont(new Font("Arial", Font.PLAIN, 50));
		label.setForeground(Color.ORANGE);
		addComponent(label, 500, 50, 500, 70);

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
				List<Answer> ans = new ArrayList<>();
				for (int i = 0; i < 4; i++) {
					ans.add(new Answer());
				}

				Validator[] validator = new Validator[2];
				validator[0] = new ValidatorIsBlank(question.getText(), correctAnswer.getText(),
						incorrectAnswer1.getText(), incorrectAnswer2.getText(), incorrectAnswer3.getText());
				validator[1] = new ValidatorIsNumber(question.getText(), correctAnswer.getText(),
						incorrectAnswer1.getText(), incorrectAnswer2.getText(), incorrectAnswer3.getText());
				//campos vazios (chama isBlank)
				if (validator[0].validate()) {
					JOptionPane.showMessageDialog(FormPanel.this, "Preencha os campos necessarios");
				} else {
					/*chama IsNumber verifica se nas respostas tem apenas numeros
							e a pergunta esta preenchida */
					if (validator[1].validate()) {
						qst.setQuestion(question.getText());
						qst.setAnswers(ans);
						fillAnswerList(ans);
						JOptionPane.showMessageDialog(FormPanel.this, "Banco de dados atualizado");
						clearFields();
					} else {
						JOptionPane.showMessageDialog(FormPanel.this,
								"Verifique a consistencia dos dados informados! [Questao literal e resposta numerica]");
					}
				}

				if (FormPanel.this.qst == null && !validator[0].validate() && validator[1].validate()) {
					if(!QuestionDataBase.insert(qst)) JOptionPane.showMessageDialog(FormPanel.this, "Ocorreu um erro inesperado, contate o administrador!");						
					insertAnswers(ans);
					mainFrame.showAdmin();
				} else if (!validator[0].validate() && validator[1].validate()) {
					qst.setId(FormPanel.this.qst.getId());
					if (!QuestionDataBase.update(qst)) JOptionPane.showMessageDialog(FormPanel.this, "Ocorreu um erro inesperado, contate o administrador!");
					updateAnswers(ans);
					mainFrame.showAdmin();
				}
			}
		});
		addComponent(saveButton, 550, 550, 200, 50);
	}

	private void fillAnswerList(List<Answer> ans) {
		for (int i = 0; i < ans.size(); i++) {
			if (i == 0) {
				ans.get(i).setCorrect(true);
			} else
				ans.get(i).setCorrect(false);
		}
		ans.get(0).setAnswer(correctAnswer.getText());
		ans.get(1).setAnswer(incorrectAnswer1.getText());
		ans.get(2).setAnswer(incorrectAnswer2.getText());
		ans.get(3).setAnswer(incorrectAnswer3.getText());
	}

	private void insertAnswers(List<Answer> ans) {
		for (int i = 0; i < ans.size(); i++) {
			ans.get(i).setQuestion_id(QuestionDataBase.getLastQuestionId());
			if (!AnswerDataBase.insert(ans.get(i))) JOptionPane.showMessageDialog(FormPanel.this, "Ocorreu um erro inesperado, contate o administrador!");
		}
	}

	private void updateAnswers(List<Answer> ans) {
		for (int i = 0; i < ans.size(); i++) {
			ans.get(i).setQuestion_id(FormPanel.this.qst.getId());
			ans.get(i).setId(FormPanel.this.ans.get(i).getId());
			if (!AnswerDataBase.update(ans.get(i))) JOptionPane.showMessageDialog(FormPanel.this, "Ocorreu um erro inesperado, contate o administrador!");
		}
	}

	private void createForm() {
		label = new JLabel("ID");
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		addComponent(label, 180, 250, 300, 25);
		id = new JTextField(4);
		id.setEditable(false);
		addComponent(id, 300, 240, 700, 50);

		label = new JLabel("Questao");
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		addComponent(label, 180, 310, 300, 25);
		question = new JTextArea(5, 30);
		JScrollPane scrollPane = new JScrollPane(question);
		addComponent(scrollPane, 300, 300, 700, 50);

		label = new JLabel("Resposta correta:");
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		addComponent(label, 350, 370, 300, 25);
		correctAnswer = new JTextField(50);
		addComponent(correctAnswer, 550, 360, 200, 50);

		label = new JLabel("Respostas incorretas:");
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		addComponent(label, 520, 420, 300, 25);

		incorrectAnswer1 = new JTextField(50);
		addComponent(incorrectAnswer1, 330, 460, 200, 50);

		incorrectAnswer2 = new JTextField(50);
		addComponent(incorrectAnswer2, 550, 460, 200, 50);

		incorrectAnswer3 = new JTextField(50);
		addComponent(incorrectAnswer3, 770, 460, 200, 50);
	}

	public void clearFields() {
		id.setText("");
		question.setText("");
		correctAnswer.setText("");
		incorrectAnswer1.setText("");
		incorrectAnswer2.setText("");
		incorrectAnswer3.setText("");
	}

	public void setFields() {
		if (qst != null) {
			id.setText(Integer.toString(qst.getId()));
			question.setText(qst.getQuestion());
			correctAnswer.setText(ans.get(0).toString());
			incorrectAnswer1.setText(ans.get(1).toString());
			incorrectAnswer2.setText(ans.get(2).toString());
			incorrectAnswer3.setText(ans.get(3).toString());
		}
	}

}