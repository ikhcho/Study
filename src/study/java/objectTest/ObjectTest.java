package study.java.objectTest;


import java.util.HashSet;

public class ObjectTest {
	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println(b.toString());
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		MyClass my2 = new MyClass("Ŀ��");
		System.out.println(my2.equals("Ŀ��"));
		
		//�ߺ��Ұ�
		HashSet keys = new HashSet();
		keys.add("������");
		keys.add("ȭ����");
		keys.add("������");
		keys.add(100);
		keys.add(new Integer(100));
		keys.add(my2);
		System.out.println(keys.size());
		
	}
}


class MyClass{
	
	String name;
	MyClass(String name){
		this.name = name;
	}
	@Override
	public String toString(){
		return name + "�ֹ��մϴ�.";
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof MyClass)) return false;
		
		MyClass aa = (MyClass)obj;
		
		return name.equals(aa.name);
	}
	
	@Override
	public int hashCode(){
		return name.hashCode();
	}
}