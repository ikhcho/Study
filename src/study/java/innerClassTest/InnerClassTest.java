package study.java.innerClassTest;

public class InnerClassTest {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println(oc.a);
		System.out.println(oc.b);
		oc.print();
		oc.print2();
		
		//OuterClass.InnerClass inc = new OuterClass().new InnerClass();
		OuterClass.InnerClass inc1 = oc.new InnerClass();
		System.out.println(inc1.c);
		inc1.print3();
		
		OuterClass.InnerClass2 inc2 = new OuterClass.InnerClass2();//static class
		System.out.println(inc2.e);
		System.out.println(inc2.f);
		inc2.print5();
		OuterClass.InnerClass2.print6();
		
		oc.show("class메소드 테스트");
	}
}
