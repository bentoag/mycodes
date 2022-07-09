package imobiliaria.modelo;

import java.util.ArrayList;

public class Anuncio {

	
	private final ArrayList <Casa> casas = new ArrayList<>();
	private final ArrayList <Apartamento> aptos = new ArrayList<>();
	private final ArrayList <SalaComercial> salas = new ArrayList<>();
	private final ArrayList <Terreno> lotes = new ArrayList<>();
	private int cod;
	
	
	public Anuncio (int cod ) {
		this.cod = cod;
	}
	
	public int getCod() {
		return cod;
	}

	//Cadastrar os tipos de imóveis e guardar no vetor imoveis

	public void cadastrarSalaComercial (SalaComercial sala) {
		salas.add(sala);
	}
	
	public void cadastrarCasa (Casa casa) {
		casas.add(casa);
	}
	
	public void cadastrarApartamento (Apartamento apto) {
		aptos.add(apto);
	}
	
	public void cadastrarTerreno (Terreno lote) {
		lotes.add(lote);
	}
	
	//Busca de Imóveis
	
	public Casa buscarCasa (int cod) throws ImovelNaoEncontradoException {
		
		for (Casa c : casas) {
			if(c.getCod() == cod) {
				return c;
			} 
		}
		throw new ImovelNaoEncontradoException();			
	}
	
	
	
	public Apartamento buscarApartamento (int cod) throws ImovelNaoEncontradoException {
		
		for (Apartamento ap : aptos) {
			if(ap.getCod() == cod) {
				return ap;
			} 
		}
		throw new ImovelNaoEncontradoException();			
	}
	
	
	
	public SalaComercial buscarSalaComercial (int cod) throws ImovelNaoEncontradoException {
		
		for (SalaComercial sc : salas) {
			if(sc.getCod() == cod) {
				return sc;
			} 
		}
		throw new ImovelNaoEncontradoException();			
	}
	
	
	public Terreno buscarTerreno (int cod) throws ImovelNaoEncontradoException {
		
		for (Terreno t : lotes) {
			if(t.getCod() == cod) {
				return t;
			} 
		}
		throw new ImovelNaoEncontradoException();			
	}
}
