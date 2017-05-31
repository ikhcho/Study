package study.java.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class AppClientMain {
	public static void main(String[] args) {
		
		try{
			Socket socket = new Socket("localhost", 10000);
			
			String str = "hi";
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println(dis.readUTF());
			
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF("せせせせせせせせせせせせせせせせ");
			dos.flush();
			
			
		}catch (Exception e){
			
		}
	}
}

