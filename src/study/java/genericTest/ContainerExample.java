package study.java.genericTest;

/*#2
class Container<T>{
	T name;
	
	public void set(T name){
		this.name = name;
	}
	
	public T get(){
		return name;
	}
}
*/
class Container<K,T>{
	K k;
	T t;
	
	public void set(K k, T t){
		this.k = k;
		this.t= t;
	}
	
	public K getKey(){
		return k;
	}
	
	public T getValue(){
		return t;
	}
}

class ChildPair<K,V> extends Pair<K,V>{
	K k;
	V v;
	public ChildPair(K k, V v) {
		super();
		this.k = k;
		this.v = v;
	}
	
}

public class ContainerExample {
	public static void main(String[] args) {
		/*#2
		Container<String> container1 = new Container<String>();
		container1.set("È«±æµ¿");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);;
		int value = container2.get();
		*/
		
		Container<String, String> container1 = new Container<String, String>();
		container1.set("È«±æµ¿","µµÀû");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("È«±æµ¿",36);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
		Pair<String, Integer> pair = new Pair("È«±æµ¿",35);
		Integer age1 = Util.getValue(pair,"È«±æµ¿");
		System.out.println(age1);

		ChildPair<String, Integer> childpair = new ChildPair("È«»ï¿ø",20);
		Integer childAge = Util.getValue(childpair,"È«»ï¼ø");
		System.out.println(childAge);
	}
}
