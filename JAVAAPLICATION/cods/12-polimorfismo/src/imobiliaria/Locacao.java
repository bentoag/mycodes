package imobiliaria;

abstract class Locacao {

		  final String endereco;
		  final int quartos, garagem;
		  private double valor;
		  private double extra;
		  private int prazo;
		  
		  Locacao(String endereco, int quartos, int garagem, double valor, double extra) {
		    this.endereco = endereco;
		    this.quartos = quartos;
		    this.garagem = garagem;
		    this.valor = valor;
		    this.extra = extra;
		  }

		  void renovar(double percentual) {
		    this.valor += percentual / 100.0 * valor;
		    this.prazo = 12;
		  }

		  void renovar(double percentual, double extra) {
		    this.valor += percentual / 100.0 * valor;
		    this.extra = extra;
		    this.prazo = 6;
		  }

		  double pagar() {
		    if (this.prazo <= 0) return 0;
		    double valorPago = this.valorTotal();
		    this.prazo = this.prazo - 1;
		    return valorPago;
		  }

		  abstract double pagar(int atraso);

		  void setPrazo(int prazo) {
			  this.prazo = prazo;
		  }
		  
		  int prazo() {
		    return this.prazo;
		  }

		  double valor() {
		    return this.valor;
		  }

		  double valorCondominio() {
		    return this.extra;
		  }

		  abstract double valorTotal();

		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
}