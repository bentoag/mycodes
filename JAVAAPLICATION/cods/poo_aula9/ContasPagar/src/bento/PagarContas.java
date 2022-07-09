package bento;

public class PagarContas {

	public static void main(String[] args) {
		PagarContas contas = new PagarContas();
		contas.executar();

	}

	public void executar() {
		Pagavel[] pagaveis = new Pagavel[5];
		pagaveis[0] = new FuncionarioAssalariado("Bento", "Gonzaga", 1500);
		pagaveis[1] = new FuncionarioComissionado("Pedro", "Portuga", 50000, 35);
		pagaveis[2] = new FuncionarioHorista("Maria", "Chiquinha", 130, 25.50);
		pagaveis[3] = new Fatura("Fornecador um", 13013);
		pagaveis[4] = new Fatura("Vermelhinho", 1000);
		double totalPagar = 0.0;
		for (Pagavel pagavel : pagaveis) {
			totalPagar += pagavel.obterValorPagar();
			System.out.println(pagavel);
		}
		System.out.printf("Valor total à pagar: $ %.2f%n%n", totalPagar);
	}

}
