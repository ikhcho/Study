package java.com.day03;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1,p2,p3,p4;
		
		p1=new Person();
		System.out.println("Person����");
		System.out.println("�̸� : " +p1.name);
		System.out.println("���� : " +p1.major);
		System.out.println("���� : " +p1.age);
		
		Car c = new Car("zzz",2300);
		p2=new Person("A","B",27,c);
		System.out.println("Person����");
		System.out.println("�̸� : " +p2.name);
		System.out.println("���� : " +p2.major);
		System.out.println("���� : " +p2.age);
		System.out.println("�ڵ����� : " +p2.mycar.getModel());
		System.out.println("�ڵ������� : " +p2.mycar.getPrice());
		
		String s1 = new String("�ڹ�");
		char[] arr = {'J','V'};
		String s2 = new String(arr);
		System.out.println(s2);
	}

}
