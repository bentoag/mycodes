package relogio.bento;

public class Relogio {

	public SegHorario horario_atual;
	public SegHorario horario_alarme;

	public Relogio(int hora, int minuto, int segundo) {
		horario_atual = new SegHorario(hora, minuto, segundo);
	}

	public String getHorarioAtual() {
		return horario_atual.toString();
	}

	public void setHorarioAlarme(int hora, int minuto, int segundo) {
		horario_alarme = new SegHorario(hora, minuto, segundo);
	}

	public String getHorarioAlarme() {
		return horario_alarme.toString();
	}

	public void despertar() {
		if (horario_atual.equals(horario_alarme)) {
			System.out.println("ALARME TOCANDO!!");
		} else {
			System.out.println("Ainda não está na hora...");
		}
	}

}
