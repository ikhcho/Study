package study.java.exceptionTest;


//java ExceptionTest2 100 200
public class ExceptionTest2 {

	
	public static void method() throws ClassNotFoundException{
		Class.forName("a.b.c");
	}
	
	public static void main(String[] args) {
		
		
		
		try{
			method();
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
		}catch(NumberFormatException e){
			System.out.println(e);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("END");
		}
	}
}
