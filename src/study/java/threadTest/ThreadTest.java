package study.java.threadTest;

class MyThread extends Thread{
	@Override
	public void run(){ //start method�� ���ؼ� �ڵ����� ȣ��
		System.out.println("�޼ҵ�1����");
		for(char i='a'; i<='z';i++){
			System.out.println(Thread.currentThread().getName() + i);
			try {
				sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�޼ҵ�1��");
	}
}

class MyThread2 extends Thread{
	MyThread2(String name){
		super(name);
	}
	
	@Override
	public void run(){ //start method�� ���ؼ� �ڵ����� ȣ��
		System.out.println("�޼ҵ�2����");
		for(char i='A'; i<='Z';i++){
			System.out.println(Thread.currentThread().getName() + i);
			try {
				sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�޼ҵ�2��");
	}
}
class MyThread3 implements Runnable{
	
	@Override
	public void run(){ //start method�� ���ؼ� �ڵ����� ȣ��
		System.out.println("�޼ҵ�3����");
		for(char i='z'; i>='a';i--){
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�޼ҵ�3��");
	}
}


public class ThreadTest{
	
	public static void method(){
		System.out.println("�޼ҵ�4����");
		for(char i='a'; i<='z';i++){
			System.out.println(Thread.currentThread().getName() + i);
		}
		System.out.println("�޼ҵ�4��");
	}
	
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start();
		
		MyThread2 thread2 = new MyThread2("2nd");
		thread2.start();
		
		MyThread3 thread = new MyThread3();
		Thread thread3 = new Thread(thread);
		thread3.start();
		
		System.out.println("���ν���");
		for(int i=0; i<20;i++){
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("���γ�");
	}
}
