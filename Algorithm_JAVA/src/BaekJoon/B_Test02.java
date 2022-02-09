package BaekJoon;

import java.util.ArrayList;
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
		ArrayList<Integer> list = new ArrayList<>();
		int cnt = 0;
		boolean flag = true;
		list.add(sc.nextInt());
		while(true) {
			ArrayList<Integer> tmpList = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				int num = list.get(i);
				if(num == 1) {
					flag = false;
					break;
				}
				if(num % 3 == 0) {
					tmpList.add(num / 3);
				}
				if(num % 2 == 0) {
					tmpList.add(num / 2);
				}
				tmpList.add(num - 1);
			}
			
			if(flag) {
				list = tmpList;
				cnt++;
			} else break;
		}
		System.out.println(cnt);
	}

}
