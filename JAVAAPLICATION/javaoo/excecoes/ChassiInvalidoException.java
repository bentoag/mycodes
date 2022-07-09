package bento.javaoo.excecoes;

public class ChassiInvalidoException extends Exception {

	private static final long serialVersionUID = 3892655261845078443L;

	public ChassiInvalidoException (String chassi) {
		super(String.format("Nº de Chassi Inválido: [%s]", chassi));
	}
	
}
