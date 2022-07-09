package bento.javaoo.classes;

public final class Carro extends VeiculoBase{
	
	private int qtdPortas;

	public Carro() {
		this.qtdRodas = 4;
	}
	
	public Carro(String nome, String marca) {
		this.qtdRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	@Override
	public void preparar() {
		System.out.println("Colocar o cinto de segurança");
		
	}
	
	
}
