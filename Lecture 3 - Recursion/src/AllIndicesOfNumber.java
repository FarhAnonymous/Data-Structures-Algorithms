
public class AllIndicesOfNumber {
	
	public static int[] allIndexes(int input[], int x, int si) {
		if (si == input.length) {
			return new int[0];
		}
		int ans[] = allIndexes(input, x, si + 1);
		if (input[si] == x) {
			int smallAns[] = new int[ans.length + 1];
			smallAns[0] = si;

			for (int i = 0; i < ans.length; i++) {
				smallAns[i + 1] = ans[i];
			}
			return smallAns;
		}

		else {
			return ans;
		}
	}

	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input, x, 0);
	}

	public static void main(String[] args) {

		int arr[] = { 9, 8, 10, 8, 8 };
		int x = 8;
		int outputArr[] = allIndexes(arr, x);
		
		for(int i = 0; i < outputArr.length; i++) {
			System.out.print(outputArr[i] + " ");
		}

	}

}
