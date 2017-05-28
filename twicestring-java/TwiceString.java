public class TwiceString {

	public static String getShortest(String s) {
		String ab = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			ab = s.charAt(i) + ab;
			String ret = s;
			ret += ab;
			if (ret.substring(1).endsWith(s)) {
				return ret;
			}
		}
		return null;
	}
	/*
	public static void main(String[] args) {
		prl(getShortest("aba"));
	}

	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}
	*/

}
