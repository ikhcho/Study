package java.com.day02;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Prob1();
		Prob2();
	}
	public static void Prob1()
	{
		//����1. ������ ������ �Է� �޾Ƽ�, 1���� 1,000������ �� �߿��� �Է� ���� ������ ����� ������ ������� ���� ����Ͻʽÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("1~1000������ ���� ������ �Է��ϼ��� : ");
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
		System.out.println(input+"�� ��� ���� = "+count);
		System.out.println(input+"�� ��� �� = "+sum);
	}
	public static void Prob2()
	{
		//���� ��Ģ  :  1���� �����ؼ� �� ���� ���̰� 1�� ����
		//��  ��  :  1 + 2 + 4 + 7 + 11 + 16 + 22 + ��������
		//���� �������� 15��° �ױ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻʽÿ�
		
		int res=0;
		int last=1;
		for(int i=0; i<15; i++)
		{
			last+=i;
			res+=last;
		}
		System.out.println("15��°������ �� : " + res);
	}
}
