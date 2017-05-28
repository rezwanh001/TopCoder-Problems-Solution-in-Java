import java.security.PrivateKey;

public class Initials {
	//static String string = new String();
	public String getInitials(String name) {
		String string = new String();
		for (int i = 0; i < name.length() - 1; i++) {
			//char m = name.charAt(0);
			//string += "" + m;
			if (i == 0){
				char m = name.charAt(i);
				string += "" + m;
			}
			//prl(string);
			if(name.charAt(i) == ' '){
				//string = string  + name.charAt(i+1);
				 //prl(name.charAt(i+1));
				
				char ch = name.charAt(i+1);
				string += "" + ch;
			}
		}
		return string;
	}
	/*
	public static void main(String[] args) {
		prl(getInitials("a aa aaa aa a bbb bb b bb bbb"));
	}
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}
	*/
	
	

}
