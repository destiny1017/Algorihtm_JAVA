package BaekJoon;

import java.util.Scanner;

public class B_Test180 {
	
//	# 별 찍기 - 17
//	
//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//	
//	N = 4
//	
//	    *
//	   * *
//	  *   *
//	 *******
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//	출력
//	첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(j == (n-i)-1 || i == n-1 ? '*' : ' ');
			}
			for (int j = 0; j < i; j++) {
				System.out.print(j == (i-1) || i == n-1 ? '*' : ' ');
			}
			System.out.println();
		}
	}

}
