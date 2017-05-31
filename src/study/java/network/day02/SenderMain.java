package study.java.network.day02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SenderMain {

	public static void main(String[] args) {
		
		try {
			
			DatagramSocket socket = new DatagramSocket();
			
			System.out.println("[�۽� ����]");
			
			for(int i = 1; i <= 5; i++) {
				String msg = "�޼���-" + i;
				
				byte[] bytes = msg.getBytes("utf-8");
				
				DatagramPacket packet 
					= new DatagramPacket(bytes, 
							             bytes.length, 
							             new InetSocketAddress("localhost", 10003));
				
				Thread.sleep(1000);
				
				socket.send(packet);
				System.out.println("������ �������� ũ�� : " + bytes.length);
			}
			
			System.out.println("[�۽� �Ϸ�]");
			socket.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}



