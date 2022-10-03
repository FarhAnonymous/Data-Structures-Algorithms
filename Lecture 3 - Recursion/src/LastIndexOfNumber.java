
public class LastIndexOfNumber {

	public static int lastIndex(int input[], int x, int si) {
		if (si == input.length) {
			return -1;
		}
		int ans = lastIndex(input, x, si + 1);
		if (ans != -1) {
			return ans;
		}
		if (input[si] == x) {
			return si;
		}

		else {
			return -1;
		}
	}

	public static int lastIndex(int input[], int x) {
		return lastIndex(input, x, 0);
	}

	public static void main(String[] args) {
		int arr[] = { 9, 8, 10, 8 };
		int x = 8;
		lastIndex(arr, x);

	}

}
