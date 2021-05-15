package BaekJoon;

import java.util.Scanner;

public class B_Test17 {
	
//	# 별 찍기 - 8
//	
//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//	
//	*        *
//	**      **
//	***    ***
//	****  ****
//	**********
//	****  ****
//	***    ***
//	**      **
//	*        *
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//	출력
//	첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag1 = 1, i = 0, num = sc.nextInt();
		while(true) {
			if(i == -1) break;
			int j = 0, flag2 = 1;
			String line = "";
			while(true) {
				if(j == -1) break;
				line += j <= i ? "*" : " ";
				if(line.length() == num) continue;
				if(j == num-1) flag2 = -1;
				j += flag2;
			}
			System.out.println(line);
			if(i == num-1) flag1 = -1;
			i += flag1;
		}
	}

}
