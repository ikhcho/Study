package java.com.day04;

public class DmbCellphone extends CellPhone{
	
	
	//String model;
	//int price;
	int[] channel;
	
	//���... �θ� Ŭ���� ��ӽ� defualt �����ڰ� �����ȴ�.
	/* ���� ���� Ŭ������ defualt �����ڰ� ���ٸ� super() ����
	public DmbCellphone(){
		super();
	}
	*/
	
	/*Ȥ�� ���� Ŭ���� �����ڿ� ������ �����ڸ� ����ų� super(null,0)�ʱ�ȭ�� �����ش�.
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
