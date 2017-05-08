package study.java.argorithm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ladder {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("test5.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		int test_case=sc.nextInt();
		
		for(int i=0; i<test_case; i++){
			int person = 0;//Start person
			int personNum = sc.nextInt(); // Person number
			int bomb = sc.nextInt(); // Bomb location
			int horLineNum = sc.nextInt(); // Horizon Line number
			
			int [][] horizonLine = new int[personNum][personNum]; // Horizon Line field
			int row=person-1; //Init point
			int col=bomb-1; //Init point
			
			//For horizonLine field
			int horizonRow; 
			int first;
			int second;
			int right;
			int left;
			
			//Save horizonLine location
			for(int j=0; j<horLineNum; j++)// test 1~n 
			{
				horizonRow = sc.nextInt();
				first = sc.nextInt();//
				horizonRow = sc.nextInt();
				second = sc.nextInt();
				
				//Check left or right location for direct, maxValue is right and that is 2
				right = first>second? first : second;
				left = first<second? first : second;
				horizonLine[horizonRow-1][left-1] = 1; // Change the Horizon location's value to 1
				horizonLine[horizonRow-1][right-1] = 2; // Change the Horizon location's value to 2
			}
			
			//Move point
			try{
				while(true)
				{
					switch(horizonLine[row][col]){
						case 1: //If located on left
							while(horizonLine[row][col]!=2) col++; //Move right
							row--;
							break;
						case 2: //If located on right
							while(horizonLine[row][col]!=1) col--; //Move left
							row--;
							break;	
						default : //Move down
							row--;
					}
				}
			}catch (java.lang.ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println("#" + (i+1) + " " + (col+1));
			}
			
			//check field
			/*
			for(int n = 0; n<personNum; n++)
			{
				for(int m = 0; m<personNum; m++)
				{
					System.out.print(horizonLine[n][m]);
				}
				System.out.println();
			}
			*/
		}
	}
}
