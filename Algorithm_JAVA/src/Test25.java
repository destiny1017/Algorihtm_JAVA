
public class Test25 {
	
//	# 약수의 합
//	
//	문제 설명
//	정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
//
//	제한 사항
//	n은 0 이상 3000이하인 정수입니다.
	
    public static int solution(int n) {
    	
        int answer = 0; 
			
			for(int i=1; i<=n; i++) {
				if(n%i == 0) answer += i;
			}
			
	      return answer;  
  
	  }

	public static void main(String[] args) {
		System.out.println(solution(12));
		System.out.println(solution(28));
	}

}
