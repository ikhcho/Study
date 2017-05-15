package study.java.inheritTest;


//다형성 테스트
public class CarTest {
	
	public static void main(String[] args) {
		Tire tire1 = new KoreaTire("Black", 50, "한국타이어");
		Car car1 = new Car("벤츠",6000, tire1);
		car1.print();
		
		Tire tire2 = new KumhoTire("Silver", 45, "금호타이어");
		Car car2 = new Car("아우디",5000, tire2);
		car2.print();
		
		System.out.println(tire1 instanceof KoreaTire); // instanceof
		System.out.println(tire2 instanceof Tire); // instanceof
		
		//tire2.twinkle(); //Tire > KumhoTire (자동 캐스팅) ... 따라서 하위 클래스인 KumhoTire의 메소드를 실행할 수 없다.
		//Casting
		KumhoTire castTire2 = (KumhoTire)tire2;
		castTire2.twinkle();//
	
		
	}

}
