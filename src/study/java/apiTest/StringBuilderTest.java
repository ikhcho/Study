package study.java.apiTest;

public class StringBuilderTest {
	public static void main(String[] args) {
		String str="�ڹ�";
		System.out.println(System.identityHashCode(str));
		str += "���α׷�";
		System.out.println(System.identityHashCode(str));
		
		StringBuffer sb = new StringBuffer("�ڹ�");
		System.out.println(System.identityHashCode(sb));
		sb.append("���α׷�");
		System.out.println(System.identityHashCode(sb));
		
		StringBuilder sd = new StringBuilder("�ڹ�");
		System.out.println(System.identityHashCode(sd));
		sd.append("���α׷�");
		System.out.println(System.identityHashCode(sd));
	}
}
