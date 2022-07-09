package exerciciodate.bento;

public class Date {
	private int mes, dia, ano;

	public Date(int mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}
	
	public String mensagemErro() {
		return "Parâmetro inválido";
	}
	
	public String dataFornecida() {
		return "A data fornecida foi:  " + this.mes + "/" + this.dia + "/" + this.ano;
	}
	public String displayDate() {
		
		if(this.ano >= 1900 ) {
			if (this.mes > 0 && this.mes < 13) {
				if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
					if (this.dia > 0 && this.dia <= 31) {
						return dataFornecida();
					}else {
						return mensagemErro()+ "  --> Dia!";
					}
				} else if (((this.ano % 4) == 0 && (this.ano % 100) != 0) && this.mes == 2) {
					if (this.dia > 0 && this.dia <= 29) {
						return dataFornecida();
					}else {
						return mensagemErro() + "  ANO BISSEXTO FEV ATÉ 29";
					}
				} else if (this.mes == 2) {
					if (this.dia > 0 && this.dia <= 28) {
						return dataFornecida();
					}else {
						return mensagemErro()+ "  --> FEV ATÉ 28 dias";
					}
				} else {
					if (this.dia > 0 && this.dia <= 30) {
						return dataFornecida();
					}else {
						return mensagemErro()+ "  --> Dia!";
					}
				}
			} else {
				return mensagemErro() + "  --> Mês";
			}
		}else {
			return mensagemErro() + "  --> Ano";
		}
		
		
		
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
