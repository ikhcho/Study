package study.java.network.day02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SenderMain {

	public static void main(String[] args) {
		
		try {
			
			DatagramSocket socket = new DatagramSocket();
			
			System.out.println("[송신 시작]");
			
			for(int i = 1; i <= 5; i++) {
				String msg = "메세지-" + i;
				
				byte[] bytes = msg.getBytes("utf-8");
				
				DatagramPacket packet 
					= new DatagramPacket(bytes, 
							             bytes.length, 
							             new InetSocketAddress("localhost", 10003));
				
				Thread.sleep(1000);
				
				socket.send(packet);
				System.out.println("전송한 데이터의 크기 : " + bytes.length);
			}
			
			System.out.println("[송신 완료]");
			socket.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}



