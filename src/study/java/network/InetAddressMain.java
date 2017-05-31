package study.java.network;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

public class InetAddressMain {
	public static void main(String[] args){
		
		InetAddress localhost;
		
		try {
			URL urlobj = new URL("https://www.naver.com");
			System.out.println(urlobj.getPort());
			InputStream is = urlobj.openStream();
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			while(true){
				int c = isr.read();
				if(c==-1) break;
				System.out.print((char)c);
			}
		
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
