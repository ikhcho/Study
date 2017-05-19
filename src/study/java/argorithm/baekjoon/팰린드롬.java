package study.java.argorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ÆÓ¸°µå·Ò {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String res = solve(str);
		System.out.println(res);
		bw.write(res);
	}
	
	public static String solve(String str){
		int size = str.length();
		char[] charStr = new char[size];
		List<Character> list = new ArrayList<Character>();
		String res="";
		int count=1;
		int diff = 0;
		char tmp = ' ';
		for(int i=0; i<size; i++){
			charStr[i] = str.charAt(i);
		}
		Arrays.sort(charStr);
		for(int j=0; j<size-1; j++){
			list.add(list.size()/2,charStr[j]);
			if(charStr[j] == charStr[j+1]){
				count++;
			}else if(count%2 == 1){
				tmp = charStr[j];
				list.remove(list.size()/2);
				count=1;
				diff++;
			}else{
				count=1;
			}
		}
		if(count%2 == 1){
			diff++;
		}
		if(diff>1) return "I'm Sorry Hansoo";
		list.add(list.size()/2,charStr[size-1]);
		if(tmp != ' '){
			list.add(list.size()/2,tmp);
		}
		for(int round=0; round<size; round++){
			res+=list.get(round);
		}
		return res;
	}
}
