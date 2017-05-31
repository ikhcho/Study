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
			System.out.println("���ü��� ����");
			
			Socket client = server.accept();
			System.out.println("���ӵ� Ŭ���̾�Ʈ ���� :" + client);
			
			String str = "���̿�";
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF(str);
			dos.flush();
			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			while(true){
				System.out.println(dis.readUTF());
				client = server.accept();
				System.out.println("���ӵ� Ŭ���̾�Ʈ ���� :" + client);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
