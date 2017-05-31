package study.java.argorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 별찍기11 {
	static char[][] pyramid;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int row = n/3;
		pyramid = new char[n][n*2];
		//공백 초기화
		for (int i = 0; i < n; i++) {
			Arrays.fill(pyramid[i], ' ');
		}
		
		//별찍기
		solve(n, 0,n-1);
		
		//출력
		for (int i = 0; i < n; i++) {
				System.out.println(pyramid[i]);
		}

	}
	public static void solve(int n, int x, int y){
		if(n == 3){
			pyramid[x][y] = '*';	
			pyramid[x+1][y+1] = '*';	
			pyramid[x+1][y-1] = '*';	
			pyramid[x+2][y-2] = '*';	
			pyramid[x+2][y-1] = '*';	
			pyramid[x+2][y] = '*';	
			pyramid[x+2][y+1] = '*';	
			pyramid[x+2][y+2] = '*';	
			return;
		}
		int temp = n/2;
		solve(temp,x,y);
		solve(temp,x+temp,y-temp);
		solve(temp,x+temp,y+temp);
	}
}
