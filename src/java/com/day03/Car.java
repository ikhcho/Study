package java.com.day03;

//JavaBeans, VO(Value Object), DTO(Data Transfer Object)
public class Car {
	//1. 필드(멤버변수(object변수),class변수), data
	private String model;
	private int price;
	static int count;
	
	//2. 생성자(메서드) - 객체 생성시 자동으로 호출되는 함수
	//default생성자는 기본적으로 제공된다.
	//생성자는 class이름과 동일해야한다.
	//return은 없다.(void불가)
	//생성자가 추가되면 default생성자가 지워진다.
	//생성자는 Overloading을 지원한다.
	//생성자가 다른모양의 생성자를 호출
	public Car()
	{
		this(null,0);
	}
	
	public Car(String model)
	{
		this(model,7000);
	}
	
	public Car(String model,int price){//클래스와 이름이 같고 리턴이 없어야한다.
		System.out.println("자동차 객체를 생성합니다.");
		this.model = model;
		this.price = price;
		count++;
	};
	
	//3.기능(일반메서드), 동작
	public void print(){
		System.out.println(model);
		System.out.println(price);
	}
	//setter & getter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
