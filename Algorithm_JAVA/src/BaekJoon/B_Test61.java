package BaekJoon;

import java.util.Scanner;

public class B_Test61 {
	
//	# 별찍기 - 4
//	
//	문제
//	첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
//
//	하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//	출력
//	첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(j >= i ? "*" : " ");
			}
			System.out.println();
		}
	}

}
