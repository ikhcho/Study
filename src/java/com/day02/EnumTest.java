package java.com.day02;

public class EnumTest {
	public static void main(String[] args) {
		
		//변수 : 변경 가능
		String company="비트컴퓨터";
		company="비트시스템";
		
		//상수 : 변경 불가능
		final String COMPANY="비트컴퓨터";
		System.out.println(COMPANY);
	}
}
