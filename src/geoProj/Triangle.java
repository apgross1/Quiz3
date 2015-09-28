package geoProj;

public class Triangle extends GeometricObject{
	private double side1 = 1.0; //Default value at 1.0
	private double side2 = 1.0; //Default value at 1.0
	private double side3 = 1.0; //Default value at 1.0
	
	
	/**
	 * Default constructor for Triangle class
	 */
	public Triangle() {
		
	}
	
	/**
	 * Overloaded constructor for Triangle class that takes the three side lengths as arguments
	 * @param sd1
	 * @param sd2
	 * @param sd3
	 */
	public Triangle(double sd1, double sd2, double sd3) {
		this.setSide1(sd1);
		this.setSide2(sd2);
		this.setSide3(sd3);
	}
	
	/* (non-Javadoc)
	 * @see geoProj.GeometricObject#getArea()
	 * Overridden method from GeomtetricObject. This method takes the lengths of the triangle and returns the area.
	 */
	@Override
	public double getArea() {
		double s = ((this.getSide1() + this.getSide2() + this.getSide3()) / 2);
		double area = Math.sqrt(s * (s-this.getSide1()) * (s-this.getSide2()) * (s-this.getSide3()));
		return area;
	}

	/* (non-Javadoc)
	 * @see geoProj.GeometricObject#getPerimeter()
	 * Overridden method from GeometricObject. This method takes the lengths of the triangle and returns the perimeter
	 */
	@Override
	public double getPerimeter() {
		double perimeter = this.getSide1() + this.getSide2() + this.getSide3();
		return perimeter;
	}

	/**
	 * Getter for Side1
	 * @return
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * Setter for side 1
	 * @param side1
	 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/**
	 * Getter for side 2
	 * @return
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * Setter for side 2
	 * @param side2
	 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/**
	 * Getter for side 3
	 * @return
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * Setter for side 3
	 * @param side3
	 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	

	/* (non-Javadoc)
	 * @see geoProj.GeometricObject#toString()
	 * Overridden method that returns String of properties of instance of class Triangle
	 */
	public String toString() {
		return "The triangle has an area of " + this.getArea() + " and\n perimeter of " + this.getPerimeter();
	}
}
