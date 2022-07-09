package imobiliaria.modelo;

import java.time.LocalDate;

public class Terreno extends Imovel {
	
	private boolean financia;

	public Terreno(int cod, int a, int p, Endereco end, Finalidade tipo, double valor, LocalDate data, boolean aceitafinanciamento) {
		super(cod, a, p, end, tipo, valor, data);
		
		this.financia = aceitafinanciamento;
	}

	public String isFinancia() {
		if(financia) return "SIM";
		return "NÃO";
	}
	
	@Override
	public String toString() {
		return "Imóvel nº : "+ getCod() + "  Terreno com: " + getArea() + " m²"
				+  " | " + " Disponível para " + getFinalidade() + " | " + "  Por apenas $$:  " + getValor() + " | " + "Finincia :  " + isFinancia();
	}
}
