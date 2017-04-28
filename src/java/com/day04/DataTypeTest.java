package java.com.day04;


public class DataTypeTest{
	private int tom = -1;
	private char marry = '9';
	private String john;
	private String sarah = "Sarah Jang";

	public static void main(String s[]){
		new DataTypeTest().printMyType();
	}
	
	public void printMyType(){
		System.out.println( "our friends..\n" 
			+ tom + ", " + marry + ", " + john + " and " + sarah);
	}
}

