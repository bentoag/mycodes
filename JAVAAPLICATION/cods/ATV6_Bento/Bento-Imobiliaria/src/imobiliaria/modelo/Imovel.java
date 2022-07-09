package imobiliaria.modelo;

import java.time.LocalDate;

public abstract class Imovel {

	private int area, cod , periodo;
	private Endereco logradouro;
	private Finalidade finalidade;
	private double valor;
	private LocalDate data;
	
		public Imovel (int cod, int a, int p, Endereco end, Finalidade tipo, double valor, LocalDate data) {
			
			this.area = a;
			this.cod = cod;
			this.periodo = p;
			this.logradouro = end;
			this.finalidade = tipo;
			this.valor = valor;
			this.data = data;
		}
		
	
		
		
	public int getArea() {
		return area;
	}
	public int getCod() {
		return cod;
	}
	public int getPeriodo() {
		return periodo;
	}
	public Endereco getLogradouro() {
		return logradouro;
	}
	public Finalidade getFinalidade() {
		return finalidade;
	}
	public double getValor() {
		return valor;
	}
	public LocalDate getData() {
		return data;
	}
	
	
}
