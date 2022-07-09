package imobiliaria.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Casa extends Imovel {
	
	private ArrayList <ContratoServico> anuncios = new ArrayList <>();
	
	private int dormitorios, banheiros, vagas;

	public Casa(int cod, int a, int p, Endereco end, Finalidade tipo, double valor, LocalDate data, int nquartos, int nbwc, int nvg) {
		super(cod, a, p, end, tipo, valor, data);
		this.banheiros = nbwc;
		this.dormitorios = nquartos;
		this.vagas = nvg;
				
	}
	

	public int getDormitorios() {
		return dormitorios;
	}

	public int getBanheiros() {
		return banheiros;
	}

	public int getVagas() {
		return vagas;
	}

	
			
	@Override
	public String toString() {
		return "Imóvel nº : "+ getCod() + "  Casa com: " + dormitorios + " Quartos  " + "| " + banheiros + " Banheiro(s)  "  + "| " + vagas + "  vagas de Garagem  "  + "| "
				+ " Disponível para:  " + getFinalidade() +   " | " +" Por apenas $$:  " + getValor() +  " | " +"  Área total de: " + getArea() + "m²";
	}


	public ArrayList <ContratoServico> getAnuncios() {
		return anuncios;
	}


	public void setAnuncios(ArrayList <ContratoServico> anuncios) {
		this.anuncios = anuncios;
	}
}
