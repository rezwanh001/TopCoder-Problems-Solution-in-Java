public class WidgetRepairs {

	public int days(int[] arrivals, int numPerDay) {
		int sm = 0;
		int ans = 0;
		for(int x : arrivals){
			sm += x;
			if (sm > 0) {
				ans += 1;
				sm -= Math.min(numPerDay, sm);
			}
		}
		if (sm > 0){
			ans += (sm + numPerDay - 1)/numPerDay;
		}
		return ans;
	}

}
