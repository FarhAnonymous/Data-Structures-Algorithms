
public class CheckNumberInArray {
	
	public static boolean checkNumber(int input[], int x) {
		if(input.length <= 0) {
			return false;
		}
		
		if(input[0] == x) {
			return true;
		}
		
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++) {
			smallInput[i-1] = input[i];
		}
		boolean ans = checkNumber(smallInput, x);
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {2, 4, 1, 11, 18};
		int x = 12;
		System.out.println(checkNumber(arr, x));
	}

}
