package pizzaria.bento;

public abstract class Pizza {

	private String nome;
	private Tamanho tamanho;
	
	public Pizza (String nome, Tamanho tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}
	
	public String getNome() {
		return this.nome;
	}	
	
	public int getTamanho() {
		return tamanho.getNumFatias();
	}
	
	public void cortar() {
		if(tamanho == Tamanho.BROTO) {
			System.out.println(String.format("%s%s %s%d %s", "Voc� comprou uma pizza de ", getNome(), "Tamanho Broto, com: ", tamanho.getNumFatias(), " fatias"));
		}else if(tamanho == Tamanho.MEDIA) {
			System.out.println(String.format("%s%s %s%d %s", "Voc� comprou uma pizza de ", getNome(), "Tamanho M�dio, com: ", tamanho.getNumFatias(), " fatias"));
		}else if( tamanho == Tamanho.GRANDE) {
			System.out.println(String.format("%s%s %s%d %s", "Voc� comprou uma pizza de ", getNome(), "Tamanho Grande, com: ", tamanho.getNumFatias(), " fatias"));
		}else {
			System.out.println(String.format("%s%s %s%d %s", "Voc� comprou uma pizza de ", getNome(), "Tamanho Gigante, com: ", tamanho.getNumFatias(), " fatias"));

		}
	}
	
	//metodos para as subclases implementarem
	public abstract void fazerPedido();	
	public abstract void preparar();
	public abstract void assar();

	@Override
	public String toString() {
		return String.format("%s%s%s%d%s", "Voc� escolheu a pizza de: ", getNome(), " com ", getTamanho(), " fatias.");
	}
	
	
}