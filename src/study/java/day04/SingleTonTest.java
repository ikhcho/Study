package study.java.day04;

import java.util.Calendar;

class MyPen{
	private static MyPen pen = new MyPen();
	private MyPen(){
		
	}
	public static MyPen getPen(){
		return pen;
	}
}


public class SingleTonTest {
	public static void main(String[] args) {
		MyPen a = MyPen.getPen();
		MyPen b = MyPen.getPen();
		System.out.println(a==b);
		
		Calendar cl = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		System.out.println(cl.getTimeInMillis());
		System.out.println(c2.getTimeInMillis());
	}
}
