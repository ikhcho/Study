package study.java.network.day02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * java EchoClientMain 192.168.1.20  10001
 */

public class EchoClientMain {

	public static void main(String[] args) {
	
		if(args.length < 2) {
			System.out.println("명령어가 잘못되었습니다.");
			System.out.println("사용법 : java EchoClient 서버IP 포트번호");
			System.exit(0);
		}
		
		try {
			
			Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
			
			// 키보드에서 서버에 전송할 메세지 입력받는 객체
			//Scanner keyboard = new Scanner(System.in);
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			// 키보드로 입력받은 메세지를 서버에 전송할 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			// 서버에서 보내준 메세지를 수신할 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				System.out.println("서버에 전송할 메세지 입력(quit입력시 종료) : ");
				String msg = keyboard.readLine();
				
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 접속 종료");
					socket.close();
					break;
				}
				
				pw.println(msg);
				pw.flush();
				
				String echoMsg = br.readLine();
				System.out.println("서버에서 재전송한 메세지 : [" + echoMsg + "]");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}














