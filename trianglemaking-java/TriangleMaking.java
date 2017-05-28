import java.security.PrivateKey;
import java.util.Arrays;

public class TriangleMaking {
	static int [] A =  new int[4];
	static public int maxPerimeter(int a, int b, int c) {
		A[1] = a;
		A[2] = b;
		A[3] = c;
		Arrays.sort(A);
		int ans;
//		prl(A[0]);
//		prl(A[1] + " " + A[2] + " " + A[3]);
		if (A[1] + A[2] > A[3]){
			ans = A[1] + A[2] + A[3];
		}
		else {
			int k  = A[1] + A[2] - 1;
			ans = k + A[1] + A[2];
		}
		return ans;
	}
	/*
	public static void main(String[] args) {
		prl(maxPerimeter(41, 64, 16));
	}
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}
	*/

}
