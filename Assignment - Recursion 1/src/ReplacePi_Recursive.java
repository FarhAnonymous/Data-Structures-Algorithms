
public class ReplacePi_Recursive {
	
	public static String replace(String input) {
		if(input.length() <= 1) {
			return input;
		}
		String str = "";
		if(input.charAt(0) == 'p' && input.charAt(1) == 'i') {
			str += "3.14";
            return str + replace(input.substring(2));
		}
		return input.charAt(0) + replace(input.substring(1));
		
	}

	public static void main(String[] args) {
		String input = "xpix";
		System.out.println(replace(input));
		

	}

}
