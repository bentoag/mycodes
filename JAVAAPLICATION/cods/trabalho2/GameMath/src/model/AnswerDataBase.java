package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AnswerDataBase {

	public static boolean insert(Answer answer) {
		final String query = "INSERT INTO respostas (conteudo, correta, id_perguntas) VALUES (?, ?, ?)";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();

			statement = connection.prepareStatement(query);
			statement.setString(1, answer.getAnswer());
			statement.setBoolean(2, answer.isCorrect());
			statement.setInt(3, answer.getQuestion_id());
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

	public static boolean update(Answer answer) {
		final String query = "UPDATE respostas SET conteudo = ? WHERE id_respostas = ?";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();
			

			statement = connection.prepareStatement(query);
			statement.setString(1, answer.getAnswer());
			statement.setInt(2, answer.getId());
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

	public static boolean delete(Answer answer) {
		final String query = "DELETE FROM respostas WHERE id_respostas = ?";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();

			statement = connection.prepareStatement(query);
			statement.setInt(1, answer.getId());
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

	public static List<Answer> list() {
		List<Answer> answers = new ArrayList<>();

		final String query = "SELECT * FROM respostas ORDER BY id";

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				Answer answer = new Answer();
				answer.setId(resultSet.getInt("id_respostas"));
				answer.setAnswer(resultSet.getString("conteudo"));
				answer.setCorrect(resultSet.getBoolean("correta"));
				answer.setQuestion_id(resultSet.getInt("id_perguntas"));

				answers.add(answer);
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

		return answers;
	}
	
	
	public static List<Answer> list(int id) {
		List<Answer> answers = new ArrayList<>();

		final String query = "SELECT * FROM respostas WHERE id_perguntas = ? ORDER BY id_respostas";

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Answer answer = new Answer();
				answer.setId(resultSet.getInt("id_respostas"));
				answer.setAnswer(resultSet.getString("conteudo"));
				answer.setCorrect(resultSet.getBoolean("correta"));
				answer.setQuestion_id(resultSet.getInt("id_perguntas"));

				answers.add(answer);
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

		return answers;
	}
}
