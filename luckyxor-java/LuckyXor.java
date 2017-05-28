public class LuckyXor {

	public static int construct(int a) {
		for (int i = a + 1; i <= 100 ; i++) {
			if(lucky(a^i)){
				return i;
			}
		}
		return -1;
	}
	static boolean lucky(int i){
		while (i > 0) {
			if (i % 10 != 4 && i % 10 != 7){
				return false;
			}
			i /= 10;
		}
		return true;
	}
	/*
	public static void main(String[] args) {
		prl(construct(4));
	}
	
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}
	*/

}
