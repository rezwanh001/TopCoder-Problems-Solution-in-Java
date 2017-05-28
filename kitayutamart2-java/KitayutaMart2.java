public class KitayutaMart2 {

	public static int numBought(int K, int T) {
		long sm = 0;
		int cnt = 0;
		for (int i = 0; ; i++) {
			sm += (long)Math.pow(2, i) * K;
			cnt += 1;
			if (sm == T){
				break;
			}
		}
		return cnt;
	}
	/*
	public static void main(String[] args) {
		prl(numBought(150,1050));
	}
	
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}
	*/
}
