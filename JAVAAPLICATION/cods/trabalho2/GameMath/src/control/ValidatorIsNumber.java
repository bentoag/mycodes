package control;

public class ValidatorIsNumber extends Validator {
	private boolean questionIsNumber = true;
	private boolean answerIsNumber = true;
	
	public ValidatorIsNumber(String question, String correctAnswer, String incorrectAnswer1, String incorrectAnswer2, String incorrectAnswer3) {
		super(question, correctAnswer, incorrectAnswer1, incorrectAnswer2, incorrectAnswer3);
	}

	@Override
	public boolean validate() {
		for (int k = 0; k < getQuestion().length(); k++) {
			if (getQuestion().charAt(k) <= 57 && getQuestion().charAt(k) >= 48) {
			} else {
				questionIsNumber = false;
				k = getQuestion().length();
			}
		}

		answerIsNumber = (verifyIsNumber(getCorrectAnswer()) && verifyIsNumber(getIncorrectAnswer1())
				&& verifyIsNumber(getIncorrectAnswer2()) && verifyIsNumber(getIncorrectAnswer3()));		
		
		return (questionIsNumber == false && answerIsNumber == true); //A questao nao pode ser unicamente composta de algarismos, mas a resposta DEVE ser.
	}
	
	private boolean verifyIsNumber(String answer) {
		boolean isNumber = true;
		for (int k = 0; k < answer.length(); k++) {
			if ((int) (answer.charAt(k)) <= 57 && (int) (answer.charAt(k)) >= 48) {
			} else {
				isNumber = false;
				k = answer.length();
			}
		}
		return isNumber;
	}
}
