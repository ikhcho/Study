package study.java.network.day02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 	java UDPEchoServerMain 10004
 */

public class UDPEchoServerMain {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("사용법 : java UDPEchoServerMain port");
			System.exit(0);
		}
		
		int port = Integer.parseInt(args[0]);
		
	//-----------------------------------
		
		DatagramSocket socket = null;
		
		try {
			
			socket = new DatagramSocket(port);
			
			System.out.println("접속 대기상태입니다.");
			
			while(true) {
				
				// 수신
				byte[] buf = new byte[1024];
				DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);
				socket.receive(receivePacket);
				
				String msg = new String(receivePacket.getData(), 0, buf.length);
				msg = msg.trim();
				System.out.println("수신된 메세지 : " + msg);
				
				if(msg.equalsIgnoreCase("quit"))
					break;
				
				// 전송
				DatagramPacket sendPacket = new DatagramPacket(receivePacket.getData(),
															   receivePacket.getData().length,
															   receivePacket.getAddress(), 			
															   receivePacket.getPort());
				socket.send(sendPacket);
			}
			
			System.out.println("EchoServer를 종료합니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(socket != null)
				socket.close();
		}
	}
}














