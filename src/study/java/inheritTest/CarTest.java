package study.java.inheritTest;


//������ �׽�Ʈ
public class CarTest {
	
	public static void main(String[] args) {
		Tire tire1 = new KoreaTire("Black", 50, "�ѱ�Ÿ�̾�");
		Car car1 = new Car("����",6000, tire1);
		car1.print();
		
		Tire tire2 = new KumhoTire("Silver", 45, "��ȣŸ�̾�");
		Car car2 = new Car("�ƿ��",5000, tire2);
		car2.print();
		
		System.out.println(tire1 instanceof KoreaTire); // instanceof
		System.out.println(tire2 instanceof Tire); // instanceof
		
		//tire2.twinkle(); //Tire > KumhoTire (�ڵ� ĳ����) ... ���� ���� Ŭ������ KumhoTire�� �޼ҵ带 ������ �� ����.
		//Casting
		KumhoTire castTire2 = (KumhoTire)tire2;
		castTire2.twinkle();//
	
		
	}

}
