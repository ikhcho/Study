package study.java.apiTest;

public class StringBuilderTest {
	public static void main(String[] args) {
		String str="자바";
		System.out.println(System.identityHashCode(str));
		str += "프로그램";
		System.out.println(System.identityHashCode(str));
		
		StringBuffer sb = new StringBuffer("자바");
		System.out.println(System.identityHashCode(sb));
		sb.append("프로그램");
		System.out.println(System.identityHashCode(sb));
		
		StringBuilder sd = new StringBuilder("자바");
		System.out.println(System.identityHashCode(sd));
		sd.append("프로그램");
		System.out.println(System.identityHashCode(sd));
	}
}
