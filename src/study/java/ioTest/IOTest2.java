package study.java.ioTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest2 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			File f = new File("test.txt");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			try {
				int data;
				while((data = fr.read()) != -1){
					System.out.print((char)data);
				}
				while((data = br.read()) != -1){
					System.out.print((char)data);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) fr.close();
				if(br!=null) br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
