package calculandovendasecomissoes.bento;

public class Vendedor {
	private String nome;
	private double totalVendidoMes;		
	
	public Vendedor (String nome) {
		this.nome = nome;
	}

	public double getTotalVendidoMes() {
		return this.totalVendidoMes;
	}
	
	public void setTotalVendidoMes(double totalVendidoMes) {
		this.totalVendidoMes = (this.totalVendidoMes + totalVendidoMes + 1045);
	}

	public double salarioVendedor (int tipProduto, int quantidade) {
		if(tipProduto == 1) {			
			this.totalVendidoMes = 2.98*quantidade;
			return (1045 + (this.totalVendidoMes*0.05));
		}else if(tipProduto == 2) {				
			this.totalVendidoMes = 4.50*quantidade;
			return (1045 + (this.totalVendidoMes*0.05));
		}else if(tipProduto == 3) {				
			this.totalVendidoMes = 9.98*quantidade;
			return (1045 + (this.totalVendidoMes*0.05));
		}else if(tipProduto == 4) {				
			this.totalVendidoMes = 4.49*quantidade;
			return (1045 + (this.totalVendidoMes*0.05));
		}else if(tipProduto == 5) {			
			this.totalVendidoMes = 6.87*quantidade;
			return (1045 + (this.totalVendidoMes*0.05));
		}else {
			return 0;
		}		
		
	}
		
	
}