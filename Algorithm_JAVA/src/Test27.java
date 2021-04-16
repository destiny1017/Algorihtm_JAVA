public class Test27 {
	
	public static long solution(long n) {
		long answer = 0;
		String toString = n+"";
		int[] arr = new int[toString.length()];
		for (int i = 0; i < toString.length(); i++) {
			int topIdx = 0;
			int top = 0;
//			int num = Integer.parseInt(toString.substring(i, i+1));
			for (int j = i; j < arr.length; j++) {
				if(arr[j] > top) topIdx = j; 
			}
			
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(12543));
	}

}
