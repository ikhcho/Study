package study.java.threadTest;

// 생산자 스레드 클래스

class Producer extends Thread {
	private MailBox blank;
	private String[] msgList;

	// 구현하시오
	public Producer(MailBox blank, String[] msgList) {
		super();
		this.blank = blank;
		this.msgList = msgList;
	}

	@Override
	public void run() {
		for (String list : msgList) {
			blank.storeMessage(list);
			System.out.println("저장:" + list);
		}
	}

}

// 소비자 스레드 클래스
class Consumer extends Thread {
	private MailBox blank;
	private int count;
	private String s;

	// 구현하시오
	public Consumer(MailBox blank, int count) {
		super();
		this.blank = blank;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			s = blank.retrieveMessage();
			System.out.println("출력:" + s);
		}

	}
}

// MailBox 클래스, 메세지를 저장하고 처리하는 역할을 담당한다.
class MailBox {
	private String message;
	private boolean request;

	public synchronized void storeMessage(String message) {
		// 구현하시오
		if (request) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.message = message;
		request = true;
		notifyAll();
	}

	public synchronized String retrieveMessage() {
		// 구현하시오
		if (request == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		request = false;
		notifyAll();
		return message;
	}
}

// 생산자와 소비자 스레드를 기동시키는 클래스
public class MailBoxTest {

	public static void main(String args[]) {
		String messageList[] = {"ggg","ggsd","asdasd"};

		MailBox mb = new MailBox();
		Producer p = new Producer(mb, messageList);
		Consumer c = new Consumer(mb, messageList.length);
		p.start();
		c.start();
	}
}