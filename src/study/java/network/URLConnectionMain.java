package study.java.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionMain {
	public static void main(String[] args) {
		//www.naver.com 내용을 읽어서 내 컴퓨터에 naver.html에 저장
		
		try{
		URL urlobj = new URL("https://www.naver.com");
		
		URLConnection uc = urlobj.openConnection();
		InputStream is = uc.getInputStream();
		InputStreamReader isr = new InputStreamReader(is,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		FileOutputStream fos = new FileOutputStream("naver.html");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		while(true){
			String str = br.readLine();
			if(str == null) break;
			bw.write(str);
			bw.newLine();
		}
		bw.flush();
		
		
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
