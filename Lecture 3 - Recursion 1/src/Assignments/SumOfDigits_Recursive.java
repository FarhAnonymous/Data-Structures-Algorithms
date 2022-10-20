package Assignments;

public class SumOfDigits_Recursive {
	
	public static int sumOfDigits(int input) {
		if(input/10 == 0) {
			return input;
		}
		int ans = sumOfDigits(input/10) + input%10;
		return ans;
	}

	public static void main(String[] args) {
		int input = 12345;
		System.out.println(sumOfDigits(input));
		

	}

}
