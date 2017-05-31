package study.java.network.day02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread {
	private Socket socket;

	public EchoThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		System.out.println("������ Ŭ���̾�Ʈ�� ���� : [" + socket.getInetAddress() + "]");
	
		try {

			// Ŭ���̾�Ʈ�� �������� �޼����� �����ϴ� ��ü
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			// ������ �޼����� Ŭ���̾�Ʈ���� �������ϴ� ��ü
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			while (true) {
				String msg = br.readLine();

				if (msg == null) {
					System.out.println("Ŭ���̾�Ʈ [" + socket.getInetAddress() + "]���� ��������");
					socket.close();
					break;
				}

				System.out.println("[" + socket.getInetAddress() + "] : " + msg);

				pw.println(msg);
				pw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class EchoThreadServerMain {

	public static void main(String[] args) {
		
		System.out.println("EchoServer�� �����մϴ�.");
		
		try {
			
			ServerSocket server = new ServerSocket(10002);
			
			while(true) {
				Socket client = server.accept();
				EchoThread et = new EchoThread(client);
				et.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}













