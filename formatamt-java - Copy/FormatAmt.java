import java.text.DecimalFormat;

public class FormatAmt {

	public static String amount(int dollars, int cents) {
		double money = dollars + ((double)cents/100.0);
		DecimalFormat decimalFormat = new DecimalFormat("$#,###,###,##0.00");
		
		return decimalFormat.format(money);
	}
	/*
	public static void main(String[] args) {
		prl(amount(123456,0));
	}
	
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}
	*/
	

}
