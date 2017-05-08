package study.java.day01;

import java.util.Scanner;

public class SwitchTest {
public static void main(String[] args) {
	//시험 점수 90점이상 A, 80점이상 B...C,D,F
	
	int score;
	Scanner sc = new Scanner(System.in);
	score=sc.nextInt();
	
	if(score>=90) System.out.println("A학점 입니다.");
	else if(score>=80) System.out.println("B학점 입니다.");
	else if(score>=70) System.out.println("C학점 입니다.");
	else if(score>=60) System.out.println("D학점 입니다.");
	else System.out.println("F학점 입니다.");
	
	switch(score/10){
	case 9: 
		System.out.println("A학점 입니다.");
		break;
	case 8: 
		System.out.println("B학점 입니다.");
		break;
	case 7: 
		System.out.println("C학점 입니다.");
		break;
	case 6: 
		System.out.println("D학점 입니다.");
		break;
	default:
		System.out.println("F학점 입니다.");
		break;
	
	}
}
}
