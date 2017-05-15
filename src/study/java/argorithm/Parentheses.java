package study.java.argorithm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setIn(new FileInputStream("test6.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for(int i=0; i<test_case; i++){
			//Save string
			int pNum = sc.nextInt();
			int pPoint = sc.nextInt()-1;
			String pStr = sc.next();
			
			//Matching test method
			int result = ParenthesesTest(pNum,pPoint,pStr);
			
			//Print out
			System.out.println("#" + (i+1) + " " + result);
		}
		
	}
	
	public static int ParenthesesTest(int pNum, int pPoint, String pStr){
		int pCount = 0; // Parentheses count
		boolean index =false; // Parentheses matching test
		int mPoint = 0; // Parentheses matching point
		
		for(int i=0; i<pNum; i++){
			// Parentheses count
			if(pStr.charAt(i)=='(') pCount++;
			else pCount--;
			
			//pCount=-1 means mismatched
			if(pCount < 0) {mPoint=0; break;}
			
			//Matching test start
			if(i == pPoint) index = true;
			
			//pCount=0 means matched
			if(pCount==0 && index == true){
				mPoint = i+1;
				index = false; //Matching test end
			}
		}
		return mPoint;
	}
}
