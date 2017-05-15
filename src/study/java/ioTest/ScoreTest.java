package study.java.ioTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Vector;

public class ScoreTest {
	public static void main(String[] args) {
		
		printScore("iotest.txt");
	}
	
	public static void printScore(String fileName){
		Vector<String> vector = new Vector<String>();
		int data;
		String value="";
		File f = new File(fileName);
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			try {
				while((data=br.read())!=-1){
					if((char)data == '/'){
						vector.add(value);
						value="";
					}else if(data == '\n'){
						vector.add(value);
						value="";
					}else{
						value+=(char)data;
					}
				}
				vector.add(value);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getScore(vector);
	}
	
	public static void getScore(Vector<String> vector){
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.get(i)+"\t");
		}
		System.out.println(vector.get(3));
	}
}
