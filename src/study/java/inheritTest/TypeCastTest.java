package study.java.inheritTest;


class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}


public class TypeCastTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//A�� ��� ���� ��ü�� A�� ���� �� �ִ�
		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		A a4 = new E();
		
		B b1 = new D();
		C c1 = new E();
		
		//D�� B�� ���� ��ü�̸� A�� ��ū ��ü, C,E�� ������ �����ʴ� ��ü�̴�
		if(a1 instanceof B){
			B b2 = (B)a1;//down cast
		}
		
		if(a2 instanceof C){
			C c2 = (C)a2;
		}
	}
	
}
