package study.java.interfaceTest;

public class TvUser {
	public static void main(String[] args) {
		SamsungTV stv = new SamsungTV();
		stv.powerOn();
		stv.print();
		stv.powerOff();
		TV.show();
		
		TV tv = TvFactory.makeTV("samsung");
		
		
	}
}
