
public class RemoveX {
	
	public static String removeX(String input) {
		if (input.length() == 0) {
			return "";
		}
		String str = "";
		if (input.charAt(0) != 'x') {
			str += input.charAt(0);
		}
		String smallAns = removeX(input.substring(1));
		return str + smallAns;

	}

	public static void main(String[] args) {
		String input = "xaxb";
		System.out.println(removeX(input));

	}

}
