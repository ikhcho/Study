package study.java.inheritTest;

public class Circle extends Shape{
	
	double radius;
	double circumference = 2*Math.PI;
	
	public Circle(String color, double radius) {
		super(color,"Circle");
		
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRaidus(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea(){
		return Math.PI * radius * radius;
	}
	
	@Override
	public double calculatePerimeter(){
		return 2 * Math.PI * radius;
	}
}
