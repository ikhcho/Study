package study.java.inheritTest;

public class Car {
	String model;
	int price;
	Tire tire;
	
	public Car(String model, int price, Tire tire) {
		super();
		this.model = model;
		this.price = price;
		this.tire = tire;
	}

	public void print(){
		System.out.println("model = " + model);
		System.out.println("price = " + price);
		System.out.println("tire color = " + tire.getColor());
		System.out.println("tire color = " + tire.getRadis());
		tire.rolling();
	}
	
}
