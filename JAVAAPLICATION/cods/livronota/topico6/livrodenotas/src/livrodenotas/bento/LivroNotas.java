package livrodenotas.bento;

public class LivroNotas {
	private String nomeUC;
	double[][] notas;
	

	public LivroNotas(String disciplina, int numAlunos, int numAvaliacoes) {
		this.nomeUC = disciplina;		
		this.notas = new double[numAlunos][numAvaliacoes];
	}

	public String getNomeUC() {
		return this.nomeUC;
	}

	public void adicionarNota(double nota, int idAluno, int idAvaliacao) {
		this.notas[idAluno][idAvaliacao] = nota;
	}
	
	/*
	 * 3 notas  3 alunos
	 * 
	 * Aluno 0 --> Nota 0	Nota 1	Nota 2 --> media 0
	 * Aluno 1 --> Nota 0	Nota 1	Nota 2 --> media 1
	 * Aluno 2 --> Nota 0	Nota 1	Nota 2 --> media 2
	 * 
	 */
	
	public double [] calcularMediaPorAluno() {
		
		double medias [] = new double [notas.length];
		double total = 0, media;
		
		for (int i = 0; i < notas.length; i++) { //linhas
			for (int j = 0; j < notas[i].length; j++) { //colunas
				total += notas[i][j];
			}
			media = total/notas[i].length;
			medias[i] = media;
			total = 0;
		}
		
		return medias;	
	}
	
	public  double calcularMediaPorAluno(int idAluno) {
		double total = 0, media = 0;
		
		for (int i = 0; i < notas[idAluno].length; i++) {
			total += this.notas[idAluno][i];
			media = total / notas[idAluno].length;
		}
		return media;
	}
}
