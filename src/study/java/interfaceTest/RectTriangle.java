package study.java.interfaceTest;

public class RectTriangle extends Shape{
	double width;
	double height;
	
	RectTriangle(double w, double h){
		super(3);
		this.width = w;
		this.height = h;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height/2;
	}
	
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.sqrt((width*width + height*height)) + width + height;
	}
	
}
