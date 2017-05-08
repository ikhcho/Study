package study.java.day02;

public class ParamTest {
	static int a=10;
	static int b=20;
	public static void main(String[] args) {
		
		//1
		System.out.println("A="+a + ", B="+b);
		swap(a,b);
		System.out.println("A="+a + ", B="+b);
		
		//2
		int[] arr={10,20};
		swap(arr);
		System.out.println("A="+arr[0] + ", B="+arr[1]);
	
		//3
		String s1="AB";
		String s2="CD";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		swap(s1,s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("A="+s1 + ", B="+s2);
	}
	
	public static void swap(int i, int j)
	{
		a=j;
		b=i;
		System.out.println("A="+a + ", B="+b);
	}
	
	public static void swap(int[] arr2)
	{
		int tmp;
		tmp = arr2[0];
		arr2[0]=arr2[1];
		arr2[1]=tmp;
	}
	
	public static void swap(String s3, String s4)
	{
		String tmp;
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		tmp = s3;
		s3=s4;
		s4=tmp;
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
