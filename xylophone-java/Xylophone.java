import java.util.HashSet;
import java.util.Set;

public class Xylophone {

	public static int countKeys(int[] keys) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < keys.length; i++) {
			int n = keys[i] % 7;
			set.add(n);
		}
		return set.size();
	}
	/*
	public static void main(String[] args) {
		int a[] = {1,8,3};
		prl(countKeys(a));
	}
	
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}
	*/
}
