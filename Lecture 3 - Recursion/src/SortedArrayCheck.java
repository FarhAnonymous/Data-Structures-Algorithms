
public class SortedArrayCheck {

	public static boolean checkSorted(int arr[]) {
		if (arr.length <= 1) {
			return true;
		}

		if (arr[0] > arr[1]) {
			return false;
		}

		int smallArr[] = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}

		boolean ans = checkSorted(smallArr);
		return ans;

		
	}

	public static void main(String[] args) {

		int arr[] = { 4, 3, 4, 5 };
		System.out.println(checkSorted(arr));

	}

}
