package study.java.argorithm.baekjoon;

//RGB거리
/*
RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 
또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다.
집 i의 이웃은 집 i-1과 집 i+1이다. 처음 집과 마지막 집은 이웃이 아니다.
각 집을 빨강으로 칠할 때 드는 비용, 
초록으로 칠할 때 드는 비용,
파랑으로 드는 비용이 주어질 때, 
모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.

입력 : 첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다.
	   둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다.
	   
출력 : 첫째 줄에 모든 집을 칠할 때 드는 비용의 최솟값을 출력한다.

입력예제 : 
3
26 40 83
49 60 57
13 89 99
출력 : 96
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGB {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);
		int [][] houseCost = new int[2][3];
		int [] buffer = new int[3];
		int [] order = {1,2,0,1};
		//init
		str = br.readLine();
		houseCost[0][0] = Integer.parseInt(str.split(" ")[0]);
		houseCost[0][1] = Integer.parseInt(str.split(" ")[1]);
		houseCost[0][2] = Integer.parseInt(str.split(" ")[2]);
		
		//solve
		for(int i=1; i<N; i++){
			str = br.readLine();
			for(int j=0; j<3; j++){
				buffer[j] = Integer.parseInt(str.split(" ")[j]);
				houseCost[1][j] = buffer[j]+ Integer.min(houseCost[0][order[j]],houseCost[0][order[j+1]]);
			}
			for(int k=0; k<3; k++){
				houseCost[0][k] = houseCost[1][k];
			}
		}
		
		//end
		int min1 = Integer.min(houseCost[0][0], houseCost[0][1]);
		int result = Integer.min(min1, houseCost[0][2]);
		System.out.println(result);
	}
}
