package oop_bai2;

public class Rectangle implements iCalculate {
	double length, width;
	public Rectangle(double length, double width) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
	}
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		double area = length*width;
		return area;
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		double perimeter = (length+width)*2;
		return perimeter;
	}

}
