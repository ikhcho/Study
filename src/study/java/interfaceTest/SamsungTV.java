package study.java.interfaceTest;

public class SamsungTV implements TV {
	
	@Override
	public void powerOn(){
		System.out.println(getClass().getSimpleName()+"전원을 켠다.");
	}
	
	@Override
	public void powerOff(){
		System.out.println(getClass().getSimpleName()+"전원을 끈다.");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SamungTV - " + CHANNEL6 + "번을 시청합니다.");
	}
	
}
