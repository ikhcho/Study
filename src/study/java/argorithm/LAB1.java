package study.java.argorithm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LAB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setIn(new FileInputStream("test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int hCount=0;
		Scanner sc = new Scanner(System.in);
		int test_case=sc.nextInt();
		System.out.println(test_case + " <-테스트 케이스 수=4");//test_case
		
		char[][] arr;
		for(int i=0; i<test_case; i++)
		{
			int n = sc.nextInt();
			arr = new char[n][n];
			for(int row=0; row<n; row++)
			{
				for(int col=0; col<n; col++)
				{
					arr[row][col]=sc.next().charAt(0);
				}
			}
			for(int row=0; row<n; row++)
			{
				for(int col=0; col<n; col++)
				{
					switch(arr[row][col])
					{
						case 'C':
							if(row>2 && arr[row-3][col]=='H' ) arr[row-3][col]='X';
							if(row<n-3 && arr[row+3][col]=='H' ) arr[row+3][col]='X';
							if(col>2 && arr[row][col-3]=='H' ) arr[row][col-3]='X';
							if(col<n-3 && arr[row][col+3]=='H' ) arr[row][col+3]='X';
						case 'B':
							if(row>1 && arr[row-2][col]=='H' ) arr[row-2][col]='X';
							if(row<n-2 && arr[row+2][col]=='H' ) arr[row+2][col]='X';
							if(col>1 && arr[row][col-2]=='H' ) arr[row][col-2]='X';
							if(col<n-2 && arr[row][col+2]=='H' ) arr[row][col+2]='X';
						case 'A':
							if(row>0 && arr[row-1][col]=='H' ) arr[row-1][col]='X';
							if(row<n-1 && arr[row+1][col]=='H' ) arr[row+1][col]='X';
							if(col>0 && arr[row][col-1]=='H' ) arr[row][col-1]='X';
							if(col<n-1 && arr[row][col+1]=='H' ) arr[row][col+1]='X';
					}
				}
			}
			for(int row=0; row<n; row++)
			{
				for(int col=0; col<n; col++)
				{
					if(arr[row][col]=='H') hCount++;
					System.out.print(arr[row][col]);
				}
				System.out.println();
			}
			System.out.println("#" + (i+1) + " " +hCount);
			hCount=0;
		}
	}
}
