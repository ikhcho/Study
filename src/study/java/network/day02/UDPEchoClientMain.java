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
			System.out.println("  ��ɾ �߸��Ǿ����ϴ�.");
			System.out.println("  ���� : java UDPEchoClientMain ip port");
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
			System.out.println("port�� ���� �������� �����մϴ�.");
			System.exit(0);
		}
		
		InetAddress myInetAddress = null;
		try {
			myInetAddress = InetAddress.getByName(ip);
		} catch (UnknownHostException e) {
			System.out.println("�߸��� ������ �Ǵ� IP�Դϴ�.");
			System.exit(0);
		}
		
	//------------------------------

		DatagramSocket socket = null;
		
		try {
			
			socket = new DatagramSocket();
			
			String line = null;
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("������ ������ �޼����� �Է��ϼ���(quit �Է½� ����)");
			
			while((line = keyboard.readLine()) != null) {
				
				// ����
				DatagramPacket sendPacket 
					= new DatagramPacket(line.getBytes(), line.getBytes().length, 
										 myInetAddress, port);
				socket.send(sendPacket);
				
				if(line.equalsIgnoreCase("quit"))
					break;
				
				// ����
				byte[] buf = new byte[line.getBytes().length];
				DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);
				socket.receive(receivePacket);
				
				String msg = new String(buf);
				System.out.println("���۹��� ���ڿ� : " + msg);
			}
			
		} catch(Exception e) {
			
		} finally {
			if(socket != null)
				socket.close();
		}
	}
}














