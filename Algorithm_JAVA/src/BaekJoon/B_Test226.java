package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Test226 {
	
//	# 소수 구하기
//	
//	문제
//	M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. 
//	(1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
//
//	출력
//	한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		boolean prime[] = new boolean[n+1];
		for (int i = 2; i <= n; i++) {
			if(!prime[i]) {
				for (int j = i+i; j < prime.length; j+=i) {
					prime[j] = true;
				}
			}
			if(!prime[i]) {
				if(i >= m) sb.append(i + "\n");
			}
		}
		System.out.println(sb.toString());
		
	}

}
