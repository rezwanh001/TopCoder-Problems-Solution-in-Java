import java.util.Scanner;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class InterestingDigits {

	public static int[] digits(int base) {
		ArrayList<Integer> res = new ArrayList<>();
		
		int k = 0;
		for(int  i = 2; i <= base; i++){
			if (base % i == 1){
				//arr[k++] = i;
				res.add(i);
			}
		}
		int []arr = new int[res.size()];
		for(int i = 0; i < arr.length; i++){
			arr[i] = res.get(i);
		}
//		for(int i = 0; i < k; i++){
//			System.out.println(arr[i]);
//		}
		return arr;
	}

	
//	public static void main(String[] args) {
//		int []arr = digits(10);
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);
//		}
//	}

}
