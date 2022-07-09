package trigonometria.bento;

public class Circulo extends Forma {
	private double area;
	
	public Circulo(double raio) {
		super(raio);
	}
	

	//metodo implementado para o circulo
	@Override
	public double calcularArea() {
		double raio = super.getA();
		this.area = ((3.14)*(raio*raio));
		return area;
	}

	

	

}
