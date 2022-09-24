
public class NumberOfDigits {
	
	public static int count(int n) {
		if(n == 0) {
			return 0;
		}
		return count(n/10)+1;
	}

	public static void main(String[] args) {
		int n = 1567;
		System.out.println(count(n));

	}

}
