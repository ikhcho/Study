package java.com.day04;

public class DmbCellphone extends CellPhone{
	
	
	//String model;
	//int price;
	int[] channel;
	
	//상속... 부모 클래스 상속시 defualt 생성자가 생성된다.
	/* 따라서 상위 클래스에 defualt 생성자가 없다면 super() 오류
	public DmbCellphone(){
		super();
	}
	*/
	
	/*혹은 상위 클래스 생성자와 동일한 생성자를 만들거나 super(null,0)초기화를 시켜준다.
	public DmbCellphone(String model, int price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}
	*/
	public DmbCellphone(String model, int price, int[] channel) {
		super(model,price);
		this.channel = channel;
		
	}
	void print(){
		System.out.println(getModel()+getPrice()+channel[0]);
	}
	
}
