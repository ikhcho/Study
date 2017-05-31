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
		System.out.println("접속한 클라이언트의 정보 : [" + socket.getInetAddress() + "]");
	
		try {

			// 클라이언트가 전송해준 메세지를 수신하는 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			// 수신한 메세지를 클라이언트에게 재전송하는 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			while (true) {
				String msg = br.readLine();

				if (msg == null) {
					System.out.println("클라이언트 [" + socket.getInetAddress() + "]와의 접속해제");
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
		
		System.out.println("EchoServer를 구동합니다.");
		
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













