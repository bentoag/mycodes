// É um Tipo CONCRETO
public class TelefoneCelular extends Telefone {

	public TelefoneCelular(String ddd, String numero) {
		super(ddd, numero);
	}

	public TelefoneCelular(String numero) {
		super(numero);
	}
	
	@Override
	public String getTipo() {		
		return "Celular";
	}

	
	

}
