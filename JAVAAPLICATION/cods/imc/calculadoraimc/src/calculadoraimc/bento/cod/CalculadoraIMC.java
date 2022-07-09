package calculadoraimc.bento.cod;

/*
 * Calculadora de Indice de Massa Corporal
 * Peso  em quilogramas
 * Altura em metros
 */
public class CalculadoraIMC {
	private float altura, peso, imc;
	
	public CalculadoraIMC(float peso, float altura){
		this.peso = peso;
		this.altura = altura;
	}
	public float getAltura() {
		return this.altura;
	}

	public float getPeso() {
		return this.peso;
	}
	public float getIMC() {
		return this.imc;
	}
	
	public float calcularIMC(float peso, float altura) {
		if(peso > 0 && altura > 0) {
			return this.imc = (this.peso / (this.altura*this.altura));			
		}
		
		return -1;
	}
	
	
}
