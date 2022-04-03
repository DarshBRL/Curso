package entities;

public class Rectangle {
	
	//width = largura | height = altura
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return (width + height) * 2;
	}
	public double diagonal() {
		return Math.sqrt (width * width + height * height);
	}
	/*
	public String toString() {
		return "Area = "
			+ String.format("%.2f%n", area())
			+ "Perimeter = "
			+ String.format("%.2f%n", perimeter())
			+ "Diagonal = "
			+ String.format("%.2f%n", diagonal());
	}*/

}
