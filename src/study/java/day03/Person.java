package study.java.day03;



public class Person {	
	
	String name;
	String major;
	int age;
	Car mycar;
	
	public Person(){
		System.out.println("default������");
	}
	
	public Person(String name, String major, int age){
		System.out.println("arg3 ������");
		this.name = name;
		this.major = major;
		this.age = age;
	}
	
	public Person(String name, String major, int age, Car c){
		System.out.println("arg3 ������");
		this.name = name;
		this.major = major;
		this.age = age;
		this.mycar = c;
	}
	
}
