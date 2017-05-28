public class RangeEncoding {

	public int minRanges(int[] arr) {
		Boolean flag = false;
		int cnt  = 1;
		for(int i = 0; i < arr.length-1; i++){
			if((arr[i+1] - arr[i]) > 1){
				cnt += 1;
			}
		}
		return cnt;
	}

}
