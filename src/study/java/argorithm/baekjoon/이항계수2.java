package study.java.argorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이항계수2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]);
		int size = K;
		int result = 1;
		if(K != 0 && K != N){
			if(N-K < size) K = N-K;
			
			int[][] arr = new int[N+1][K+1];
			//init
			arr[1][0]=1;
			arr[1][1]=1;
			int mod = 10007;
			for(int i=2; i<=N; i++){
				for(int j=1; j<=K; j++){
					arr[i][j] = ((arr[i-1][j-1] % mod) + (arr[i-1][j] % mod)) % mod;
				}
				arr[i][0]=1;
				if(i<=K){
					arr[i][i]=1;
				}
			}
			result = arr[N][K];
		}
		System.out.println(result);
	}
}
