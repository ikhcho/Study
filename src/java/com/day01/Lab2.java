package java.com.day01;

import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڽ��� �¾ ���� �Է��ϼ���.");
		int inputMonth = sc.nextInt();
		int index = inputMonth>12||inputMonth<1? 5 : inputMonth/3;
		switch(index){
			case 1:
				System.out.println("���� �¾�̳׿�.");
				break;
			case 2:
				System.out.println("������ �¾�̳׿�.");
				break;
			case 3:
				System.out.println("������ �¾�̳׿�.");
				break;
			case 5:
				System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
				inputMonth = sc.nextInt();
				index = inputMonth>12||inputMonth<1? 5 : inputMonth/3;
				
			default:
				System.out.println("�ܿ￡ �¾�̳׿�.");
				break;
				
				
		}
		
		
	}
}
