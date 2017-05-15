package study.java.genericTest;

import java.util.ArrayList;

class Box{
	private String model;

	public Box(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}


class Box2<T>{
	private T model;

	public Box2(T model) {
		super();
		this.model = model;
	}

	public T getModel() {
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Box2 [model=" + model + "]";
	}
	
}

class Product<key,value>{
	private key model;
	private value price;
	
	public Product(key model, value price) {
		super();
		this.model = model;
		this.price = price;
	}

	public key getModel() {
		return model;
	}

	public void setModel(key model) {
		this.model = model;
	}

	public value getPrice() {
		return price;
	}

	public void setPrice(value price) {
		this.price = price;
	}
}

class Car{
	private String color;

	public Car(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

class Unit<A,B,C>{
	private A type;
	private B amount;
	private C price;
	public A getType() {
		return type;
	}
	public void setType(A type) {
		this.type = type;
	}
	public B getAmount() {
		return amount;
	}
	public void setAmount(B amount) {
		this.amount = amount;
	}
	public C getPrice() {
		return price;
	}
	public void setPrice(C price) {
		this.price = price;
	}
	
	public int sum(int amount, int price){
		return amount * price; 
	}
}

class Pair<K,V>{
	K key;
	V value;
	
	
	public Pair() {
		super();
	}
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

class Util{
	
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
		
		return p1.getKey().equals(p2.getKey()) && p2.getValue().equals(p2.getValue());
	}
	
	public static <K,V> V getValue(Pair<K,V> p1, K k){
		if(p1.getKey().equals(k)){
			return p1.getValue();
		}else return null;
	}
}

public class GenericTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("자바");
		
		System.out.println(list);
		//int i = (Integer)list.get(1);// compile error
		//System.out.println(i);
		
		ArrayList<String> sList = new ArrayList();
		sList.add("자바");
		//int j = (Integer)sList.get(0); //runtime error
		//System.out.println(j);
		
		Box2<Integer> intBox = new Box2<>(100);
		System.out.println(intBox);
	
		Product<String, Integer> toy = new Product("LEGO", 10);
		System.out.println(toy.getModel());
		System.out.println(toy.getPrice());
		
		Product<Car, Integer> car = new Product(new Car("RED"), 100);
		System.out.println(car.getModel().getColor());
		car.setModel(new Car("YELLOW"));
		System.out.println(car.getModel().getColor());
	
		Unit<String, Integer, Integer>marin = new Unit();
		marin.setType("terran");
		marin.setAmount(20);
		marin.setPrice(50);
		System.out.println(marin.sum(marin.getAmount(), marin.getPrice()));
		
		test();
		System.out.println(boxing("zz").getModel());
	}
	
	public static void test(){
		Pair<String, Integer> p1 = new Pair();
		p1.setKey("A");
		p1.setValue(10);
		
		Pair<String, Integer> p2 = new Pair();
		p2.setKey("B");
		p2.setValue(20);
		
		System.out.println(Util.compare(p1, p2));
		
 	}
	
	public static<T> Box2<T> boxing(T t){
		Box2<T> testbox = new Box2(t);
		return testbox;
	}
}
