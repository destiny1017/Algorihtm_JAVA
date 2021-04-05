
public class Test21 {
	
//	# 정수 제곱근 판별
//	
//	문제 설명
//	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//
//	제한 사항
//	n은 1이상, 50000000000000 이하인 양의 정수입니다.
	
	public static long solution(long n) {
		long answer = 4; //n == 1일 경우 for문을 타지 않음
		for (long i = 1; i < n; i++) {
			long square = i * i;
			if(square == n) {
				return (i+1) * (i+1); 
			} else if(square > n) {
				return -1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(new Long("1")));
	}

}
