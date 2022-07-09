// a inteface é TOTALMENTE ABSTRATA!
public interface ICollection {

	void add(Object o);
	
	int count();
	
	void remove(Object o);
	
	Object[] toArray();
	
}
