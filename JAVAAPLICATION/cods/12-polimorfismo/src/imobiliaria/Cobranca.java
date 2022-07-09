package imobiliaria;
// A coesão da classe Cobrança é BAIXA
// BAIXA COESÃO => pouca coerência
// a classe faz "coisas" que não
// tem haver com seu objetivo principal
// ex: manipular vetor
public class Cobranca {

	private Locacao[] locacoes
		= new Locacao[20];
	
	Cobranca(Locacao... locacoes) {
		this.locacoes = locacoes;
	}

	// baixa COESÃO
	public void addLocacao(Locacao c) {
		for (int i = 0; i < locacoes.length; i++) {
			if (locacoes[i] == null) {
				locacoes[i] = c;
				return;
			}
		}		
	}

	public void pagar() {
		// sempre se referindo ao supertipo
		// polimórfico
		for (Locacao l : locacoes) {
			if (l != null) {
				l.pagar();
			}
		}
	}

	public double valorTotal() {
		double total = 0.0;
		for (Locacao l : locacoes) {
			if (l != null) {
				total += l.valorTotal();
			}
		}
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
