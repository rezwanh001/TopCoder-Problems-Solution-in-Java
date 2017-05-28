public class Time {

	public static String whatTime(int seconds) {
		int h = seconds/3600;
		int mn = (seconds/60)%60;
		int sc = seconds%60;
		
		String hh = Integer.toString(h);
		String mm = Integer.toString(mn);
		String scn = Integer.toString(sc);
		
		return hh + ":" + mm + ":" + scn;
	}
	
	
//	public static void main(String[] args) {
//		prl(whatTime(3661));
//		//whatTime(3661);
//	}
//	static void prl(Object anyObject) {
//		System.out.println(anyObject);
//	}
	

}
