package study.java.argorithm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz {
	
	public static int solve(int[][] n, int[][] p, int nNum, int pNum){
							//n : team ability array, p : problem array, nNum : total people, pNum : total problem
		
		int score =0;
		for(int i=0; i<pNum; i++){
			nextProblem: // Label for next problem 
			for(int j=0; j<nNum; j++){ // check person
				for(int k =0; k<3; k++){ // check ability
					if(n[j][k] < p[i][k]) break;
					else if(k==2){
						score += p[i][3];
						break nextProblem;
					}
				}
			}
		}
		return score;
	}
	
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("test8.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		int test_case=sc.nextInt();
		
		for(int i=0; i<test_case; i++){
			int N = sc.nextInt();
			int P = sc.nextInt();
			int[][] team = new int[N][3];
			int[][] problem = new int[P][4];
			
			//save team ability
			for(int row = 0; row<N; row++){
				for(int col = 0; col<3; col++){
					team[row][col] = sc.nextInt();
				}
			}
			//save problem
			for(int row = 0; row< P; row++){
				for(int col = 0; col<4; col++){
					problem[row][col] = sc.nextInt();
				}
			}
			
			//Solve the problem
			System.out.println("#" + (i+1) + " " + solve(team,problem,N,P));
		}
	}
}
