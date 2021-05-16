package BaekJoon;

import java.util.Scanner;

public class B_Test02 {
	
//	# 1로 만들기
//
//	0.15 초 (하단 참고)	128 MB	147741	46376	29414	31.816%
//	문제
//	정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
//	
//	X가 3으로 나누어 떨어지면, 3으로 나눈다.
//	X가 2로 나누어 떨어지면, 2로 나눈다.
//	1을 뺀다.
//	정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
//	
//	입력
//	첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
//	
//	출력
//	첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		while(n != 1) {
			System.out.println(n);
			if(n % 3 == 0) {
				n /= 3;
			} else if((n-1) % 3 == 0 && (n/2) % 2 != 0) {
				n -= 1;
			} else if(n % 2 == 0) {
				n /= 2;
			} else {
				n -= 1;
			}
			cnt++;
		}
		System.out.println(n);
		System.out.println("result : " + cnt);
	}

}
