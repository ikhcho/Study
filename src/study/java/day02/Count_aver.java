package study.java.day02;

import java.util.Scanner;

public class Count_aver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score=1;
		double input=0;
		int count=-1;
		
		System.out.println("[��  �Է��� ������ ������ -1�� �Է�]");
		do{
			System.out.println("������ �Է��Ͻʽÿ� : ");
			input=sc.nextDouble();
			score+=input;
			count++;
		}while(input!=-1);
		
		System.out.println("�Էµ� �������� �� : " + (count));
		System.out.println("�������� ���(double value) : " + (score/count));
		System.out.println("�������� ��� (int value) : " + (int)(score/count));
	}
}
