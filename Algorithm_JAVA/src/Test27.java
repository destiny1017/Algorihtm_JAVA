public class Test27 {
	
//	# 정수 내림차순으로 배치하기
//	
//	문제 설명
//	함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//	제한 조건
//	n은 1이상 8000000000 이하인 자연수입니다.
	
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
