package imobiliaria;

public class Comercial extends Locacao {

	Comercial(String endereco, int quartos, int garagem, double valor, double extra) {
		super(endereco, quartos, garagem, valor, extra);
		this.setPrazo(6);
	}

	@Override
	double valorTotal() {
		if (this.prazo() == 6) return this.valor() + this.valorCondominio();
		return this.valor();
	}
	
	@Override
	double pagar(int atraso) {
		if (this.prazo() <= 0) return 0;
	    double valorPago = this.valorTotal();
	    valorPago += 0.05 * this.valorTotal() + (atraso * 0.01 * this.valorTotal());
	    setPrazo(prazo() - 1);
		return valorPago;
	}
}