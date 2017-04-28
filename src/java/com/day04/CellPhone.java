package java.com.day04;

public class CellPhone {
	private String model;
	private int price;
	
	//상속... 생성자가 추가되면 default 생성자가 제거된다.
	public CellPhone(){
		System.out.println("CellPhone 생성자");
	}
	public CellPhone(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	public String getModel(){
		return model;
	}
	public int getPrice(){
		return price;
	}
}
