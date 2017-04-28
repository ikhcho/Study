package java.com.day02;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Prob1();
		Prob2();
	}
	public static void Prob1()
	{
		//문제1. 임의의 정수를 입력 받아서, 1부터 1,000까지의 수 중에서 입력 받은 정수의 배수의 개수와 배수들의 합을 계산하십시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("1~1000사이의 양의 정수를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		int sum=0;
		for(int i=1; i<=1000; i++)
		{
			if(i%input == 0) 
			{
				sum+=i;
				count++;
			}
		}
		System.out.println(input+"의 배수 개수 = "+count);
		System.out.println(input+"의 배수 합 = "+sum);
	}
	public static void Prob2()
	{
		//수열 규칙  :  1부터 시작해서 두 항의 차이가 1씩 증가
		//예  시  :  1 + 2 + 4 + 7 + 11 + 16 + 22 + …………
		//위의 수열에서 15번째 항까지의 합을 구하는 프로그램을 작성하십시오
		
		int res=0;
		int last=1;
		for(int i=0; i<15; i++)
		{
			last+=i;
			res+=last;
		}
		System.out.println("15번째까지의 합 : " + res);
	}
}
