package study.java.network.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * java UDPEchoClientMain 192.168.1.20 10004
 */

public class UDPEchoClientMain {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("-----------------------------------------");
			System.out.println("  명령어가 잘못되었습니다.");
			System.out.println("  사용법 : java UDPEchoClientMain ip port");
			System.out.println("-----------------------------------------");
			System.exit(0);
		}
		
		String ip = args[0];
		int port = 0;
		try {
			port = Integer.parseInt(args[1]);		// "-10001"
			if(port < 0)
				throw new Exception();
			
		} catch(Exception e) {
			System.out.println("port는 양의 정수형만 가능합니다.");
			System.exit(0);
		}
		
		InetAddress myInetAddress = null;
		try {
			myInetAddress = InetAddress.getByName(ip);
		} catch (UnknownHostException e) {
			System.out.println("잘못된 도메인 또는 IP입니다.");
			System.exit(0);
		}
		
	//------------------------------

		DatagramSocket socket = null;
		
		try {
			
			socket = new DatagramSocket();
			
			String line = null;
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("서버에 전송할 메세지를 입력하세요(quit 입력시 종료)");
			
			while((line = keyboard.readLine()) != null) {
				
				// 전송
				DatagramPacket sendPacket 
					= new DatagramPacket(line.getBytes(), line.getBytes().length, 
										 myInetAddress, port);
				socket.send(sendPacket);
				
				if(line.equalsIgnoreCase("quit"))
					break;
				
				// 수신
				byte[] buf = new byte[line.getBytes().length];
				DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);
				socket.receive(receivePacket);
				
				String msg = new String(buf);
				System.out.println("전송받은 문자열 : " + msg);
			}
			
		} catch(Exception e) {
			
		} finally {
			if(socket != null)
				socket.close();
		}
	}
}














