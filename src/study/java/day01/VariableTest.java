package study.java.day01;

public class VariableTest {
	//객체변수->자동초기화
	
	public static void main(String[] args){
		//변수선언 변수이름
		//지역변수->초기화하지 않으면 사용할 수 없음=반드시 초기화
		//1.8가지 기본형이 있다.
		byte by=30;
		byte re=(byte)(by+(by++)+(++by));
		System.out.println("byte타입:"+re);
		
		short s=32767;
		
		int i=2147483647;
		i++;
		System.out.println("int타입:"+i);
		
		long l= 2147483648l;//L,l로 마무리
		l++;
		
		char c='A';//65
		int ic='a';//97
		System.out.println(ic);
		
		boolean b=true;
		System.out.println("boolean타입:"+b);
		
		float f = 3.14f;
		System.out.println("float타입:"+f);
		
		double d = 3.14;
		System.out.println("float타입:"+d);
		
		//형변환
		//1.자동(큰방=작은값)
		int i3=100;
		long a=i3;
		System.out.println(a);
		
		
		//2.강제(작은방=(작은방타입)큰값) , 값 손실 우려
		int i4=(int)a;
		System.out.println(i4);
	}
	
}
