package study.java.exceptionTest;

class MyException extends Exception{

	public MyException(String string) {
		// TODO Auto-generated constructor stub
	}
	
}

public class ExceptionTest {
	public static void method(){
		try {
			Class c = Class.forName("study.java.exceptionTest");
			System.out.println("a");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method2(int num) throws MyException{
		//num<=100
		if(num>100) throw new MyException("100보다 작아야한다.");
		System.out.println("사용자 입력값:"+num);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);//Runtime Exception
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0으로 나눌 수 없다. " + e);
		}finally{
			System.out.println("??");
		}
		//method();
		try {
			method2(101);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
