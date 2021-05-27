package BaekJoon;

import java.util.Scanner;

public class B_Test24 {
	
//	# 별 찍기 - 13
//	
//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//	
//	*
//	**
//	***
//	**
//	*
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//	출력
//	첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 1, i = 1, num = sc.nextInt();
		while(i != 0) {
			String line = "";
			for (int j = 0; j <= num; j++) 
				if(j < i) line += "*";
			System.out.println(line);
			if(i == num) flag *= -1;
			i += flag;
		}
	}

}
