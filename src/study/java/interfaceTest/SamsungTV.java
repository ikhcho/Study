package study.java.interfaceTest;

public class SamsungTV implements TV {
	
	@Override
	public void powerOn(){
		System.out.println(getClass().getSimpleName()+"������ �Ҵ�.");
	}
	
	@Override
	public void powerOff(){
		System.out.println(getClass().getSimpleName()+"������ ����.");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SamungTV - " + CHANNEL6 + "���� ��û�մϴ�.");
	}
	
}
