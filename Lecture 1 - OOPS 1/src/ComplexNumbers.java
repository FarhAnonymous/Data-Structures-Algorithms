
public class ComplexNumbers {
	private int real;
	private int imaginary;
	
	public ComplexNumbers(int real, int imaginary) {
		this.real= real;
		this.imaginary= imaginary;
	}
	
	public void print() {
		System.out.println(real+" + i"+imaginary);
	}
	public void plus (ComplexNumbers c2) {
		this.real= this.real + c2.real;
		this.imaginary= this.imaginary + c2.imaginary;
	}
	public void multiply (ComplexNumbers c2) {
		int x= (this.real*c2.real) - (this.imaginary*c2.imaginary);
		int y= (this.imaginary*c2.real) + (this.real*c2.imaginary);
		this.real=x;
		this.imaginary=y;
	}
}
