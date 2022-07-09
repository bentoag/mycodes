
public class Bag implements ICollection {

	private Object[] objetos;
	
	public Bag(int tam) {
		this.objetos = new Object[tam];
	}

	@Override
	public void add(Object o) {
		for (int i = 0; i < objetos.length; i++) {
			if (this.objetos[i] == null) {
				this.objetos[i] = o;
				break;
			}			
		}
	}

	@Override
	public int count() {
		int count = 0;
		for (int i = 0; i < objetos.length; i++) {
			if (this.objetos[i] != null) count++;
		}
		return count;
	}

	@Override
	public void remove(Object o) {
		for (int i = 0; i < objetos.length; i++) {
			if (this.objetos[i] != null 
					&& this.objetos[i].equals(o)) {
				this.objetos[i] = null;
			}			
		}
		
	}

	@Override
	public Object[] toArray() {
		Object[] preenchido =
				new Object[this.count()];
		int i = 0;
		for (int j = 0; j < this.objetos.length; j++) {			
			if (this.objetos[j] != null) {
				preenchido[i++] = this.objetos[j];
			}
		}
		
		return preenchido;		
		
	}

}
