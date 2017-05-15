package study.java.innerClassTest;

class MyClass{
	void print(){
		System.out.println("본래의 print메서드입니다.");
	}
}

class Child extends MyClass{
	void print(){
		System.out.println("재정의된 print 메서드입니다.");
	}
}

class Child2 extends MyClass{
	public void print(){
		System.out.println("재정의된 print2 메서드입니다.");
	}
}

public class Anonymous {
	public static void main(String[] args) {
		MyClass a = new Child();
		a.print();
		
		MyClass b = new MyClass(){
			public void print(){
				System.out.println("메인 재정의된 3 print 메서드");
			
			}
		};
		b.print();
		method(new MyClass(){//재정의된 익명클래스	
			public void print(){
				System.out.println("메인 재정의된 4 print 메서드");
			}
		});
		
		//익명 class 사용1
		(new MyClass(){
			public void print(){
				System.out.println("익명 class에서 재정의된 print메서드입니다.");
			}
		}).print();
		
		//익명 class 사용2
		MyClass m = new MyClass(){
			public void print(){
				System.out.println("익명 class에서 재정의된 print메서드입니다. 2번째방법");
			}
		};
		m.print();
		
		//익명 class 사용3
		MyClass s = new MyClass(){
			public void show(){
				System.out.println("익명 class에서 재정의된 show메서드입니다.");
			}
		};
		//s.show();
		
	}
	public static void method(MyClass my){
		my.print();
	}
}
