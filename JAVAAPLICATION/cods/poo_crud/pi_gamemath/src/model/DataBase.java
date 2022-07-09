package model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	private static List<Question> questions = new ArrayList<>();
	private static int increment = 0;

	public static void insert(Question question) {
		question.setId(++increment);
		questions.add(question);
	}

	public static void update(Question question) {
		int n = questions.indexOf(question);
		if (n >= 0) {
			questions.set(n, question);
		}
	}

	public static void delete(Question question) {
		questions.remove(question);
	}

	public static List<Question> list() {
		return questions;
	}
}
