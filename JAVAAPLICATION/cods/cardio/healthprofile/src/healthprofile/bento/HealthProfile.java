package healthprofile.bento;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HealthProfile {

	private String nome, sobrenome;
	private float altura, peso, imc;
	private int diaNasc, mesNasc, anoNasc;
	private int idade;

	public HealthProfile(String nome, String sobrenome, int dia, int mes, int ano, float peso, float altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.diaNasc = dia;
		this.mesNasc = mes;
		this.anoNasc = ano;
		this.peso = peso;
		this.altura = altura;
		this.idade = calculaIdade();
		this.imc = calcularIMC(peso, altura);

	}
	
	//Verifica se a data digitada esta correta
	public boolean verificaDataNasc() {
		if (this.anoNasc >= 1900) {
			if (this.mesNasc > 0 && this.mesNasc < 13) {
				if (this.mesNasc == 1 || this.mesNasc == 3 || this.mesNasc == 5 || this.mesNasc == 7
						|| this.mesNasc == 8 || this.mesNasc == 10 || this.mesNasc == 12) {
					if (this.diaNasc > 0 && this.diaNasc <= 31) {
						return true;
					} else {
						return false;
					}
				} else if (((this.anoNasc % 4) == 0 && (this.anoNasc % 100) != 0) && this.mesNasc == 2) {
					if (this.diaNasc > 0 && this.diaNasc <= 29) {
						return true;
					} else {
						return false;
					}
				} else if (this.mesNasc == 2) {
					if (this.diaNasc > 0 && this.diaNasc <= 28) {
						return true;
					} else {
						return false;
					}
				} else {
					if (this.diaNasc > 0 && this.diaNasc <= 30) {
						return true;
					} else {
						return false;
					}
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	//metodo para exibir data nasc
	public String getDataNascimento() {
		if (verificaDataNasc()) {
			return this.diaNasc + "/" + this.mesNasc + "/" + this.anoNasc;
		} else {
			return "Data de Nascimento Inv�lida.";
		}

	}
	//metodo para calcular idade
	public int calculaIdade() {
		int anoNasc = this.anoNasc;
		int mesNasc = this.mesNasc;
		int diaNasc = this.diaNasc;
		int idade;

		Calendar agora = GregorianCalendar.getInstance();
		int anoatual = agora.get(Calendar.YEAR);
		int mesatual = agora.get(Calendar.MONTH)+ 1;
		int diaatual = agora.get(Calendar.DAY_OF_MONTH);

		if (verificaDataNasc()) {
			
			idade = anoatual - anoNasc;

			if (mesatual < mesNasc) {
				idade--;
			} else {
				if (diaatual < diaNasc) {
					idade--;
				}
			}
			return idade;
		} else {
			return 0;
		}

	}

	// Metodos para Calcular Freq. Cardiaca

	public int frequenciaCardioMax() {
		if (verificaDataNasc()) {
			int frequenciaMax = 220 - this.idade;
			return frequenciaMax;
		} else {
			return 0;
		}

	}

	public String frequenciaAlvo() {
		if (verificaDataNasc()) {
			int frequenciaAlvoMax = (int) (frequenciaCardioMax() * 0.85);
			int frequenciaAlvoMin = (int) (frequenciaCardioMax() * 0.50);
			return "deve estar entre:  " + frequenciaAlvoMin + " e " + frequenciaAlvoMax + " bt/min";
		} else {
			return "Data de nascimento Inv�lida, n�o podemos calcular sua frequ�ncia ideal.";
		}

	}

	// M�todo calcular IMC
	public float calcularIMC(float peso, float altura) {
		if (peso > 0 && altura > 0) {
			return this.imc = (this.peso / (this.altura * this.altura));
		}

		return -1;
	}

	public String mensagemErro() {
		return "Par�metro inv�lido";
	}

	// metodos get and set
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

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return this.peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getIMC() {
		return this.imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
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

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}