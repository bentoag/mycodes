package gerenciador.bento;

public class Data {
	private int dia, ano;
	private Mes mes;

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		int year = (ano > 0)? ano : 0;
		this.ano = year;
	}

	public String getMes() {
				//pegando valor relacionado ao mes do Enum
		return mes.getMes();
	}

	public void setMes(Mes mes) {		
		this.mes = mes;
	}
	public int getDia() {		
		return this.dia;
	}

	public void setDia(int dia) {			
		this.dia = dia;
	}	
	
		
	//construtores
	public Data(int dia, Mes mes, int ano) {
		setAno(ano);		
		setMes(mes);		
		int day = 0;		
		
		if(mes == Mes.FEVEREIRO) {				
			if (((this.ano % 400) == 0) || (((this.ano % 4) == 0) && ((this.ano % 100) != 0))) {
				day = (dia >= 1 && dia <= 29) ? dia : 0;
			} else {
				day = (dia >= 1 && dia <= 28) ? dia : 0;
			}
		}else if(mes == Mes.ABRIL || mes == Mes.JUNHO || mes == Mes.SETEMBRO || mes == Mes.NOVEMBRO) {		
			day = (dia>=1 && dia <=30)? dia : 0;
		}else {
			day = (dia>=1 && dia <=31)? dia : 0;
		}	
		
		setDia(day);
	}
	
	public String toString() {
		return String.format("%02d:%02d:%04d", getDia(), getMes(), getAno());
	}
	
	

}
