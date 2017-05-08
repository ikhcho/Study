package study.java.day03;

class Person2{
	static int numberOfPersons=0;
	int age;
	String name;
	
	Person2(){
		age = 12;
		name = "Anonymous";
	}
	
	Person2(int age, String name){
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}
	
	public void selfIntroduce(){
		System.out.println("�� �̸��� " + name + "�̸�, ���̴� " + age + "�� �Դϴ�.");
	}
	
	public void getPopulation(){
		System.out.println(numberOfPersons);
	}
}
public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 pp = new Person2(3,"ö��");
		pp.selfIntroduce();
		pp.getPopulation();
	}

}
