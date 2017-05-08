package study.java.day01;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = '조';
		char c2 = '익';
		char c3 = '현';
		char c4 = '\0';
		
		String name = "조익현";
		System.out.println("test"+c4);
		
		Integer i2 = 100;
		String s = Integer.toString(i2);
		System.out.println(s+200);
		
		String s1="조익현";//stack에 주소를 저장, heap에 값을 저장
		String s2="조익현";
		String s3=new String("조익현");
		String s4=new String("조익현");
		System.out.println(s1==s2);//==은 주소를 비교
		System.out.println(s1.equals(s2));
		s1= s1+"dd";
		s2= s2+"dd";
		System.out.println(s1==s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
	}

}
