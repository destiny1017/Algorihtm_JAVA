package BaekJoon;

import java.util.Scanner;

public class B_Test70 {
	
//	# 별 찍기 7
//	
//	문제
//	첫째 줄에는 별 2×N-1개, 둘째 줄에는 별 2×N-3개, ..., N번째 줄에는 별 1개를 찍는 문제
//	
//	*********
//	 *******
//	  *****
//	   ***
//	    *
//
//	별은 가운데를 기준으로 대칭이어야 한다.
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
			int flag = 1;
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (num-i)*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
