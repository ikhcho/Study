package study.java.exceptionTest;

class CellPhone{
	String model;
	double battery;
	
	public CellPhone(String model) {
		super();
		this.model = model;
	}
	
	public void call(int time){
		if(time <0) throw new IllegalArgumentException("통화시간입력오류");
		battery -= time*0.5;
		if(battery<0) battery=0;
	}
	
	public void charge(int time){
		if(time <0) throw new IllegalArgumentException("충시간입력오류");
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
		
		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 );  //통화시간이 잘못 입력되었다.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		}
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		} 
	} 

}
