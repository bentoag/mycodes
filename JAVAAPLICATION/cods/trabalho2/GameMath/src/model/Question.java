package model;

import java.util.ArrayList;
import java.util.List;

public class Question {
	private int id;
	private String question;
	private List<Answer> answersList = new ArrayList<>();


	public String getQuestion() {
		return question;
	}
	
	public Answer getCorrectAnswer() {
		return answersList.get(0);
	}

	
	public void setAnswers(List<Answer> answers) {
		this.answersList = answers;
	}


	public void setQuestion(String question) {
		this.question = question;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		return this.id == other.id;
	}

	public String toString() {
		return String.format("%d, %s, %s", getId(), getQuestion(), getCorrectAnswer());

	}

}