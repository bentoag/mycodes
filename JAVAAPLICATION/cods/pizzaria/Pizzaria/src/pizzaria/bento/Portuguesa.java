package pizzaria.bento;

public class Portuguesa extends Pizza {

	final int NUMINGREDIENTES = 7;
	String ingredientes[] = { "Molho tomate", "Mussarela", "Tomate", "Ovos cozidos", "Pressunto", "Cebola em fatias",
			"Azeitonas" };

	public Portuguesa(String nome, Tamanho tamanho) {
		super(nome, tamanho);
	}

	@Override
	public void fazerPedido() {		
		System.out.println(String.format("%s %s %s", "Sua pizza de ", super.getNome(), " está sendo preparada"));
		System.out.println();
		preparar();
	}

	@Override
	public void preparar() {		
		for (int i = 0; i < NUMINGREDIENTES; i++) {
			System.out.print(String.format("%s %s", "Estamos adicionando: ", ingredientes[i]));
			System.out.println();			
		}
		assar();
	}

	@Override
	public void assar() {		
		System.out.println();
		System.out.println(String.format("%s %s %s", "Sua pizza de ", super.getNome(), " ficará pronta em 12 min"));
		System.out.println();
		super.cortar();
	}	
}
