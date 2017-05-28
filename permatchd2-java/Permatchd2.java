public class Permatchd2 {

	public static int fix(String[] graph) {
		int[] arr = new int[100000];
		int cnt = 0;
		for (int i = 0; i < graph[0].length(); i++) {
			
			// for(int j = 0; j < graph[0].length(); j++){
			// if(graph[i][j] == "Y"){
			// cnt += 1;
			// }
			cnt = graph[i].replaceAll("[^Y]", "").length();
		}
		//int cnt1;
		return cnt;
	}

//	public static void main(String[] args) {
//		// prln("Hello World");
//		// int[] query = {1,1,1};
//		String[] answer = { "NYN", "YNN", "NNN" };
//		prln(fix(answer));
//
//	}
//
//	static void prln(Object anyObject) {
//		System.out.println(anyObject);
//	}

}
