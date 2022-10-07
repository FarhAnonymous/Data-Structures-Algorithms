package Assignments;

public class CountZeros {

	public static int countZerosRec(int input) {
		if (input / 10 == 0) {
			if (input == 0) {
				return 1;
			}
			return 0;
		}
		int ans = countZerosRec(input / 10);
		if (input % 10 == 0) {
			ans++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int input = 102;
		System.out.println(countZerosRec(input));

	}

}
