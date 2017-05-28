import java.util.Set;
import java.util.TreeSet;

public class SuperUserDo {

	public int install(int[] A, int[] B) {
		Set<Integer> numbers = new TreeSet<Integer>();
		int l = A.length;
		for (int i = 0; i < B.length; i++) {
			for (int j = A[i]; j <= B[i]; j++) {
				numbers.add(j);
			}
		}
		return numbers.size();
	}

}
