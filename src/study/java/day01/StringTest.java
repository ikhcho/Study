package study.java.day01;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = '��';
		char c2 = '��';
		char c3 = '��';
		char c4 = '\0';
		
		String name = "������";
		System.out.println("test"+c4);
		
		Integer i2 = 100;
		String s = Integer.toString(i2);
		System.out.println(s+200);
		
		String s1="������";//stack�� �ּҸ� ����, heap�� ���� ����
		String s2="������";
		String s3=new String("������");
		String s4=new String("������");
		System.out.println(s1==s2);//==�� �ּҸ� ��
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
