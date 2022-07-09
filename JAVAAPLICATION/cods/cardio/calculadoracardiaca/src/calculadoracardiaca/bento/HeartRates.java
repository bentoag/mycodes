package calculadoracardiaca.bento;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HeartRates {
	private String nome, sobrenome;		
	private int diaNasc, mesNasc, anoNasc;
	private int idade;
		
	
	public HeartRates (String nome, String sobrenome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.diaNasc = dia;
		this.mesNasc = mes;
		this.anoNasc = ano;		
		this.idade = calculaIdade();
		
	}
	
	public String getDataNascimento() {
		return this.diaNasc + "/" + this.mesNasc + "/" + this.anoNasc;
	}
	
	public int calculaIdade() {
		int anoNasc = this.anoNasc;
		int mesNasc = this.mesNasc;
		int diaNasc = this.diaNasc;
		
		Calendar agora = GregorianCalendar.getInstance();
		int anoatual = agora.get(Calendar.YEAR);	
		int mesatual = agora.get(Calendar.MONTH);
		int diaatual = agora.get(Calendar.DAY_OF_MONTH);
		int idade = anoatual - anoNasc;
		
		if(mesatual < mesNasc) {
			idade--;
		}else {
			if(diaatual < diaNasc) {
				idade--;
			}
		}
		
		return idade;
	}
	
	public int frequenciaCardioMax () {		
		int frequenciaMax = 220 - this.idade;
		return frequenciaMax;
	}
	public String frequenciaAlvo() {
		int frequenciaAlvoMax = (int) (frequenciaCardioMax()*0.85);
		int frequenciaAlvoMin = (int)(frequenciaCardioMax()*0.50);
		
		return "deve estar entre:  " + frequenciaAlvoMin + " e " + frequenciaAlvoMax;	
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDiaNasc() {
		return this.diaNasc;
	}

	public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}

	public int getMesNasc() {
		return this.mesNasc;
	}

	public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}

	public int getAnoNasc() {
		return this.anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	
}

