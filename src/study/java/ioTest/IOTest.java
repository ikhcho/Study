package study.java.ioTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is); // 보조스트림 1byte->2byte
		try {
			int data=1;
			while(data!=13){
				data = ir.read();
				System.out.println((char)data);
			}
			ir.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
