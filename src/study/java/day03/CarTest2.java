package study.java.day03;

public class CarTest2 {
	public static void main(String[] args) {
		
		//�迭����+����
		Car[] cars = new Car[5];
		
		for(int i=0; i<cars.length; i++){
			cars[i]=new Car();
		}
		System.out.println(cars[0].count);
		
	}
}
