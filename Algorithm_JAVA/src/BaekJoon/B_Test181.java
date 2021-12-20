package BaekJoon;

import java.util.Scanner;

public class B_Test181 {
	
//	# 별 찍기 - 20
//	
//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//	
//	N = 3
//	
//	* * *
//	 * * *
//	* * *
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//	출력
//	첫째 줄부터 차례대로 별을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String line = "";
			int j = 0;
			if(i%2 == 0) {
				line = "*";
				j++;
			}
			for (j += 0; j < n; j++) line += " *"; 
			System.out.println(line);
		}
	}

}
