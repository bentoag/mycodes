package gerenciador.bento;

public class Horario {
	private int segundos;
	
	//23x3600 + 59x60 + 59 = 86399
	public int getHora() {
		int h = ((this.segundos >= 0 && this.segundos < 86400) ? (this.segundos / 3600) : 0);
		return h;
	}

	public int getMinuto() {
		int min =((this.segundos >= 0 && this.segundos < 86400) ? ((this.segundos % 3600) / 60) : 0) ;		
		return min;
	}

	public int getSegundo() {
		int seg = ((this.segundos >= 0 && this.segundos < 86400) ? ((this.segundos % 3600) % 60) : 0);
		return seg;
	}

	public void setHorario(int hora, int minuto, int segundo) {
		//this.segundos = hora*3600 + minuto*60 + segundo;		
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}
	
	public void setHora(int hora) {
		int hour = (hora >= 0 && hora <= 23 ? hora : 0);

		this.segundos += (hour - getHora())*3600;
	}

	public void setMinuto(int minuto) {
		int min = (minuto >= 0 && minuto <= 59 ? minuto : 0);
		this.segundos += (min - getMinuto()) * 60;
	}

	public void setSegundo(int segundo) {
		int seg = (segundo >= 0 && segundo <= 59 ? segundo : 0);
		this.segundos += (seg - getSegundo());
	}
	
	

	public String toString() {
		return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
	}
}