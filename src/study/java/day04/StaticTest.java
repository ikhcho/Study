package study.java.day04;

class Mystatic{
	//field
	int a=100;
	static int b=200;
	
	//block
	static{
		//a+=a;
		//a+=b;
		b++;
		//b+=a;
	}
	//instance method... ��ü���� �� ��밡��
	void print(){
		System.out.println(a);
		System.out.println(b);
	}
	//
	static void print2(){
		//System.out.println(a);// static�޼��� ���� non static ���� ��� �Ұ�
		System.out.println(b);
	}
}


class Man{
	String name;
	int age;
	
	Man(){
		
	}
	double compute(char op, Calculator calc, int x, int y){
		switch(op){
			case'+':
				return calc.plus(x,y);
			case'-':
				return calc.minus(x,y);
			default:
				return 0;
		}
	}
}

class Calculator{
	static double pi=3.141592;
	//pi=pi+pi;//�޸𸮰� �������� �ʴ� pi������ ������ ������ �� ����.
	static{
		pi = pi + 10;// static ������ �޸� �Ҵ��� ������� ������ ���� ����, static ���� �̿ܿ��� ��� �Ұ�
		System.out.println(pi);
	}
	Calculator(){
		System.out.println("������");// class load�� �����ں��� �޸� �Ҵ�(����)�� ���� ����ȴ�. 
	}
	static double plus(int x, int y){
		return x+y;
	}
	double minus(int x, int y){
		return x-y;
	}
	
}
//static�޸𸮿� load, static block ���� -> main ����
public class StaticTest {
	public static void main(String[] args) {
		Calculator newCalc = new Calculator();
		Man newMan = new Man();
		System.out.println(newMan.compute('+', newCalc, 30, 40));
		
		//
		System.out.println(Calculator.plus(10,20));
	}
}
