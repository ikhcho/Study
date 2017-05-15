package study.java.threadTest;

class MyThread extends Thread{
	@Override
	public void run(){ //start method에 의해서 자동으로 호출
		System.out.println("메소드1시작");
		for(char i='a'; i<='z';i++){
			System.out.println(Thread.currentThread().getName() + i);
			try {
				sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("메소드1끝");
	}
}

class MyThread2 extends Thread{
	MyThread2(String name){
		super(name);
	}
	
	@Override
	public void run(){ //start method에 의해서 자동으로 호출
		System.out.println("메소드2시작");
		for(char i='A'; i<='Z';i++){
			System.out.println(Thread.currentThread().getName() + i);
			try {
				sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("메소드2끝");
	}
}
class MyThread3 implements Runnable{
	
	@Override
	public void run(){ //start method에 의해서 자동으로 호출
		System.out.println("메소드3시작");
		for(char i='z'; i>='a';i--){
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("메소드3끝");
	}
}


public class ThreadTest{
	
	public static void method(){
		System.out.println("메소드4시작");
		for(char i='a'; i<='z';i++){
			System.out.println(Thread.currentThread().getName() + i);
		}
		System.out.println("메소드4끝");
	}
	
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start();
		
		MyThread2 thread2 = new MyThread2("2nd");
		thread2.start();
		
		MyThread3 thread = new MyThread3();
		Thread thread3 = new Thread(thread);
		thread3.start();
		
		System.out.println("메인시작");
		for(int i=0; i<20;i++){
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("메인끝");
	}
}
