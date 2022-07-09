package view;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.DataBase;
import model.Question;

public class ValidatorIsBlank extends Validator {
	
	private Question qst = formPanel.getQst(); 
	private JTextField answer = formPanel.getAnswer();
	private JTextArea question = formPanel.getQuestion();

	public ValidatorIsBlank(FormPanel formPanel) {
		super(formPanel);
	}

	@Override
	public void validate() {

		
		if (qst == null) {
			if (question.getText().equals("") || answer.getText().equals("")) {
				JOptionPane.showMessageDialog(FormPanel, "Preencha os campos necess�rios");
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
				JOptionPane.showMessageDialog(FormPanel.this, "Preencha os campos necess�rios");
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
	}
	
	
}
