// classes abstratas são obrigadas a serem estendidas
// não é possível dar "new" numa classe abstrata
public abstract class Telefone {
	
	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
	}

	public Telefone(String numero) {
		this(null, numero);
	}
	
	public abstract String getTipo();
	
	



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		
		if (this.getTipo() != other.getTipo())
			return false;
		
		if (ddd == null) {
			if (other.ddd != null)
				return false;
		} else if (!ddd.equals(other.ddd))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public String toString() {		
		return getTipo() + " (" + ddd + ") " + numero;
	}
	
	
	
	
	
	
	
	
	

}
