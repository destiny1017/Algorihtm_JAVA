package Programmers;
public class Test18 {
	
//	# 소수 찾기
//	
//	문제 설명
//	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//
//	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//	(1은 소수가 아닙니다.)
//
//	제한 조건
//	n은 2이상 1000000이하의 자연수입니다.
	
	  public static int solution(int n) {
	      
	      int count = 0, answer = 1;
			for(int i=3; i<=n; i+=2) {
				for(int j=1; j<=i; j++) {
					if(i%j==0) count++;
					if(count == 3) break;
				}
				if(count==2) answer++;	
				count = 0;
			}
	      return answer;
			
	  }

	public static void main(String[] args) {
		System.out.println(solution(10));
	}

}
