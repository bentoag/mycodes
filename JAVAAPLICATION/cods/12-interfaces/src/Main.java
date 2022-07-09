
public class Main {

	public static void main(String[] args) {
		
		ICollection colecao = new Bag(20);
		
		System.out.println(colecao.count() == 0);		
		
		colecao.add("texto");
		
		System.out.println(colecao.count() == 1);
		
		System.out.println(colecao.toArray()[0] != null);
		
		colecao.add(525);
		
		System.out.println(colecao.count() == 2);
		System.out.println(colecao.toArray()[0] != null);
		System.out.println(colecao.toArray()[1] != null);
		
		colecao.remove("texto");
		
		System.out.println(colecao.count() == 1);
		System.out.println(colecao.toArray()[0] != null);
		
		colecao.add(true);
		
		System.out.println(colecao.count() == 2);
		System.out.println(colecao.toArray()[0] != null);
		System.out.println(colecao.toArray()[1] != null);
		
		
		
		
	}
}
