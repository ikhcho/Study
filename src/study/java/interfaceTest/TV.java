package study.java.interfaceTest;

public interface TV {
	//7버전 => 상수+추상메서드만 가능
	//8버전 => default method, static method 추가
	
	int CHANNEL6 = 6; //static final이 생략되어 있는것
	public static final int CHANNEL9 = 9;
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	//8버전 가능
	public default void print(){
		System.out.println("default 지정자 추가...8버전");
	}
	
	public static void show(){
		System.out.println("static 지정자 추가...8버전");
	}
}
