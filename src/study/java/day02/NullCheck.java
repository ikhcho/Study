package study.java.day02;

public class NullCheck {
	public static void main(String[] args) {
		//지역변수(Method안에 존재하는 변수)는 초기화되지 않으면 사용할 수 없다.
		int A=0;//기본형 타입은 null값을 줄 수 없다.
		//System.out.println(A);
		
		String b=null;
		String c="";
		String d=new String();

		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(b==c);
		System.out.println(b==d);
		System.out.println(c==d);
		System.out.println(c.equals(b));
		System.out.println(d.equals(b));
		System.out.println(c.equals(d));
		
		String name="조익현";
		String name2="조익현";
		String name3=new String("조익현");
		String name4=new String("조익현");
		name3+="1";
		name4+="1";
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(name2));
		System.out.println(System.identityHashCode(name3));
		System.out.println(System.identityHashCode(name4));
		
	}
}
