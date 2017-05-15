package study.java.interfaceTest;

public class Rectangle extends Shape implements Resizable {
	double width;
	double height;
	
	Rectangle(double w, double h){
		super(4);
		this.width = w;
		this.height = h;
	}
	
	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width = width * s;
		height = height * s;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}
	
}
