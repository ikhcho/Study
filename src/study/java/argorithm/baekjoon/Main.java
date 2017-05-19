package study.java.argorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]);
		int size = K;
		int result = 1;
		if(K != 0 && K != N){
			if(N-K < size) K = N-K;
			
			int[][] arr = new int[2][K+1];
			//init
			arr[0][0]=1;
			arr[0][1]=1;
			int mod = 1000000007;
			for(int i=2; i<=N; i++){
				for(int j=1; j<=K; j++){
					arr[1][j] = ((arr[0][j-1] % mod) + (arr[0][j] % mod)) % mod;
				}
				for(int k=1; k<=K; k++){
					arr[0][k] = arr[1][k];
				}
				if(i<=K){
					arr[0][i]=1;
				}
			}
			result = arr[0][K];
		}
		System.out.println(result);
	}
}
