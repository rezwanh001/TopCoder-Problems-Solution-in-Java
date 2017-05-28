import java.util.Scanner;
import java.lang.Math;

public class FibonacciDiv2 {
	static Scanner sc = new Scanner(System.in);

	public static int find(int N) {
		int Fib1 = 0;
		int Fib2 = 1;

		while (Fib2 < N) {
			int T = Fib1 + Fib2;
			Fib1 = Fib2;
			Fib2 = T;
		}

		return Math.min(N - Fib1, Fib2 - N);
	}
	/**
	 * public static void main(String[] args){ prln(find(13)); } static void
	 * prln(Object anObject){ System.out.println(anObject); }
	 */
}
