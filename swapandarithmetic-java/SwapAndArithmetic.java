import java.util.Arrays;

public class SwapAndArithmetic {

	public static String able(int[] x) {
		Arrays.sort(x);
		int d = x[0] - x[1];
		for(int i = 1; i<x.length - 1; i++){
			
			if(x[i] - x[i+1] != d){
				return "Impossible";
			}
		}
		return "Possible";
		
	}
	/**
	public static void main(String[] args) {
		int x[] = {1,2,4};

		prl(able(x));
		// whatTime(3661);
	}

	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}
	*/

}
