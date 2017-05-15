package study.java.objectTest;

import java.util.Arrays;

class Bag{
	String brand;
	int size;
	public Bag(String brand, int size) {
		super();
		this.brand = brand;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Bag [brand=" + brand + ", size=" + size + "]";
	}
	
	
}

class Pen extends Object implements Cloneable{
	String model;
	int num;
	int[] arr={10,20,30};
	Bag bag = new Bag("ABC",100);
	
	public Pen(String model, int num) {
		super();
		this.model = model;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Pen [model=" + model + ", num=" + num + ", arr=" + Arrays.toString(arr) + ", bag=" + bag + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Pen pen = (Pen)super.clone();
		pen.arr = Arrays.copyOf(arr, arr.length);
		pen.bag = new Bag(bag.brand,bag.size);
		return pen;
	}
}
public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Pen p1 = new Pen("¸ð³ª¹Ì", 10);
		Pen p2 = p1;
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		Pen p3 = (Pen)(p1.clone());
		p2.num = 1000;
		p3.arr[0]=80;
		p3.bag.size=50;
		System.out.println(p1==p3);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		double a = 1+ Double.MAX_VALUE + Double.MAX_VALUE - Double.MAX_VALUE -Double.MAX_VALUE;
		System.out.println(a);
		
		int b = 2147483647+Integer.MAX_VALUE+Integer.MAX_VALUE +Integer.MAX_VALUE -Integer.MAX_VALUE-Integer.MAX_VALUE;
		System.out.println(b);
	}
}
