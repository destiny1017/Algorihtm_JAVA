package BaekJoon;

import java.util.Scanner;

public class B_Test72 {
	
//	# 별 찍기 - 15
//	
//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//	
//	    *
//	   * *
//	  *   *
//	 *     *
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
			String line = "";
			for (int j = 0; j < num; j++) line += j == num-i-1 ? "*" : " ";
			for (int j = 1; j <= i; j++)  line += j == i ? "*" : " ";
			System.out.println(line);
		}
	}

}
