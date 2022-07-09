package calculandovendasecomissoes.bento;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		boolean validaProduto = false;
		int produto, quantidade = 0;
		double salario = 0;
		
		Scanner input = new Scanner(System.in);		
		System.out.print("Digite o nome do vendedor:  ");
		String nome = input.nextLine();
		
		Vendedor vendedor1 = new Vendedor(nome);	

		
		do {
			System.out.print ("Informe o produto vendido:  ");
			produto = input.nextInt();
			
			if(produto == 1 || produto ==2  || produto ==3 || produto ==4 || produto ==5) {
				System.out.print ("Informe a quantidade de produto vendido:  ");
				quantidade = input.nextInt();
				
				if(quantidade > 0) {
					salario = vendedor1.salarioVendedor(produto, quantidade);
					validaProduto = true;
				}
			}
			
		} while (!validaProduto);		
		
		System.out.println("Vendedor: " + nome);
		System.out.println("Vendeu " + quantidade + "  unidades do produto  " + produto);
		System.out.printf("%s  %.2f  %n","Seu  Sal�rio neste m�s foi de: R$  ", salario);
		System.out.printf("%s  %.2f", "Total vendido no m�s R$ ", vendedor1.getTotalVendidoMes());
		
		Vendedor vendedor2 = new Vendedor("Jos�");	
		vendedor2.setTotalVendidoMes(5000);
		System.out.println();
		System.out.println("Vendedor 2 -->");
		System.out.printf("%s  %.2f", "Total vendido no m�s R$ ", vendedor2.getTotalVendidoMes());
		
		input.close();
	}

}