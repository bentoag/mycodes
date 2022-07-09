package pizzaria.bento;

public class Mussarela extends Pizza{

	final int NUMINGREDIENTES = 2;
	String ingredientes[] = { "Molho tomate", "Mussarela"};
	
	public Mussarela(String nome, Tamanho tamanho) {
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
		System.out.println(String.format("%s %s %s", "Sua pizza de ", super.getNome(), " ficar� pronta em 5 min"));
		System.out.println();
		super.cortar();
	}	
	
	

}