package study.java.inheritTest;

public class KumhoTire extends Tire{
	String productNo;
	
	
	
	public KumhoTire(String color, int radis, String productNo) {
		super(color, radis);
		this.productNo = productNo;
	}

	@Override
	public void rolling(){
		System.out.println(productNo + "��ǰ Ÿ�̾ �������ϴ�.");
		System.out.println("color=" + getColor());
	}

	public void twinkle(){
		
	}
}
