package imobiliaria.modelo;

import java.time.LocalDate;

public class SalaComercial extends Imovel {
	
	private int banheiros, vagas;

	public SalaComercial(int cod, int a, int p, Endereco end, Finalidade tipo, double valor, LocalDate data, int nbwc, int nvg) {
		super(cod, a, p, end, tipo, valor, data);
		
		this.banheiros = nbwc;
		this.vagas = nvg;
	}
	

	public int getBanheiros() {
		return banheiros;
	}

	public int getVagas() {
		return vagas;
	}

	@Override
	public String toString() {
		return "Imóvel nº : "+ getCod() + "  Sala comercial com: " + banheiros + " Banheiro(s)" + " | " + vagas + "  vagas de Garagem"
				+  " | " + " Disponível para  " + getFinalidade() + " | " + "  Por apenas $$:  " + getValor() +  " | " + "Área total de: " + getArea() + " m²";
	}
}
