package relogio.bento;

public class TesteHorario {

	public static void main(String[] args) {
		SegHorario horario1 = new SegHorario();
		SegHorario horario2 = new SegHorario();

		System.out.printf("Hor�rio 1 inicial �: %s%n", horario1);
		System.out.printf("Hor�rio 2 inicial �: %s%n", horario2);

		System.out.println();

		horario1.setHorario(12, 27, 6);
		System.out.printf("Hor�rio 1 alterado para: %s%n", horario1);
		System.out.printf("Hor�rio 2 permanece: %s%n", horario2);

		System.out.println();

		horario1.setHorario(22, 07, 6);
		horario2.setHorario(23, 34, 13);		
		System.out.printf("Hor�rio 1 alterado para: %s%n", horario1);
		System.out.printf("Hor�rio 2 alterado para: %s%n", horario2);
		
		SegHorario horario3 = new SegHorario();
		SegHorario horario4 = new SegHorario();
		horario1.setHorario(-1, -1, -1);
		horario2.setHorario(24, 61, 99);
		horario3.setHorario(14, 55, 32);
		System.out.printf("Hor�rio 1 alterado para (valores inv�lidos): %s%n", horario1);
		System.out.printf("Hor�rio 2 alterado para (valores inv�lidos): %s%n", horario2);
		System.out.printf("Hor�rio 3 : %s%n", horario3);
		System.out.printf("Hor�rio 4 : %s%n", horario4);
		
		horario4.setHorario(24, 15, 32);
		System.out.printf("Hor�rio 1 alterado para (valores inv�lidos): %s%n", horario1);
		System.out.printf("Hor�rio 2 alterado para (valores inv�lidos): %s%n", horario2);
		System.out.printf("Hor�rio 3 : %s%n", horario3);
		System.out.printf("Hor�rio 4 : %s%n", horario4);
		
		
		//TESTANDO SOBRECARGA DE CONSTRUTORES
		SegHorario h1 = new SegHorario();
		SegHorario h2 = new SegHorario(2);
		 SegHorario h3 = new SegHorario(21, 34);
		 SegHorario h4 = new SegHorario(12, 25, 42);
		 SegHorario h5 = new SegHorario(30, 77, 99);
		 SegHorario h6 = new SegHorario(h4);
		 SegHorario h7 = new SegHorario(14, 77, 99);
		 SegHorario h8 = new SegHorario(14, 77, 59);
		 
		 System.out.printf("Com construtor padr�o: %s%n", h1);
		 System.out.printf("Construtor com 1 int: %s%n", h2);
		 System.out.printf("Construtor com 2 ints: %s%n", h3);
		 System.out.printf("Construtor com 3 ints: %s%n", h4);
		 System.out.printf("Passando valores inconsistentes: %s%n", h5);
		 System.out.printf("Construtor com 1 objeto do tipo Hor�rio: %s%n", h6);
		 System.out.printf("Passando valores inconsistentes: %s%n", h7);
		 System.out.printf("Passando valores inconsistentes: %s%n", h8);
		 
	}

}
