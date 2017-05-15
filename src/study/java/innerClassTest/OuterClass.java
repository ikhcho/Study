package study.java.innerClassTest;

public class OuterClass {

	// 1.�������
	int a = 10;// instance ����
	static int b = 20;// class ����

	// �޼���
	void print() {
		System.out.println("instance �޼���:" + (a + b));
	}

	static void print2() {
		System.out.println("static �޼���:" + b);
	}

	// Inner class
	class InnerClass {
		// �������
		int c = 10;// instance ����
		// static int d=20;//class ���� �Ұ�

		void print3() {
			System.out.println("instance �޼���:" + c);
		}

		/*
		 * �Ұ� static void print4(){ System.out.println("static �޼���:"+b); }
		 */
	}

	// static Inner class
	static class InnerClass2 {
		// �������
		int e = 10;// instance ����
		static int f = 20;// class ���� �Ұ�

		void print5() {
			System.out.println("instance �޼���:" + (e + f));
		}

		static void print6() {
			System.out.println("static �޼���:" + f);
		}

	}
	
	// Method inner class
	// Java8 ���� final ��������
	void show(String msg){//�Ű������� ��������
		//��������
		String name="������"; 
		//final String version7
		class InnerClass3{
			int i=10;
			void print7(){
				System.out.println("local Ŭ���� : msg = "+ msg + "name = " + name + " i = " + i);
			}
		}
		
		InnerClass3 local = new InnerClass3();
		local.print7();
		
		/* Method ��(���� Ŭ����)���� static �ȵ�
		static InnerClass4{
		}
		*/
	}
}
