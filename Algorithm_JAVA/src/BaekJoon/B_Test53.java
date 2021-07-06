package BaekJoon;

import java.util.Scanner;

public class B_Test53 {
	
//	# 팩토리얼
//	
//	문제
//	0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
//
//	출력
//	첫째 줄에 N!을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), fac = 1;
		for (int i = 1; i <= num; i++) fac *= i;
		System.out.println(fac);
	}

}
