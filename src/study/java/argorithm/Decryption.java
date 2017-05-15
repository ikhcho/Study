package study.java.argorithm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Decryption {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input2_¾ÏÈ£È­.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		int test_case=sc.nextInt();
		
		for(int i=0; i<test_case; i++){
			String ciphertext = sc.next();
			int key = calcBinary(ciphertext.substring(0,3)); // key value
			ciphertext = ciphertext.substring(3,ciphertext.length()); // renewal value
			int size = ciphertext.length()/8; // cipher block size
			String[] cBlock = new String[size];
			int codeword;
			String L="";
			
			//solve
			for(int j=0; j<size; j++){
				cBlock[j] = ciphertext.substring(j*8,j*8+8); // distribute cipher block
				codeword = calcBinary(cBlock[j])-key; // cipher block value
				L += map(codeword); // decryption
			}
			
			System.out.println("#" + test_case + " " + L);
		}
	}
	
	public static int calcBinary(String str){
		int res=0;
		int count=0;
		for(int i=str.length()-1; i>=0; i--){
			res+=(str.charAt(i)-48)*Math.pow(2, count);//char(0)=48, char(1)=49
			count++;
		}
		return res;
	}
	
	public static char map(int num){
		char code = (char)(num+65); //A~Z : 65~90
		return code;
	}
}
