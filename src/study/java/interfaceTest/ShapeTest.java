package study.java.interfaceTest;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
		
		Shape[] test = {new Rectangle(5, 6), new RectTriangle(6, 2)};
		
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Rectangle(5, 6));
		list.add(new RectTriangle(6, 2));
		
		//Array
		for(int i=0; i<test.length; i++)
		{
			System.out.println("area:" + test[i].getArea());
			System.out.println("area:" + test[i].getPerimeter());
			if(test[i] instanceof Rectangle){
				((Rectangle)test[i]).resize(0.5);
				System.out.println("new area:" + test[i].getArea());
				System.out.println("new area:" + test[i].getPerimeter());
			}
		}
		
		System.out.println("===ArrayList Test===");
		//ArrayList
		for(Shape s : list)
		{
			System.out.println("area:" + s.getArea());
			System.out.println("area:" + s.getPerimeter());
			if(s instanceof Resizable){
				((Rectangle)s).resize(0.5);
				System.out.println("new area:" + s.getArea());
				System.out.println("new area:" + s.getPerimeter());
			}
		}
	}
}
