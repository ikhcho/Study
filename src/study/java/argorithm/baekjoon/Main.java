package study.java.argorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] score = new int[n];
		int result =1;
		
		for(int i=0; i<n; i++){
			score[i] = Integer.parseInt(str.split(" ")[i]);
		}
		Arrays.sort(score);
		
		int sum=0;
		for(int value : score){
			sum+=value;
		}
		if(sum != n*(n-1)/2){
			result = -1;
		}else{
			for(int i=0; i<n; i++){
				for(int j = i+score[i]+1; j<n; j++){
					score[j] -= 1;
				}
				if(score[i] <0) result = -1;
			}
		}
		System.out.println(result);
	}
}
