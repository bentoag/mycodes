package imobiliaria.modelo;

import java.time.LocalDate;

public class Apartamento extends Imovel{
	
	private int dormitorios, banheiros, vagas;
	private String nomecond;

	public Apartamento(int cod, int a, int p, Endereco end, Finalidade tipo, double valor, LocalDate data, int nquartos, int nbwc, int nvg, String nome) {
		super(cod, a, p, end, tipo, valor, data);
		
		this.banheiros = nbwc;
		this.dormitorios = nquartos;
		this.nomecond = nome;
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

	public String getNomecond() {
		return nomecond;
	}
	
	@Override
	public String toString() {
		return "Imóvel nº : "+ getCod() + "  Apartamento com: " + dormitorios + " Quartos "  + " | " + banheiros + " Banheiro(s)" +  " | " + vagas + "  vagas de Garagem"
				+ " | " + " Disponível para " + getFinalidade() +  " | " + "  Por apenas $$:  " + getValor() + " | " + " Área total de:  " 
				+ getArea() + " m²" + " | " + "  Localizado no cond. : " + nomecond;
	}

}
