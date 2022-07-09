package trigonometria.bento;

public class Triangulo extends Forma {
  private double area;
  
	public Triangulo(double base, double altura) {
	super(base, altura);
	}
	
	//metodo implementado para o triangulo	
	@Override
	public double calcularArea() {
		double base = super.getA();
		double altura = super.getB();
		
		this.area = ((base*altura)/2);
		return area;
	}
}
