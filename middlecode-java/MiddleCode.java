public class MiddleCode {

	public String encode(String s) {
		String tString = "";
		StringBuilder sbBuilder = new StringBuilder(s);
		
		while(sbBuilder.length() > 0){
			if(sbBuilder.length() %2 != 0){
				char c = sbBuilder.charAt(sbBuilder.length()/2);
				tString += c;
				sbBuilder.deleteCharAt(sbBuilder.length()/2);
			}
			else {
				char c1 = sbBuilder.charAt(sbBuilder.length()/2);
				char c2 = sbBuilder.charAt(sbBuilder.length()/2 - 1);
				
				if(c1 <= c2){
					sbBuilder.deleteCharAt(sbBuilder.length()/2);
					tString += c1;
				}
				else {
					tString += c2;
					sbBuilder.deleteCharAt(sbBuilder.length()/2 - 1);
				}
			}
		}
		return tString;
	}

}
