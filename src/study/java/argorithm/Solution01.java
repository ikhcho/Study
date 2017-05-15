package study.java.argorithm;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution01 {
	static int N, P; // N : 팀원의 수, P : 문제의 수
	
	// 팀원정보 N_arr[x][y]... y : 0-언어실력   1-논리실력   2-응용실력
	static int N_arr[][] = new int[15][3];  
	
	// 문제정보 P_arr[x][y]... y : 0-언어요구력 1-논리요구력 2-응용요구력 3-점수	
	static int P_arr[][] = new int[100][4];

	static int Answer;
	
	public static void main(String[] args) throws Exception {
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 sample_input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 sample_input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		System.setIn(new FileInputStream("sample_input01.txt"));
		
		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			/*
			   각 테스트 케이스를 표준 입력에서 읽어옵니다.
			*/
			N = sc.nextInt();
			P = sc.nextInt();

			// 팀원의 정보 입력
			for (int i = 0; i < N; i++) {
				N_arr[i][0] = sc.nextInt();
				N_arr[i][1] = sc.nextInt();
				N_arr[i][2] = sc.nextInt();
			}

			// 문제의 정보 입력
			for (int i = 0; i < P; i++) {
				P_arr[i][0] = sc.nextInt();
				P_arr[i][1] = sc.nextInt();
				P_arr[i][2] = sc.nextInt();
				P_arr[i][3] = sc.nextInt();
			}

			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
				이 부분에 여러분의 알고리즘 구현이 들어갑니다.
				문제의 답을 계산하여 Answer 변수에 저장하는 것을 가정하였습니다.
			*/
			/////////////////////////////////////////////////////////////////////////////////////////////
			Answer = -1;
			for(int i=0; i<P; i++){
				nextProblem: // Label for next problem 
				for(int j=0; j<N; j++){ // check person
					for(int k =0; k<3; k++){ // check ability
						if(N_arr[j][k] < P_arr[i][k]) break;
						else if(k==2){
							Answer += P_arr[i][3];
							break nextProblem;
						}
					}
				}
			}
			Answer += 1;
			// 표준출력(화면)으로 답안을 출력합니다.
			System.out.println("#" + test_case + " " + Answer);
		}
	}
}
