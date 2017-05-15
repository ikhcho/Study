package study.java.apiTest;

public class PatternTest {
	public static void main(String[] args) {
		String phone = "010-1234-5678";
		String pattern1 = "[01]{3}-[0-9]{3,4}-[0-9]{4}";
		System.out.println(phone.matches(pattern1));
		
		//¿Ã∏ﬁ¿œ
		String email = "sorhtfl12@gmail.com";
		String pattern2 = "[a~zA~Z0~9]+@[a~z]+.[com]{3}";
		System.out.println(email.matches(pattern2));
	}
}
