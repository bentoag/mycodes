package trigonometria.bento;

public abstract class Forma {	
	

	private double a, b;
	
	//construtores sobrecarregados
	public Forma(double a) {
		this.a = a;
	};
	public Forma(double a, double b) {
		this.a = a;
		this.b = b;
	};
	
	//gets
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	
	//metodos para as  classes filhas implementarem
	public  abstract double calcularArea ();
	
}
