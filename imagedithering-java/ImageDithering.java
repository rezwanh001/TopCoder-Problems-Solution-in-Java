public class ImageDithering {

	public static int count(String dithered, String[] screen) {
		int cnt = 0;
		for(int i =0;i< screen.length;i++){
			String string = screen[i];
			for (int j = 0; j < string.length(); j++) {
//				prl( (dithered.indexOf(string.charAt(j))  ));
				if (dithered.indexOf(string.charAt(j)) != -1) {
					cnt += 1;
				}
			}
		}
		return cnt;
	}
	/**
	public static void main(String[] args) {
		String[] s = {"AAAAAAAA", "ABWBWBWA", "AWBWBWBA", "ABWBWBWA", "AWBWBWBA", "AAAAAAAA"};
		prl(count("BW",s ));
		//whatTime(3661);
	}
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}
	*/

}
