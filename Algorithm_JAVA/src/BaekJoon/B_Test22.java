package BaekJoon;

import java.util.Scanner;

public class B_Test22 {
	
//	# 별 찍기 - 12
//	
//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//	출력
//	첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 1, i = 1, num = sc.nextInt();
		do {
			String line = "";
			for (int j = num; j >= 1; j--) {
				line += j > i ? " " : "*";
			}
			System.out.println(line);
			i += flag;
			if(i == num) flag *= -1;
		} while(i >= 1);
	}

}
