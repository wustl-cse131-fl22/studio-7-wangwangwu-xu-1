package studio7;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int initLength, int initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int Area() {
		return this.length*this.width;
		
	}
	
	public int Perimeter() {
		return 2*(this.length+this.width);
		
	}
	
	public String toString() {
		return length +" * " + width +" = "+ Area();
	}
	
	public static void main(String[] args) {
		Rectangle R = new Rectangle(2,4);
		System.out.println(R.Perimeter());
		System.out.println(R);
	}
}
