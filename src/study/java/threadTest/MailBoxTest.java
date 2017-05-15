package study.java.threadTest;

// ������ ������ Ŭ����

class Producer extends Thread {
	private MailBox blank;
	private String[] msgList;

	// �����Ͻÿ�
	public Producer(MailBox blank, String[] msgList) {
		super();
		this.blank = blank;
		this.msgList = msgList;
	}

	@Override
	public void run() {
		for (String list : msgList) {
			blank.storeMessage(list);
			System.out.println("����:" + list);
		}
	}

}

// �Һ��� ������ Ŭ����
class Consumer extends Thread {
	private MailBox blank;
	private int count;
	private String s;

	// �����Ͻÿ�
	public Consumer(MailBox blank, int count) {
		super();
		this.blank = blank;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			s = blank.retrieveMessage();
			System.out.println("���:" + s);
		}

	}
}

// MailBox Ŭ����, �޼����� �����ϰ� ó���ϴ� ������ ����Ѵ�.
class MailBox {
	private String message;
	private boolean request;

	public synchronized void storeMessage(String message) {
		// �����Ͻÿ�
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
		// �����Ͻÿ�
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

// �����ڿ� �Һ��� �����带 �⵿��Ű�� Ŭ����
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