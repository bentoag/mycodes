package gerenciador.bento;

public enum Mes {

	JANEIRO("Janeiro", 31), FEVEREIRO("Fevereiro", 28), MARCO("Mar�o", 31),
	ABRIL("Abril",30), MAIO ("Maio", 31), JUNHO("Junho", 30), JULHO("Julho", 31),
	AGOSTO("Agosto", 31), SETEMBRO("Setembro", 30), OUTUBRO("Outubro", 31),
	NOVEMBRO ("Novembro", 30), DEZEMBRO("Dezembro", 31);
	
	private int qtdDias;
	private String mes;
	
	private Mes(String mes, int diasMes) {
		this.mes = mes;
		this.qtdDias = diasMes;
	}	
	
	public int getDiasDoMes() {
		return this.qtdDias;
	}
	public String getMes() {
		return this.mes;
	}
	

	public String toString() {
		return String.format("%s", getMes());
	}
}
