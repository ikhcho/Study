package java.com.day01;

import java.util.Scanner;

public class Mul_Prim_facto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("확인하실 문제번호를 입력하세요");
		int num = sc.nextInt();
		
		Mul_Prim_facto test = new Mul_Prim_facto();
		switch(num)
		{
			case 1:
				test.Prob1();
				break;
			case 2:
				test.Prob2();
				break;
			case 3:
				test.Prob3();
				break;
		}
	}
	public void Prob1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1보다 크고 10보다 작은 정수를 입력하세요.");
		int num = sc.nextInt();
		
		if(num>1 && num<10)
		{
			for(int i=1; i<10; i++)
			System.out.println(num + " * " + i + " = " + num*i);
		}
		else
		{
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}
	}
	
	public void Prob2()
	{
		int count=0;
		for(int i =2; i<=10000;i++)
		{
			for(int j=2; j<i;j++)
			{
				if(i%j==0) count++;
				
			}
			if(count==0) System.out.println(i);
			count=0;
		}
	}
	
	public void Prob3()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1보다 크고 10보다 작은 정수를 입력하세요.");
		int num = sc.nextInt();
		int res = 1;
		
		if(num>1 && num<10)
		{
			for(int i=2; i<=num; i++)
			{
				res*=i;
			}
			System.out.println(num + "! = " + res);
		}
		else
		{
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}
	}
}
