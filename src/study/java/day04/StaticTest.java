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
	//instance method... 객체생성 후 사용가능
	void print(){
		System.out.println(a);
		System.out.println(b);
	}
	//
	static void print2(){
		//System.out.println(a);// static메서드 에서 non static 변수 사용 불가
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
	//pi=pi+pi;//메모리가 생성되지 않는 pi변수로 연산을 수행할 수 없다.
	static{
		pi = pi + 10;// static 변수가 메모리 할당을 받을경우 연산을 수행 가능, static 변수 이외에는 사용 불가
		System.out.println(pi);
	}
	Calculator(){
		System.out.println("생성자");// class load시 생성자보다 메모리 할당(연산)이 먼저 실행된다. 
	}
	static double plus(int x, int y){
		return x+y;
	}
	double minus(int x, int y){
		return x-y;
	}
	
}
//static메모리에 load, static block 실행 -> main 시작
public class StaticTest {
	public static void main(String[] args) {
		Calculator newCalc = new Calculator();
		Man newMan = new Man();
		System.out.println(newMan.compute('+', newCalc, 30, 40));
		
		//
		System.out.println(Calculator.plus(10,20));
	}
}
