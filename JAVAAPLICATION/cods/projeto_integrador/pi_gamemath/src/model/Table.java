package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

//criar a tabela
public class Table extends AbstractTableModel {
	private List<Question> questions = new ArrayList<>();
	private String[] columns = new String[] {"ID", "Pergunta", "Resposta"};
	
	public Table(List<Question> questions) {
		load(questions);
	}

	@Override
	public int getRowCount() {
		return questions.size();
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}
	
	@Override
	public String getColumnName(int column) {
		String columnName=null;
		if(column >= 0 && column < columns.length) {
			columnName = columns[column];
		}
		return columnName;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		String value = null;
		
		if (rowIndex >= 0 && rowIndex < questions.size()) {
			Question question = questions.get(rowIndex);
			
			switch (columnIndex) {
			case 0:
				value = Integer.toString(question.getId());
				break;
			case 1:
				value = question.getQuestion();
				break;
			case 2:
				value = question.getAnswer();
				break;
			default:
				System.err.printf("ERROR: Índice inválido para a coluna: %d\n", columnIndex);
				break;
			}
		}
		return value;
	}
	
	public void load(List<Question> questions) {
		this.questions = questions;
		fireTableDataChanged();
	}
	
	public Question getQuestion(int rowIndex) {
		Question question = null;
		if(rowIndex >= 0 && rowIndex < questions.size()) {
			question = questions.get(rowIndex);
		}
		return question;
	}
}
