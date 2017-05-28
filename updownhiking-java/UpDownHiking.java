public class UpDownHiking {

	public static int maxHeight(int N, int A, int B) {
		int res = 0;
		int low = 0, high = 100000000;
		
		while (low <= high){
			int mid = (low + high) / 2;
			
			if ((mid + A  - 1)/A + (mid + B - 1)/B <= N){
				res = mid;
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return res;
	}
	/*
	public static void main(String[] args) {
		prl(maxHeight(3,7,10));
	}
	

	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}*/
	
}
