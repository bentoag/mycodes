package pizzaria.bento;

public class Pedidos {

	public static void main(String[] args) {
		Tamanho casal = Tamanho.MEDIA;
		Tamanho pequena = Tamanho.BROTO;
		Tamanho familia = Tamanho.GRANDE;
		Tamanho galera = Tamanho.GIGANTE;
		
		Pepperoni pepperoni = new Pepperoni("Pepperoni", casal);
		pepperoni.fazerPedido();
		System.out.println();
		
		Margherita margherita = new Margherita("Margherita", pequena);
		margherita.fazerPedido();
		System.out.println();
		
		Mussarela mussarela = new Mussarela("Mussarela", familia);
		mussarela.fazerPedido();
		System.out.println();
		
		Portuguesa portuguesa = new Portuguesa("Portuguesa", galera);
		portuguesa.fazerPedido();
		System.out.println();
		
			
		Pedidos teste = new Pedidos();
		teste.executar();
	}
	
	public void executar() {
		Pizza [] pedidos = new Pizza[2];
		pedidos[0] = new Pepperoni("Pepe", Tamanho.GRANDE);
		pedidos[1] = new Portuguesa("Portuga", Tamanho.MEDIA);
		for(Pizza pizza: pedidos) {
			System.out.println(pizza.toString());
		}
		
	}

}

