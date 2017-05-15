package study.java.interfaceTest;

public interface TV {
	//7���� => ���+�߻�޼��常 ����
	//8���� => default method, static method �߰�
	
	int CHANNEL6 = 6; //static final�� �����Ǿ� �ִ°�
	public static final int CHANNEL9 = 9;
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	//8���� ����
	public default void print(){
		System.out.println("default ������ �߰�...8����");
	}
	
	public static void show(){
		System.out.println("static ������ �߰�...8����");
	}
}
