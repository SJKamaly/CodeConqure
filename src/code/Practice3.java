package code;

public class Practice3 {

	public static void main(String[] args) {
		
		String txt = "TekSchool 1234 &%$#@*& 0155";
		System.out.println(capitalChar(txt));
		System.out.println(lowerChar(txt));
		System.out.println(number(txt));
		System.out.println(specialCharacter(txt));

	}
	public static String capitalChar(String cap) {
		return cap.replaceAll("[^A-Z]", "");
	}
	public static String lowerChar(String low) {
		return low.replaceAll("[^a-z]", "");
	}
	public static String number(String num) {
		return num.replaceAll("[^0-9]", "");
	}
	public static String specialCharacter(String charc) {
		return charc.replaceAll("[^a-zA-Z0-9]", "");
	}

}
