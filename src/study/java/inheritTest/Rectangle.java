package study.java.inheritTest;

public class Rectangle extends Shape{
	int length;
	int width;
	public Rectangle(String color, int length, int width) {
		super(color,"Rectangle");
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea(){
		return length * width;
	}
	
	@Override
	public double calculatePerimeter(){
		return 2 * (length + width);
	}
	
}
