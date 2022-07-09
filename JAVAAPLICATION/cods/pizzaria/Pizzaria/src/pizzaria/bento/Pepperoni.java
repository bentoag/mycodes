package pizzaria.bento;

public class Pepperoni extends Pizza {
	final int NUMINGREDIENTES = 8;
	String ingredientes[] = { "Molho tomate", "Queijo Provolone", "Peperoni", "Tomate", "Piment�o em fatias", "Cebola em fatias",
			"Or�gano", "Pimenta calabresa" };
	
	public Pepperoni(String nome, Tamanho tamanho) {
		super(nome, tamanho);		
	}

	@Override
	public void fazerPedido() {		
		System.out.println(String.format("%s %s %s", "Sua pizza de ", super.getNome(), " est� sendo preparada"));
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
		System.out.println(String.format("%s %s %s", "Sua pizza de ", super.getNome(), " ficar� pronta em 9 min"));
		System.out.println();
		super.cortar();
	}	

}