package java.com.day03;

//JavaBeans, VO(Value Object), DTO(Data Transfer Object)
public class Car {
	//1. �ʵ�(�������(object����),class����), data
	private String model;
	private int price;
	static int count;
	
	//2. ������(�޼���) - ��ü ������ �ڵ����� ȣ��Ǵ� �Լ�
	//default�����ڴ� �⺻������ �����ȴ�.
	//�����ڴ� class�̸��� �����ؾ��Ѵ�.
	//return�� ����.(void�Ұ�)
	//�����ڰ� �߰��Ǹ� default�����ڰ� ��������.
	//�����ڴ� Overloading�� �����Ѵ�.
	//�����ڰ� �ٸ������ �����ڸ� ȣ��
	public Car()
	{
		this(null,0);
	}
	
	public Car(String model)
	{
		this(model,7000);
	}
	
	public Car(String model,int price){//Ŭ������ �̸��� ���� ������ ������Ѵ�.
		System.out.println("�ڵ��� ��ü�� �����մϴ�.");
		this.model = model;
		this.price = price;
		count++;
	};
	
	//3.���(�Ϲݸ޼���), ����
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
