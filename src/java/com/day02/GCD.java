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
		
		System.out.println("�ΰ��� ���ڸ� �Է��� �ּ���");
		System.out.println("ù��° ����");
		num1=sc.nextDouble();
		System.out.println("�ι�° ����");
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
		System.out.println("�� ���� �ִ������� " + res + "�Դϴ�.");
	}
	
}
