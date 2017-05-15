package study.java.exceptionTest;

class CellPhone{
	String model;
	double battery;
	
	public CellPhone(String model) {
		super();
		this.model = model;
	}
	
	public void call(int time){
		if(time <0) throw new IllegalArgumentException("��ȭ�ð��Է¿���");
		battery -= time*0.5;
		if(battery<0) battery=0;
	}
	
	public void charge(int time){
		if(time <0) throw new IllegalArgumentException("��ð��Է¿���");
		battery += time*3;
		if(battery>100) battery=100;
	}
	
	public void printBattery(){
		System.out.println(battery);
	}
	
	@Override
	public boolean equals(Object newPhone){
		boolean res = model == ((CellPhone)newPhone).model?true:false;
		return res;
	}

}

public class CellPhoneMain {
	public static void main(String[] args) { 
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 );  //��ȭ�ð��� �߸� �ԷµǾ���.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		}
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("���� ���Դϴ�.");
		} else {
			System.out.println("�ٸ� ���Դϴ�.");
		} 
	} 

}
