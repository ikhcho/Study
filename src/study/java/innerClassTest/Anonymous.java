package study.java.innerClassTest;

class MyClass{
	void print(){
		System.out.println("������ print�޼����Դϴ�.");
	}
}

class Child extends MyClass{
	void print(){
		System.out.println("�����ǵ� print �޼����Դϴ�.");
	}
}

class Child2 extends MyClass{
	public void print(){
		System.out.println("�����ǵ� print2 �޼����Դϴ�.");
	}
}

public class Anonymous {
	public static void main(String[] args) {
		MyClass a = new Child();
		a.print();
		
		MyClass b = new MyClass(){
			public void print(){
				System.out.println("���� �����ǵ� 3 print �޼���");
			
			}
		};
		b.print();
		method(new MyClass(){//�����ǵ� �͸�Ŭ����	
			public void print(){
				System.out.println("���� �����ǵ� 4 print �޼���");
			}
		});
		
		//�͸� class ���1
		(new MyClass(){
			public void print(){
				System.out.println("�͸� class���� �����ǵ� print�޼����Դϴ�.");
			}
		}).print();
		
		//�͸� class ���2
		MyClass m = new MyClass(){
			public void print(){
				System.out.println("�͸� class���� �����ǵ� print�޼����Դϴ�. 2��°���");
			}
		};
		m.print();
		
		//�͸� class ���3
		MyClass s = new MyClass(){
			public void show(){
				System.out.println("�͸� class���� �����ǵ� show�޼����Դϴ�.");
			}
		};
		//s.show();
		
	}
	public static void method(MyClass my){
		my.print();
	}
}
