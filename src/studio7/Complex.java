package studio7;

public class Complex {
	
	private double real;
	private double imaginary;
	
	public Complex() {
	}
	
	public Complex(double r, double i) {
		real = r;
		imaginary = i;
	}
	
	

	public String toString() {
		return real+"+"+imaginary+"i";
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	
	public Complex add(Complex other) {
		return new Complex(real+other.real,imaginary+other.imaginary);
	}
	
	public Complex multiply(Complex other) {
		return new Complex(real*other.real-imaginary*other.imaginary,real*other.imaginary+imaginary*other.real);
	}

	public static void main(String[] args) {
		Complex x = new Complex(1,1);
		System.out.println(x);
		System.out.println(x.multiply(new Complex(2,3)));

	}

}
