package study.java.day04;

public class InheritTest {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.a);
		child.print();//오버라이드됨
		
	}
}


class Child extends Parent{
	String a="자바";
	Child(){
		System.out.println("childe생성자");
	}
	
	@Override
	void print(){
		System.out.println("자식이 가진 print함수");
	}
}

class Parent{

	int a=10;
	private int a2=20;
	
	Parent(){
		System.out.println("생성자");
	}
	
	void print(){
		System.out.println("부모가 가진 print함수이다.");
	}
	
	private void print2(){
		System.out.println("부모가 가진 print2함수이다.");
	}
}