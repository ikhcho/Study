package study.java.threadTest;

class BathRoom{
	
	boolean first = true;
	public synchronized void use(String name){
		
		if(first && name.equals("A")){
			first=false;
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name+"입장");
		System.out.println(name+"사용중");
		System.out.println(name+"퇴장");
		System.out.println("==================");
		notifyAll();
	}
}

class BathRoomThread extends Thread{
	BathRoom room;
	String name;
	
	public BathRoomThread(BathRoom room, String name) {
		super();
		this.room = room;
		this.name = name;
	}

	@Override
	public void run(){
		room.use(name);
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		BathRoomThread br1 = new BathRoomThread(new BathRoom(), "A");
		BathRoomThread br2 = new BathRoomThread(new BathRoom(), "B");
		BathRoomThread br3 = new BathRoomThread(new BathRoom(), "C");
		BathRoomThread br4 = new BathRoomThread(new BathRoom(), "D");
		BathRoomThread br5 = new BathRoomThread(new BathRoom(), "E");
		br1.start();
		br2.start();
		br3.start();
		br4.start();
		br5.start();
	}
}
