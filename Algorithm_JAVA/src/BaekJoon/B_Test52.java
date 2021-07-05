package BaekJoon;

import java.util.*;

public class B_Test52 {
	
//	# 소수 찾기
//	
//	문제
//	주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
//
//	출력
//	주어진 수들 중 소수의 개수를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt(), sum = 0;
		for (int i = 0; i < len; i++) {
			int num = sc.nextInt();
			int prime = num != 1 ? 1 : 0;
			for (int j = 2; j <= num/2; j++) {
				if(num % j == 0) {
					prime = 0;
					break;
				}
			}
			sum += prime;
		}
		System.out.println(sum);
	}

}
