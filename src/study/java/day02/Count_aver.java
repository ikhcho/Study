package study.java.day02;

import java.util.Scanner;

public class Count_aver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score=1;
		double input=0;
		int count=-1;
		
		System.out.println("[더  입력할 점수가 없으면 -1을 입력]");
		do{
			System.out.println("점수를 입력하십시오 : ");
			input=sc.nextDouble();
			score+=input;
			count++;
		}while(input!=-1);
		
		System.out.println("입력된 점수들의 수 : " + (count));
		System.out.println("점수들의 평균(double value) : " + (score/count));
		System.out.println("점수들의 평균 (int value) : " + (int)(score/count));
	}
}
