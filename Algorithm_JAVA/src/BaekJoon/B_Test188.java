package BaekJoon;

import java.util.Scanner;

public class B_Test188 {
	
//	# 수학적 호기심
//	
//	문제
//	두 정수 n과 m이 주어졌을 때, 0 < a < b < n인 정수 쌍 (a, b) 중에서 (a2+b2+m)/(ab)가 정수인 쌍의 개수를 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, n과 m이 주어진다. 두 수는 0보다 크고, 100보다 작거나 같다.
//
//	출력
//	각 테스트 케이스마다 문제의 조건을 만족하는 (a, b)쌍의 개수를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for (int k = 0; k < len; k++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int cnt = 0;
			for (int i = 1; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					double val = (Math.pow(i,2)+Math.pow(j,2)+m)%(i*j);
					if(val == 0) cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
