package study.java.day01;

public class OperatorTest {
public static void main(String[] args) {
	String s = "�ڹ�";
	String n = null;
	
	boolean b = n!=null && n.length()>0; //&&�� ���� ... ���� ���� ���� n!=null�� ���� ����Ǿ� &&�ڿ� �߸��� �������� ����ȴ�.
										 //��������(&&, ||��)�� ����, ��Ʈ������(&,|��)�� ���� ����
	System.out.println(s.length());
	System.out.println(b);
	//System.out.println(n.length());
	
	int i =10;
	b = i>10 && ++i>10;
	System.out.println("i = "+i+"  b = "+b);
	
	int score = 95;
	String grade = score>90? "A����" : "B����";
	
	System.out.println(grade);
	}
}
