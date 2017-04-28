package java.com.day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LAB {

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("test4.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		int test_case=sc.nextInt();
		
		for(int i=0; i<test_case; i++){
			int n =sc.nextInt();
			int[][] field = new int[n][n];
			
			//Save array
			for(int row=0; row<n; row++){
				for(int col=0; col<n; col++){
					field[row][col]=sc.nextInt();
				}
			}
			
			//Count path
			byte[] location={0,0}; //Current location, location[0]=row location, location[1]=col loaction
			byte RCcheck=1; // Row =0, Column = 1
			boolean IDcheck=true;//Increase=ture, Decrease=false
			int count=0; // Mirror count num
			
			try{//Out of range
				while(true)
				{
					switch(field[location[0]][location[1]]){
					case 1:
						if(RCcheck==0) RCcheck=1;
						else RCcheck=0;
						//Row to Column or Column to Row
						if(IDcheck==true) {location[RCcheck]--; IDcheck=false;} //location value +- & Reverse  ID
						else {location[RCcheck]++; IDcheck=true;}
						count++;
						break;
						
					case 2:
						if(RCcheck==0) RCcheck=1;
						else RCcheck=0;
						//Row to Column or Column to Row
						if(IDcheck==true) location[RCcheck]++;
						else location[RCcheck]--;
						count++;
						break;
					
					case 0:
						if(IDcheck==true) location[RCcheck]++;
						else location[RCcheck]--;
						
					}
				}
			}
			catch (java.lang.ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println("#" + (i+1) + " " +count);
			}
		}
	}
}

