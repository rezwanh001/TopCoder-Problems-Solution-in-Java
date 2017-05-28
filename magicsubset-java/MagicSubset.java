public class MagicSubset {

	public int findBest(int[] values) {
		int n = values.length;
		int sm1 = 0;
		for(int i = 1; i < n;i++){
			sm1 += Math.max(0, values[i]);
		}
		int sm2 = values[0];
		for(int i = 1; i < n;i++){
			sm2 += Math.min(0, values[i]);
		}
		return Math.max(sm1, -sm2);
	}

}
