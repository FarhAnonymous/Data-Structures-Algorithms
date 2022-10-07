package Assignments;

public class Multiplication_Recursive {

	public static int multiplyTwoIntegers(int m, int n) {
		if (n == 1) {
			return m;
		}
		return multiplyTwoIntegers(m, n - 1) + m;
	}

	public static void main(String[] args) {
		int m = 3;
		int n = 5;
		System.out.println(multiplyTwoIntegers(m, n));
	}

}
