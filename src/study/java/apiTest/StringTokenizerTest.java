package study.java.apiTest;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "abcd,efg/hijklmn,op,qr_stu,vw/xyz";
		
		StringTokenizer st = new StringTokenizer(str,"/_,");
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		
		String[] arr = str.split("/|,|_");
		for(String s : arr){
			System.out.println(s);
		}
		
	}
}
