package study.java.day01;

public class VariableTest {
	//��ü����->�ڵ��ʱ�ȭ
	
	public static void main(String[] args){
		//�������� �����̸�
		//��������->�ʱ�ȭ���� ������ ����� �� ����=�ݵ�� �ʱ�ȭ
		//1.8���� �⺻���� �ִ�.
		byte by=30;
		byte re=(byte)(by+(by++)+(++by));
		System.out.println("byteŸ��:"+re);
		
		short s=32767;
		
		int i=2147483647;
		i++;
		System.out.println("intŸ��:"+i);
		
		long l= 2147483648l;//L,l�� ������
		l++;
		
		char c='A';//65
		int ic='a';//97
		System.out.println(ic);
		
		boolean b=true;
		System.out.println("booleanŸ��:"+b);
		
		float f = 3.14f;
		System.out.println("floatŸ��:"+f);
		
		double d = 3.14;
		System.out.println("floatŸ��:"+d);
		
		//����ȯ
		//1.�ڵ�(ū��=������)
		int i3=100;
		long a=i3;
		System.out.println(a);
		
		
		//2.����(������=(������Ÿ��)ū��) , �� �ս� ���
		int i4=(int)a;
		System.out.println(i4);
	}
	
}
