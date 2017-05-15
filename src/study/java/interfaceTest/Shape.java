package study.java.interfaceTest;

public abstract class Shape {
	int numSides;
	
	Shape(int numSides){
		this.numSides = numSides;
	}
	
	public int getNumSides() {
		return numSides;
	}
	
	abstract double getArea();
	abstract double getPerimeter();
	
}
