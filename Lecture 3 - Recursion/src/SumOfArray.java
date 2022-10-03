
public class SumOfArray {
	
	public static int sum(int input[]) {
		if(input.length == 1) {
			return input[0];
		}
		
		int smallInput[] = new int[input.length-1];
		for(int i = 1; i < input.length; i++) {
			smallInput[i-1] = input[i];
		}
		int totalSum = sum(smallInput);
		totalSum += input[0];
		return totalSum;
	}

	public static void main(String[] args) {
		int arr[] = {2, 3, 6, 10, 11};
		System.out.println(sum(arr));
		
		
	}

}
