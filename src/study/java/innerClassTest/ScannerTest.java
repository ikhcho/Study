package study.java.innerClassTest;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("원하는 작업을 선택하세요");
			System.out.println("1.조회");
			System.out.println("2.입력");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("9.종료");
			
			int select=sc.nextInt();
			
			switch(select){
				case 1: System.out.println("조회");break;
				case 2: System.out.println("입력");break;
				case 3: System.out.println("수정");break;
				case 4: System.out.println("삭제");break;
				case 9: break;
				
				
			}
		}
	}
}
