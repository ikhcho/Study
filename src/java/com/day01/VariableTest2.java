package java.com.day01;

public class VariableTest2 {

	public static void main(String[] args) {
		int javaScore = 100;
		int dbScore = 95;
		int jspScore = 83;
		
		int sum = javaScore + dbScore + jspScore;
		
		double ave = ((double) sum) / 3.0;
		
		System.out.println("����: " + sum);
		System.out.println("���: " + ave);
	}

}
