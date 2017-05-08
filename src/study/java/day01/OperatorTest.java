package study.java.day01;

public class OperatorTest {
public static void main(String[] args) {
	String s = "자바";
	String n = null;
	
	boolean b = n!=null && n.length()>0; //&&는 단축 ... 순서 논리에 따라 n!=null이 먼저 수행되어 &&뒤에 잘못된 문법에도 실행된다.
										 //논리연산자(&&, ||등)은 단축, 비트연산자(&,|등)은 전부 실행
	System.out.println(s.length());
	System.out.println(b);
	//System.out.println(n.length());
	
	int i =10;
	b = i>10 && ++i>10;
	System.out.println("i = "+i+"  b = "+b);
	
	int score = 95;
	String grade = score>90? "A학점" : "B학점";
	
	System.out.println(grade);
	}
}
