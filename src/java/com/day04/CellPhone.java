package java.com.day04;

public class CellPhone {
	private String model;
	private int price;
	
	//���... �����ڰ� �߰��Ǹ� default �����ڰ� ���ŵȴ�.
	public CellPhone(){
		System.out.println("CellPhone ������");
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
