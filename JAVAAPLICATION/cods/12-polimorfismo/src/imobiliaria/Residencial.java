package imobiliaria;

public class Residencial extends Locacao{

	Residencial(String endereco, int quartos, int garagem, double valor, double extra) {
		super(endereco, quartos, garagem, valor, extra);
		this.setPrazo(12);
	}

	@Override
	double valorTotal() {
		return this.valor();
	}
	
	@Override
	double pagar(int atraso) {
		if (this.prazo() <= 0) return 0;
	    double valorPago = this.valorTotal();
	    valorPago += 0.03 * this.valor() + (atraso * 0.01 * this.valor());
	    setPrazo(prazo() - 1);
		return valorPago;
	}
}