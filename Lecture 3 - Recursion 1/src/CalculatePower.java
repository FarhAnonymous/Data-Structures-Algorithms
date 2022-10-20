
public class CalculatePower {

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}
		return power(x, n - 1) * x;
	}

	public static void main(String[] args) {
		int x = 3;
		int n = 4;
		System.out.println(power(x, n));

	}

}
