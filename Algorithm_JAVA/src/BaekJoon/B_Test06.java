package BaekJoon;

import java.util.Scanner;

public class B_Test06 {
	
//	# 오르막 수
//	
//	문제
//	오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이때, 인접한 수가 같아도 오름차순으로 친다.
//
//	예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.
//
//	수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.
//
//	입력
//	첫째 줄에 N (1 ≤ N ≤ 1,000)이 주어진다.
//
//	출력
//	첫째 줄에 길이가 N인 오르막 수의 개수를 10,007로 나눈 나머지를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String max = "";
		long maxNum = 0;
		for (int i = 0; i < len; i++) {
			max += "9";
		}
		maxNum = Long.parseLong(max);
		int cnt = 0;
		for (int i = 0; i <= maxNum; i++) {
			char[] arr = (i+"").toCharArray();
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if(arr.length == 1) {
//					System.out.print("a" + i);
					flag = true;
				}
				else if(j > 0) {
					if(arr[j] >= arr[j-1]) {
//						System.out.print("b" + i);
						flag = true;
					} else {
//						System.out.print("c" + i);
						flag = false;
						break;
					}
				}
			}
			if(flag) cnt++;
//			System.out.println(", cnt:" + cnt);
		}
		System.out.println(cnt);
	}

}
