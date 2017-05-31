package study.java.network.day02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 	java UDPEchoServerMain 10004
 */

public class UDPEchoServerMain {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("���� : java UDPEchoServerMain port");
			System.exit(0);
		}
		
		int port = Integer.parseInt(args[0]);
		
	//-----------------------------------
		
		DatagramSocket socket = null;
		
		try {
			
			socket = new DatagramSocket(port);
			
			System.out.println("���� �������Դϴ�.");
			
			while(true) {
				
				// ����
				byte[] buf = new byte[1024];
				DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);
				socket.receive(receivePacket);
				
				String msg = new String(receivePacket.getData(), 0, buf.length);
				msg = msg.trim();
				System.out.println("���ŵ� �޼��� : " + msg);
				
				if(msg.equalsIgnoreCase("quit"))
					break;
				
				// ����
				DatagramPacket sendPacket = new DatagramPacket(receivePacket.getData(),
															   receivePacket.getData().length,
															   receivePacket.getAddress(), 			
															   receivePacket.getPort());
				socket.send(sendPacket);
			}
			
			System.out.println("EchoServer�� �����մϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(socket != null)
				socket.close();
		}
	}
}














