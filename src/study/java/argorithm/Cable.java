package study.java.argorithm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setIn(new FileInputStream("test7.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();

		for (int i = 0; i < test_case; i++) {
			int size = sc.nextInt();
			int[][] field = new int[size][size];

			// save field
			for (int j = 0; j < size; j++) {
				for (int k = 0; k < size; k++) {
					field[j][k] = sc.nextInt();
				}
			}
			// print
			System.out.println("#"+(i+1)+" "+ find1(size,field)); // find peak & valley : find1(size,field)
			
		}
	}
	
	public static double find1(int size, int[][] field){
		double distance;
		int[] peak = {0,0,0};
		int peakCount = 0;
		int[] valley = {0,0,255};
		int valCount = 0;
		
		for (int k = 0; k < size * size; k++) {
			for (int row = (k % size - 1); row <= (k % size + 1); row++) {
				for (int col = (k / size - 1); col <= (k / size + 1); col++) {
					if (row == k % size && col == k / size || row < 0 || col < 0 || row == size || col == size)
						continue;
					else {
						if (field[k % size][k / size] < field[row][col])
							valCount++;
						else if (field[k % size][k / size] > field[row][col])
							peakCount++;
					}
				}
			}
			if (valCount == 8 && valley[2] > field[k % size][k / size]) {
				valley[0] = k % size;
				valley[1] = k / size;
				valley[2] = field[k % size][k / size];
			} else if (peakCount == 8 && peak[2] < field[k % size][k / size]) {
				peak[0] = k % size;
				peak[1] = k / size;
				peak[2] = field[k % size][k / size];
			} else {
				peakCount = 0;
				valCount = 0;
			}
		}
		distance = Math.pow(valley[0] - peak[0],2)+Math.pow(valley[1] - peak[1],2)+Math.pow(valley[2] - peak[2],2);
		return distance;
	}
	
}
