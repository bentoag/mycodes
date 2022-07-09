package gerenciador.bento;

public class Tarefa {
	public String nome;
	public Data data;
	public Horario horario;
	
	
	public String getNome() {
		return this.nome;
	}
	
	
	public Tarefa (String nome) {
		this.nome = nome;
		data = new Data(0, Mes.JANEIRO, 0000);
		horario = new Horario();
		horario.setHorario(0, 0, 0);
	}
	
	public Tarefa (String nome,int dia, Mes mes, int ano) {
		this.nome = nome;
		data = new Data(dia, mes, ano);
		horario = new Horario();
		horario.setHorario(0, 0, 0);
	}
	
	public Tarefa (String nome,int dia, Mes mes, int ano, int hora, int minuto, int segundo) {
		this.nome = nome;
		data = new Data(dia, mes, ano);
		horario = new Horario();
		horario.setHorario(hora, minuto, segundo);
	}
	
	public String toString() {
		return String.format("%s  %02d | %s | %04d  %02d:%02d:%02d",getNome(), data.getDia(), data.getMes(), data.getAno(), horario.getHora(), horario.getMinuto(), horario.getSegundo());
	}

	
}
