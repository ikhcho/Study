package study.java.day03;



public class Person {	
	
	String name;
	String major;
	int age;
	Car mycar;
	
	public Person(){
		System.out.println("default持失切");
	}
	
	public Person(String name, String major, int age){
		System.out.println("arg3 持失切");
		this.name = name;
		this.major = major;
		this.age = age;
	}
	
	public Person(String name, String major, int age, Car c){
		System.out.println("arg3 持失切");
		this.name = name;
		this.major = major;
		this.age = age;
		this.mycar = c;
	}
	
}
