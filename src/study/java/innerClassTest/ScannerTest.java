package study.java.innerClassTest;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("���ϴ� �۾��� �����ϼ���");
			System.out.println("1.��ȸ");
			System.out.println("2.�Է�");
			System.out.println("3.����");
			System.out.println("4.����");
			System.out.println("9.����");
			
			int select=sc.nextInt();
			
			switch(select){
				case 1: System.out.println("��ȸ");break;
				case 2: System.out.println("�Է�");break;
				case 3: System.out.println("����");break;
				case 4: System.out.println("����");break;
				case 9: break;
				
				
			}
		}
	}
}
