public class DoubleString {

	public static String check(String S) {
		int len = S.length();
		if (len % 2 == 1) {
			return "not square";
		}
		int mid = len / 2;
		boolean flag = false;
		for (int i = 0, j = mid; i < mid; i++, j++) {
			if (S.charAt(i) == S.charAt(j)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			return "square";
		} else {
			return "not square";
		}
	}
	/**
	 * public static void main(String[] args) { check("REZwan");
	 * 
	 * }
	 * 
	 * static void prl(Object anyObject) { System.out.println(anyObject); }
	 */
}
