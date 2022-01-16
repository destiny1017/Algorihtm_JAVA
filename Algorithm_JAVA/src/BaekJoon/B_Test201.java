package BaekJoon;

import java.util.Scanner;

public class B_Test201 {
	
//	# 더하기4
//	
//	문제
//	수 N개가 주어졌을 때, N개의 합을 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
//	각 테스트 케이스는 한 줄로 이루어져 있으며, N(1 ≤ N ≤ 100)개의 수가 공백으로 구분되어서 주어진다. 
//	입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다. 또, 0으로 시작하는 수는 주어지지 않는다.
//
//	출력
//	각 테스트 케이스마다 입력받은 수 N개의 합을 한 줄에 하나씩 입력받은 순서대로 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < len; i++) {
			String line[] = sc.nextLine().split(" ");
			int sum = 0;
			for (int j = 0; j < line.length; j++) {
				sum += Integer.parseInt(line[j]);
			}
			System.out.println(sum);
		}
	}

}
