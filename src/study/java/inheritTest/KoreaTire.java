package study.java.inheritTest;

public class KoreaTire extends Tire{
	String name;
	
	public KoreaTire(String color, int radis, String name){
		super(color,radis);
		this.name = name;
	}
	
	@Override
	public void rolling(){
		System.out.println(name + "Ÿ�̾ �������ϴ�.");
		System.out.println("color = "+getColor());
		System.out.println("radis = "+getRadis());
	}
}
