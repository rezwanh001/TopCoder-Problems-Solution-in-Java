import java.util.Set;

public class SquareFreeString {

	public static String isSquareFree(String s) {
//		Set<Character> set;
//		Set set2;
		for (int i = 2; i <= s.length(); i+=2) {
			for (int j = 0; j <= s.length() - i; j++) {
				if (isSquare(s.substring(j,j + i))) {
					return "not square-free";
				}
			}
			
		}
		return "square-free";
	}
	private static boolean isSquare(String s) {
		int half = s.length() / 2;
		for (int i = 0; i < half; i++) {
			if (s.charAt(i) != s.charAt(i + half)) {
				return false;
			}
		}
		return true;
	}
	/*
	public static void main(String[] args) {
		prl(isSquareFree("bobo"));
	}
	
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}
	*/
}
