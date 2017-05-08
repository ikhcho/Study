package study.java.day01;

import java.util.Scanner;

public class LeapyearTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year;
		int month;
		System.out.println("년 입력 : ");
		year = sc.nextInt();
		System.out.println("월 입력 : ");
		month = sc.nextInt();

		LeapyearTest lt = new LeapyearTest();
		lt.numDay(year, month);
	}

	public void numDay(int Y, int M){
		int lastday;
		switch(M)
		{
			case 4:case 6: case 9: case 11:
				lastday=30;
				break;
			case 2:
				if(Y%4==0)
				{
					lastday=29;
					if (Y%100==0 && Y%400!=0)
					{
						lastday=28;
					}
				}
				else
					lastday=28;
				break;
			default:
				lastday=31;
		}
		System.out.println(Y+"년 "+ M +"월 말일은 "+lastday+"입니다.");
		
	}
}
