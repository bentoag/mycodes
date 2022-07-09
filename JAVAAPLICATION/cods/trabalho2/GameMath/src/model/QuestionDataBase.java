package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuestionDataBase {

	public static boolean insert(Question question) {
		final String query = "INSERT INTO perguntas (conteudo) VALUES (?)";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();

			statement = connection.prepareStatement(query);
			statement.setString(1, question.getQuestion());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
					return false;
				}
			}
		}
		return true;
	}

	public static boolean update(Question question) {
		final String query = "UPDATE perguntas SET conteudo = ? WHERE id_perguntas = ?";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();

			statement = connection.prepareStatement(query);
			statement.setString(1, question.getQuestion());
			statement.setInt(2, question.getId());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
					return false;
				}
			}
		}

		return true;

	}

	public static boolean delete(Question question) {
		final String query = "DELETE FROM perguntas WHERE id_perguntas = ?";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();

			statement = connection.prepareStatement(query);
			statement.setInt(1, question.getId());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
					return false;
				}
			}
		}

		return true;

	}
	
	public static int getLastQuestionId() {
		final String query = "SELECT id_perguntas FROM perguntas GREATEST(id_perguntas)";
																//GREATEST pega o maior valor
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		int lastQuestionId = 0;

		try {
			connection = ConnectionFactory.getConnection();

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
			lastQuestionId = resultSet.getInt("id_perguntas");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lastQuestionId;
	}

	public static List<Question> list() {
		List<Question> questions = new ArrayList<>();

		final String query = "SELECT * FROM perguntas ORDER BY id_perguntas";

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				Question question = new Question();
				question.setId(resultSet.getInt("id_perguntas"));
				question.setQuestion(resultSet.getString("conteudo"));

				questions.add(question);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}

				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return questions;
	}
}