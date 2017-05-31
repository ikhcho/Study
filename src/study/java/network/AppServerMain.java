package study.java.network;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerMain {
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(10000);
			System.out.println("어플서버 구동");
			
			Socket client = server.accept();
			System.out.println("접속된 클러이언트 정보 :" + client);
			
			String str = "하이염";
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF(str);
			dos.flush();
			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			while(true){
				System.out.println(dis.readUTF());
				client = server.accept();
				System.out.println("접속된 클러이언트 정보 :" + client);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
