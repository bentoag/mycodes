package relogio.bento;

public class TesteRelogio {

	public static void main(String[] args) {
		Relogio relogio1 = new Relogio(14, 13, 58);
		Relogio relogio2 = new Relogio(18, 30, 0);
		Relogio relogio3 = new Relogio(23, 30, 0);

		relogio1.setHorarioAlarme(16, 0, 0);
		relogio2.setHorarioAlarme(18, 30, 0);
		relogio3.setHorarioAlarme(23, 29, 59);

		System.out.println("Verificando o alarme do relogio 1:");
		relogio1.despertar();

		System.out.println("Verificando o alarme do relogio 2:");
		relogio2.despertar();
		
		System.out.println("Verificando o alarme do relogio 3:");
		relogio3.despertar();

	}

}
