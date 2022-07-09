package imobiliaria;

public class Apartamento extends Locacao {

	Apartamento(String endereco, int quartos, int garagem, double valor, double extra) {
		super(endereco, quartos, garagem, valor, extra);
		this.setPrazo(12);
	}
	
	@Override
	double valorTotal() {
		return super.valor() + super.valorCondominio();
	}
	
	@Override
	double pagar(int atraso) {
		if (this.prazo() <= 0) return 0;
	    double valorPago = this.valorTotal();
	    valorPago += 0.03 * this.valor() + (atraso * 0.01 * this.valor());
	    valorPago += 0.1 * this.valorCondominio();
	    setPrazo(prazo() - 1);
		return valorPago;
	}
}