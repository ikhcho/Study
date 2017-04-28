package java.com.day02;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
		double min;
		double max;
		double res=1;
		
		System.out.println("두개의 숫자를 입력해 주세요");
		System.out.println("첫번째 숫자");
		num1=sc.nextDouble();
		System.out.println("두번째 숫자");
		num2=sc.nextDouble();
		
		min = num1<num2? num1 : num2;
		max = num1>num2? num1 : num2;
		
		for(double i=2; i<=min/2; i++)
		{
			if(min%i==0 && max%(min/i)==0)
			{
				res=(min/i);
				break;
			}
		}
		System.out.println("두 수의 최대공약수는 " + res + "입니다.");
	}
	
}
