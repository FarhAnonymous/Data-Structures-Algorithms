
public class FirstIndexOfNumber {

	public static int firstIndex(int input[], int x, int si) {
		if(si == input.length-1) {
			return -1;
		}
		if(input[si] == x) {
			return si;
		}
		int ans = firstIndex(input, x, si+1);
		return ans;
	}

	public static int firstIndex(int input[], int x) {

		return firstIndex(input, x, 0);
	}

	public static void main(String[] args) {
		int arr[] = { 9, 8, 10, 8 };
		int x = 8;
		System.out.println(firstIndex(arr, x));

	}

}
