package study.java.day02;

public class NullCheck {
	public static void main(String[] args) {
		//��������(Method�ȿ� �����ϴ� ����)�� �ʱ�ȭ���� ������ ����� �� ����.
		int A=0;//�⺻�� Ÿ���� null���� �� �� ����.
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
		
		String name="������";
		String name2="������";
		String name3=new String("������");
		String name4=new String("������");
		name3+="1";
		name4+="1";
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(name2));
		System.out.println(System.identityHashCode(name3));
		System.out.println(System.identityHashCode(name4));
		
	}
}
