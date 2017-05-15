package study.java.innerClassTest;

public class OuterClass {

	// 1.멤버변수
	int a = 10;// instance 변수
	static int b = 20;// class 변수

	// 메서드
	void print() {
		System.out.println("instance 메서드:" + (a + b));
	}

	static void print2() {
		System.out.println("static 메서드:" + b);
	}

	// Inner class
	class InnerClass {
		// 멤버변수
		int c = 10;// instance 변수
		// static int d=20;//class 변수 불가

		void print3() {
			System.out.println("instance 메서드:" + c);
		}

		/*
		 * 불가 static void print4(){ System.out.println("static 메서드:"+b); }
		 */
	}

	// static Inner class
	static class InnerClass2 {
		// 멤버변수
		int e = 10;// instance 변수
		static int f = 20;// class 변수 불가

		void print5() {
			System.out.println("instance 메서드:" + (e + f));
		}

		static void print6() {
			System.out.println("static 메서드:" + f);
		}

	}
	
	// Method inner class
	// Java8 부터 final 생략가능
	void show(String msg){//매개변수도 지역변수
		//지역변수
		String name="조익현"; 
		//final String version7
		class InnerClass3{
			int i=10;
			void print7(){
				System.out.println("local 클래스 : msg = "+ msg + "name = " + name + " i = " + i);
			}
		}
		
		InnerClass3 local = new InnerClass3();
		local.print7();
		
		/* Method 안(로컬 클래스)에는 static 안됨
		static InnerClass4{
		}
		*/
	}
}
