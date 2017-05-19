package study.java.argorithm.baekjoon;

//RGB�Ÿ�
/*
RGB�Ÿ��� ��� ������� ���� ����, �ʷ�, �Ķ��߿� �ϳ��� ĥ�Ϸ��� �Ѵ�. 
����, �׵��� ��� �̿��� ���� ������ ĥ�� �� ���ٴ� ��Ģ�� ���ߴ�.
�� i�� �̿��� �� i-1�� �� i+1�̴�. ó�� ���� ������ ���� �̿��� �ƴϴ�.
�� ���� �������� ĥ�� �� ��� ���, 
�ʷ����� ĥ�� �� ��� ���,
�Ķ����� ��� ����� �־��� ��, 
��� ���� ĥ�� �� ��� ����� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է� : ù° �ٿ� ���� �� N�� �־�����. N�� 1,000���� �۰ų� ����.
	   ��° �ٺ��� N���� �ٿ� �� ���� �������� ĥ�� ��, �ʷ����� ĥ�� ��, �Ķ����� ĥ�� �� ��� ����� �־�����.
	   
��� : ù° �ٿ� ��� ���� ĥ�� �� ��� ����� �ּڰ��� ����Ѵ�.

�Է¿��� : 
3
26 40 83
49 60 57
13 89 99
��� : 96
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
