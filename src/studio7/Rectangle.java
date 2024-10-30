package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle (double length, double width) {
		this.length  =length; 
		this.width = width;
	
	}
	

	public double getArea() {
		return length*width; 
	}
	
	public double getPerimeter() {
		return length+width+length+width;
	}
	public boolean square () {
		if (this.length == this.width) {
			return true;
		} return false;
		}
		

		
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3,6);
		Rectangle r2 = new Rectangle(12,7);
		System.out.println("Area of rectangle: " + r1.getArea() + " Perimeter of rectangle " + r1.getPerimeter());
		System.out.println("Square: " + r1.square()); 
		System.out.println("Perimeter of rectangle: " + r2.getArea() + " Perimeter of rectangle " + r2.getPerimeter());
		System.out.println("Square: " + r2.square()); 


	
		
	}

}
