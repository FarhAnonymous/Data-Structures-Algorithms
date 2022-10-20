package Assignments;

public class CheckPalindrom_Recursive {

	public static boolean isStringPalindrome(String input) {
		if (input.length() <= 1) {
			return true;
		} else if (input.charAt(0) != input.charAt(input.length() - 1)) {
			return false;
		}
		return isStringPalindrome(input.substring(1, input.length() - 1));

	}

	public static void main(String[] args) {
		String input = "racecar";
		System.out.println(isStringPalindrome(input));

	}

}
