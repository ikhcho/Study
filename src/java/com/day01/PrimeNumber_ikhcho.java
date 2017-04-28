package java.com.day01;

import java.util.Scanner;

public class PrimeNumber_ikhcho {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2~100사이의 정수를 입력하세요.");
		int input = sc.nextInt();
		if(input ==2 )
			System.out.println(input+"는(은) 소수입니다.");
		else{
			for(int i =2; i<input;i++)
			{
				if(i==input-1)
					System.out.println(input+"는(은) 소수입니다.");
				else if(input%i == 0)
				{
					System.out.println(input+"는(은) 소수가 아닙니다.");
					break;
				}
			}
		}
	}

}
