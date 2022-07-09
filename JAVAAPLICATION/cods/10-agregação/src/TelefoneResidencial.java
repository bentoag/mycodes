
public class TelefoneResidencial extends Telefone {

	public TelefoneResidencial(String ddd, String numero) {
		super(ddd, numero);
	}

	public TelefoneResidencial(String numero) {
		super(numero);
	}

	@Override
	public String getTipo() {	
		return "Residencial";
	}

	
}
