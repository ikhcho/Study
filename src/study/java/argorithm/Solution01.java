package study.java.argorithm;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution01 {
	static int N, P; // N : ������ ��, P : ������ ��
	
	// �������� N_arr[x][y]... y : 0-���Ƿ�   1-���Ƿ�   2-����Ƿ�
	static int N_arr[][] = new int[15][3];  
	
	// �������� P_arr[x][y]... y : 0-���䱸�� 1-���䱸�� 2-����䱸�� 3-����	
	static int P_arr[][] = new int[100][4];

	static int Answer;
	
	public static void main(String[] args) throws Exception {
		/*
		   �Ʒ��� �޼ҵ� ȣ���� ������ ǥ�� �Է�(Ű����) ��� sample_input.txt ���Ϸκ��� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
		   �������� �ۼ��� �ڵ带 �׽�Ʈ �� ��, ���Ǹ� ���ؼ� sample_input.txt�� �Է��� ������ ��,
		   �� �ڵ带 ���α׷��� ó�� �κп� �߰��ϸ� ���� �Է��� ������ �� ǥ�� �Է� ��� ���Ϸκ��� �Է��� �޾ƿ� �� �ֽ��ϴ�.
		   ���� �׽�Ʈ�� ������ ������ �Ʒ� �ּ��� ����� �� �޼ҵ带 ����ϼŵ� �����ϴ�.
		   ��, ä���� ���� �ڵ带 �����Ͻ� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ� ó�� �ϼž� �մϴ�.
		 */
		System.setIn(new FileInputStream("sample_input01.txt"));
		
		/*
		   ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�ɴϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			/*
			   �� �׽�Ʈ ���̽��� ǥ�� �Է¿��� �о�ɴϴ�.
			*/
			N = sc.nextInt();
			P = sc.nextInt();

			// ������ ���� �Է�
			for (int i = 0; i < N; i++) {
				N_arr[i][0] = sc.nextInt();
				N_arr[i][1] = sc.nextInt();
				N_arr[i][2] = sc.nextInt();
			}

			// ������ ���� �Է�
			for (int i = 0; i < P; i++) {
				P_arr[i][0] = sc.nextInt();
				P_arr[i][1] = sc.nextInt();
				P_arr[i][2] = sc.nextInt();
				P_arr[i][3] = sc.nextInt();
			}

			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
				�� �κп� �������� �˰��� ������ ���ϴ�.
				������ ���� ����Ͽ� Answer ������ �����ϴ� ���� �����Ͽ����ϴ�.
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
			// ǥ�����(ȭ��)���� ����� ����մϴ�.
			System.out.println("#" + test_case + " " + Answer);
		}
	}
}
