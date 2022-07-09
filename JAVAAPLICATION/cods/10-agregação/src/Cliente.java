
public class Cliente {

	private String nome;
	private Telefone[] telefones = new Telefone[100];
	
	public Cliente(String nome) {
		// CTRL + 1 = gerar o atributo (field)
		this.nome = nome;
	}

	// ACCESSOR/GETTER
	public String getNome() {
		return nome;
	}

	// CTRL + ESPAÇO = tostring
	@Override
	public String toString() {
		return this.nome;
	}

	public void addTelefone(Telefone t) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = t;
				return;
			}
		}
	}

	public Telefone[] getTelefones() {
		int qtd = 0;
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] != null) qtd++;
		}
		Telefone[] tels = new Telefone[qtd];
		for (int i = 0, j = 0; i < telefones.length; i++) {
			if (telefones[i] != null) {
				tels[j++] = telefones[i];
			}
		}
		return tels;
	}

	public void removeTelefone(Telefone t) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] != null 
					&& telefones[i].equals(t)) {
				telefones[i] = null;
			}			
		}
	}

	
	
	
	
	
	
	
	
	
	
}



















