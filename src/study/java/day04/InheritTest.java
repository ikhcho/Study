package study.java.day04;

public class InheritTest {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.a);
		child.print();//�������̵��
		
	}
}


class Child extends Parent{
	String a="�ڹ�";
	Child(){
		System.out.println("childe������");
	}
	
	@Override
	void print(){
		System.out.println("�ڽ��� ���� print�Լ�");
	}
}

class Parent{

	int a=10;
	private int a2=20;
	
	Parent(){
		System.out.println("������");
	}
	
	void print(){
		System.out.println("�θ� ���� print�Լ��̴�.");
	}
	
	private void print2(){
		System.out.println("�θ� ���� print2�Լ��̴�.");
	}
}