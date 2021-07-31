package BaekJoon;

import java.util.Scanner;

public class B_Test75 {
	
//	# 별 찍기 - 16
//	
//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//	
//	    *
//     * *
//	  * * *
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
			int flag = 1;
			for (int j = 0; j < num; j++) {
				if(j == num-i-flag) {
					line += "*";
					flag -= 2;
				} else {
					line += " ";
				}
			}
			flag = 1;
			for (int j = 1; j <= i; j++)  {
				if(i%2 != 0) {
					line += j%2 != 0 ? "*" : " ";
				} else {
					line += j%2 == 0 ? "*" : " ";
				}
			}
			System.out.println(line);
		}
	}

}
