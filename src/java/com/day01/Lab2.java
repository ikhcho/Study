package java.com.day01;

import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자신이 태어난 달을 입력하세요.");
		int inputMonth = sc.nextInt();
		int index = inputMonth>12||inputMonth<1? 5 : inputMonth/3;
		switch(index){
			case 1:
				System.out.println("봄에 태어나셨네요.");
				break;
			case 2:
				System.out.println("여름에 태어나셨네요.");
				break;
			case 3:
				System.out.println("가을에 태어나셨네요.");
				break;
			case 5:
				System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
				inputMonth = sc.nextInt();
				index = inputMonth>12||inputMonth<1? 5 : inputMonth/3;
				
			default:
				System.out.println("겨울에 태어나셨네요.");
				break;
				
				
		}
		
		
	}
}
