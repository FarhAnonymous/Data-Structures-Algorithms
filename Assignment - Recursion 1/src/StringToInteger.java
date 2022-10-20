
public class StringToInteger {

	public static int convertStringToInt(String input) {
		if (input.length() == 0)
			return 0;//

		int val = input.charAt(0) - '0';
		int small = convertStringToInt(input.substring(1));
		return ((val * (int) Math.pow(10, input.length() - 1)) + small);
	}

	public static void main(String[] args) {
		String input = "1231";
		System.out.println(convertStringToInt(input));

		
	}

}
