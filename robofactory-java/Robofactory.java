public class Robofactory {

	public static  int reveal(int[] query, String[] answer) {
		int n = query.length;
		int evencnt = 0;
		if(n == 1){
			return 0;
		}
		for(int i = 0; i < n; i++){
			boolean correct = (query[i]%2 == 1 && answer[i].equals("Odd")) || (query[i]%2 == 1 && answer[i].equals("Odd"));
			
			if(!correct){
				return i;
			}
			if(query[i] % 2 == 0 && i != n - 1){
				evencnt += 1;
			}
		}
		if(evencnt == 0){
			return 0;
		}
		return -1;
	}
	/*
	public static void main(String[] args) {
		//prln("Hello World");
		int[] query = {1,1,1};
		String[] answer = {"Odd", "Odd", "Even"};
		prln(reveal(query, answer));


	}
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	*/
	
}
