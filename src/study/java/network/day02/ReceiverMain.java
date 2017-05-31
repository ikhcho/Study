package study.java.network.day02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiverMain {

	public static void main(String[] args) {
		
		try {
			DatagramSocket socket = new DatagramSocket(10003);
			
			System.out.println("[���� ����]");
			
			byte[] bytes = new byte[100];
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
			
			while(true) {
				socket.receive(packet);
				String msg = new String(packet.getData(), "utf-8");
				
				System.out.println("[���ŵ� ����] : " + msg);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
