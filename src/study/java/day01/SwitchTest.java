package study.java.day01;

import java.util.Scanner;

public class SwitchTest {
public static void main(String[] args) {
	//���� ���� 90���̻� A, 80���̻� B...C,D,F
	
	int score;
	Scanner sc = new Scanner(System.in);
	score=sc.nextInt();
	
	if(score>=90) System.out.println("A���� �Դϴ�.");
	else if(score>=80) System.out.println("B���� �Դϴ�.");
	else if(score>=70) System.out.println("C���� �Դϴ�.");
	else if(score>=60) System.out.println("D���� �Դϴ�.");
	else System.out.println("F���� �Դϴ�.");
	
	switch(score/10){
	case 9: 
		System.out.println("A���� �Դϴ�.");
		break;
	case 8: 
		System.out.println("B���� �Դϴ�.");
		break;
	case 7: 
		System.out.println("C���� �Դϴ�.");
		break;
	case 6: 
		System.out.println("D���� �Դϴ�.");
		break;
	default:
		System.out.println("F���� �Դϴ�.");
		break;
	
	}
}
}
