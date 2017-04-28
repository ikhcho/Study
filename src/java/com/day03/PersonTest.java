package java.com.day03;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1,p2,p3,p4;
		
		p1=new Person();
		System.out.println("Person정보");
		System.out.println("이름 : " +p1.name);
		System.out.println("전공 : " +p1.major);
		System.out.println("나이 : " +p1.age);
		
		Car c = new Car("zzz",2300);
		p2=new Person("A","B",27,c);
		System.out.println("Person정보");
		System.out.println("이름 : " +p2.name);
		System.out.println("전공 : " +p2.major);
		System.out.println("나이 : " +p2.age);
		System.out.println("자동차모델 : " +p2.mycar.getModel());
		System.out.println("자동차가격 : " +p2.mycar.getPrice());
		
		String s1 = new String("자바");
		char[] arr = {'J','V'};
		String s2 = new String(arr);
		System.out.println(s2);
	}

}
