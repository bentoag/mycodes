package control;

public class ValidatorIsBlank extends Validator {

	public ValidatorIsBlank(String question, String correctAnswer, String incorrectAnswer1, String incorrectAnswer2, String incorrectAnswer3) {
		super(question, correctAnswer, incorrectAnswer1, incorrectAnswer2, incorrectAnswer3);
	}

	@Override
	public boolean validate() {
		return (getQuestion().isBlank() || getCorrectAnswer().isBlank() 
				|| getIncorrectAnswer1().isBlank() || getIncorrectAnswer2().isBlank() || 
				getIncorrectAnswer3().isBlank());
	}
}