package java.com.day01;

import java.util.Scanner;

public class PrimeNumber_ikhcho {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2~100������ ������ �Է��ϼ���.");
		int input = sc.nextInt();
		if(input ==2 )
			System.out.println(input+"��(��) �Ҽ��Դϴ�.");
		else{
			for(int i =2; i<input;i++)
			{
				if(i==input-1)
					System.out.println(input+"��(��) �Ҽ��Դϴ�.");
				else if(input%i == 0)
				{
					System.out.println(input+"��(��) �Ҽ��� �ƴմϴ�.");
					break;
				}
			}
		}
	}

}
