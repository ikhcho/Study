package study.java.day03;

public class CarTest {
	public static void main(String[] args) {
		// 1. ��ü������������
		int a;
		Car c1;

		// 2. ��ü����
		c1 = new Car();
		c1.setModel("Ƽ��");
		c1.setPrice(1000000);
		c1.print();
		
		// 3. ����� ����
		Car c2 = new Car();
		c2.setModel("����");
		c2.print();
		
		// 4.����+����+�ʱ�ȭ
		Car c3 = new Car("�ҳ�Ÿ", 4000);
		c3.print();
		
		// 4.����+����+�ʱ�ȭ
		Car c4 = new Car("BMW");
		c4.print();
		
	}
}
