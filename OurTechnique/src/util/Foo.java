package util;

public class Foo {


	public static void getFieldsIn(
			String s) {
//		|.| |=|>|<|\\?|(|)|&|&&|\\||
//		String[] arr = s.split(";");
//		String[] arr = s.split(" ");
//		Pattern p = Pattern.compile(regex)
		
		String[] arr = s.split("[\\.\\(\\) =><\\?&|,;]");
//		String[] arr = s.split("\\(");
		for (String string : arr) {
			if (validToken(string))
				System.out.println(string);
		}
		
	}

	private static boolean validToken(String string) {
		if (string.equals(" ") || string.equals("this") || 
				string.equals("super") || string.equals(" "))
		return false;
		return false;
	}

	public static void main(String[] args) {
		getFieldsIn("ArrayList<LookupField> lastLF = last.getLookupF(a,b,c);");

	}

}
