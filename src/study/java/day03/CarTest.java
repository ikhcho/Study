package study.java.day03;

public class CarTest {
	public static void main(String[] args) {
		// 1. 객체참조변수선언
		int a;
		Car c1;

		// 2. 객체생성
		c1 = new Car();
		c1.setModel("티코");
		c1.setPrice(1000000);
		c1.print();
		
		// 3. 선언과 생성
		Car c2 = new Car();
		c2.setModel("벤츠");
		c2.print();
		
		// 4.선언+생성+초기화
		Car c3 = new Car("소나타", 4000);
		c3.print();
		
		// 4.선언+생성+초기화
		Car c4 = new Car("BMW");
		c4.print();
		
	}
}
