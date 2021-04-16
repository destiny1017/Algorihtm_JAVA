public class Test27 {
	
	public static long solution(long n) {
		String[] toString = (n+"").split("");
		String arr = "";
		for (int i = 0; i < toString.length; i++) {
			int num = 0;
			int topIdx = 0;
			int top = 0;
			for (int j = i; j < toString.length; j++) {
				num = Integer.parseInt(toString[j]);
				if(num > top) {
					topIdx = j;
					top = num;
				}
			}
			arr += top+"";
			toString[topIdx] = toString[i];
		}
		return Long.parseLong(arr);
	}

	public static void main(String[] args) {
		System.out.println(solution(394520372));
	}

}
