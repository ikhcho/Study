package study.java.argorithm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LAB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setIn(new FileInputStream("test2.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int tCount=0;
		Scanner sc = new Scanner(System.in);
		int test_case=sc.nextInt();
		System.out.println(test_case + " <-테스트 케이스 수");//test_case
		
		char[][] arr;
		for(int i=0; i<test_case; i++)
		{
			//Read textFile
			arr = new char[sc.nextInt()][sc.nextInt()];
			for(int row=0; row<arr.length; row++)
			{
				for(int col=0; col<arr[0].length; col++)
				{
					arr[row][col]=sc.next().charAt(0);
				}
			}
			
			//Find Target 'T' & exchange to 'F'
			for(int row=0; row<arr.length; row++)
			{
				for(int col=0; col<arr[0].length; col++)
				{
					//
					if(arr[row][col]=='G')
					{
						//동
						for(int j=col+1;j<arr[0].length;j++)
						{
							if(arr[row][j]=='G' || arr[row][j]=='W') break;
							else if(arr[row][j]=='T') {arr[row][j]='W'; tCount++;}
						}
						//서
						for(int j=col-1;j>=0;j--)
						{
							if(arr[row][j]=='G' || arr[row][j]=='W') break;
							else if(arr[row][j]=='T') {arr[row][j]='W'; tCount++;}
						}
						//남
						for(int j=row+1;j<arr.length;j++)
						{
							if(arr[j][col]=='G' || arr[j][col]=='W') break;
							else if(arr[j][col]=='T')  {arr[j][col]='W'; tCount++;}
						}
						//북
						for(int j=row-1;j>=0;j--)
						{
							if( arr[j][col]=='G' || arr[j][col]=='W') break;
							else if(arr[j][col]=='T')  {arr[j][col]='W'; tCount++;}
						}
					}
					//
					/*
					if(arr[row][col]=='T')
					{
						//동
						for(int j=col+1;j<arr[0].length;j++)
						{
							if(arr[row][j]=='F' ||arr[row][j]=='T' || arr[row][j]=='W') break;
							else if(arr[row][j]=='G') arr[row][col]='F'; 
						}
						//서
						for(int j=col-1;j>=0;j--)
						{
							if(arr[row][j]=='F' ||arr[row][j]=='T' || arr[row][j]=='W') break;
							else if(arr[row][j]=='G') arr[row][col]='F'; 
						}
						//남
						for(int j=row+1;j<arr.length;j++)
						{
							if(arr[j][col]=='F' || arr[j][col]=='T' || arr[j][col]=='W') break;
							else if(arr[j][col]=='G') arr[row][col]='F'; 
						}
						//북
						for(int j=row-1;j>=0;j--)
						{
							if(arr[j][col]=='F' || arr[j][col]=='T' || arr[j][col]=='W') break;
							else if(arr[j][col]=='G') arr[row][col]='F'; 
						}
					}
					*/
				}
			}
			
			//Count 'F' number
			for(int row=0; row<arr.length; row++)
			{
				for(int col=0; col<arr[0].length; col++)
				{
					//if(arr[row][col]=='F') tCount++;
					System.out.print(arr[row][col]); // Print out modified matrix
				}
				System.out.println();
			}
			System.out.println("#" + (i+1) + " " +tCount);
			tCount=0;
		}
		
	}
}
