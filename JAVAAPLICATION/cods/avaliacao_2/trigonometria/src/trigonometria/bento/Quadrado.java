package trigonometria.bento;

public class Quadrado extends Forma {
	private double area;	
	

	public Quadrado(double lado) {
		super(lado);
	}
	
	//metodo implementado para o quadrado
	@Override
	public double calcularArea() {
		double lado = super.getA();
		this.area = (lado*lado);
		return area;
	}

	

	
}
