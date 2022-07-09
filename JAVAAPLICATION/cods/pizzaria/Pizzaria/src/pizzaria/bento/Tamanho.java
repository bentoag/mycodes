package pizzaria.bento;

public enum Tamanho {

	BROTO ("Broto", 4), MEDIA ("Média", 6), GRANDE ("Grande", 8),
	GIGANTE ("Gigante", 10);
	
	private String tamanho;
	private int numFatias;
	
	private Tamanho (String tamanho, int numFatias) {
		this.tamanho = tamanho;
		this.numFatias = numFatias;
	}
	
	public int getNumFatias(){
		return this.numFatias;
	}
	
	public String getTamanho() {
		return this.tamanho;
	}
	
	public String toString() {
		return String.format("%s", getTamanho());
	}
}

