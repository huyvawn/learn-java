package oop_practice;

 class Square extends Shape {
	double side;
	public Square (double side) {
		this.side = side;
	}
	
	@Override
	double Area() {
		// TODO Auto-generated method stub
		double area = side*side;
		return area;
	}

	@Override
	double Perimeter() {
		// TODO Auto-generated method stub
		double perimeter = 4*side;
		return perimeter;
	}

}
