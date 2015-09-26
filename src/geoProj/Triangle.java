package geoProj;

public class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	
	public Triangle() {
		
	}
	
	public Triangle(double sd1, double sd2, double sd3) {
		this.setSide1(sd1);
		this.setSide2(sd2);
		this.setSide3(sd3);
	}
	
	@Override
	public double getArea() {
		double s = ((this.getSide1() + this.getSide2() + this.getSide3()) / 2);
		double area = Math.sqrt(s * (s-this.getSide1()) * (s-this.getSide2()) * (s-this.getSide3()));
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = this.getSide1() + this.getSide2() + this.getSide3();
		return perimeter;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	

	public String toString() {
		return "The triangle has an area of " + this.getArea() + " and\n perimeter of " + this.getPerimeter();
	}
}
