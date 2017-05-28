import java.util.FormatFlagsConversionMismatchException;

public class SymmetryDetection {

	public static String detect(String[] board) {
		int n = board.length;
		int m = board[1].length();
		
		char[][] horBoard = new char[n+51][m+51];
		char[][] verBoard = new char[n+51][m+51];
		
		char[][] canvasArray = new char[n][];
		
		
		for(int i =0; i < n; i++){
			canvasArray[i] = board[i].toCharArray();
		}
		
		 for (int i = 0; i < n /2; i++)
	    { 
	       for(int j = 0; j < m; j++)
	       {  
	      	 
					horBoard[n - (i+1)][j] = canvasArray[i][j];           
	      	horBoard[i][j] = canvasArray[n - (i+1)][j];
	       }
	    } 
		 
		 for (int i = 0; i < n; i++) {
       for (int j = 0; j < m; j++) {
           verBoard[i][m - j - 1] = canvasArray[i][j];
       }
		 }
		 
		Boolean hor = false, ver = false;
		int cnt = 0;
		for(int  i = 0; i  < n; i++){
			for(int j = 0 ; j  < m; j++){
				if(canvasArray[i][j] == verBoard[i][j]){
					ver = true;
				}
				else {
					ver = false;
					cnt = 1;
					break;
				}
			}
			if(cnt == 1){
				break;
			}
		}
		
		
		int cnt1 = 0;
		for(int  i = 0; i  < n; i++){
			for(int j = 0 ; j  < m; j++){
				if(canvasArray[i][j] == horBoard[i][j]){
					hor = true;
				}
				else {
					hor = false;
					cnt1 = 1;
					break;
				}
			}
			if(cnt1 == 1){
				break;
			}
		}
		String ret = "";
		if(hor == true &&  ver == true){
			ret = "Both";
		}
		else if (hor == true && ver == false) {
			ret = "Horizontally symmetric";
		}
		else if (hor == false && ver == true) {
			ret = "Vertically symmetric";
		}
		else {
			ret = "Neither";
		}
		
		return ret;
		
		
		
//		return n;
//		for(int i = 0; i <board.length; i++ ){
//			
//		}
//		String[] horBoard = new String[1000];
//		String[] verBoard = new String[1000];
//		return null;
	}
	
//	public static void main(String[] args) {
//		String[] letters = {" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
//		System.out.println(detect(letters));
//	}
}



