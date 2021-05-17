package BaekJoon;

import java.util.Scanner;

public class B_Test18 {
	
//	# 별 찍기
//	
//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//	
//	*********
//	 *******
//	  *****
//	   ***
//	    *
//	   ***
//	  *****
//	 *******
//	*********
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//	출력
//	첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 1, i = 0, num = sc.nextInt();
		while(true) {
			if(i == -1) break;
			String line = "";
			for (int j = 0; j < num*2-i-1; j++) {
				line += j < i ? " " : "*";
			}
			System.out.println(line);
			if(i == num-1) flag = -1;
			i += flag;
		}
	}

}
