package BaekJoon;

import java.util.Scanner;

public class B_Test193 {
	
//	# 차량 번호판
//	
//	문제
//	상도시의 차량 번호판 형식이 주어졌을 때, 가능한 차량 번호판의 개수를 구해보자.
//
//	번호판에 사용할 수 있는 숫자는 0, 1, 2, ..., 8, 9이다.
//	사용할 수 있는 문자는 a, b, c, d, ..., y, z이다.
//	차량 번호판의 형식은 최대 4글자이고, c와 d로 이루어진 문자열로 나타낼 수 있다.
//	c는 문자가 위치하는 자리, d는 숫자가 위치하는 자리이다.
//	같은 문자 또는 숫자가 연속해서 2번 나타나면 안 된다.
//	예를 들어, 형식이 "cd"이면, a1, d4, h5, k4 등이 가능하다. 
//	형식이 "dd"인 경우에 01, 10, 34, 69는 가능하지만, 00, 11, 55, 66은 같은 숫자가 2번 연속해서 불가능하다.
//
//	입력
//	첫째 줄에 차량 번호판의 형식이 주어진다. 형식은 길이가 4보다 작거나 같으며, c와 d로만 이루어져 있다.
//
//	출력
//	첫째 줄에 가능한 차량 번호판의 개수를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char rule[] = sc.next().toCharArray();
		char preChar = 'x';
		int cnt = 1;
		for (int i = 0; i < rule.length; i++) {
			int num = rule[i] == 'c' ? 26 : 10;
			if(rule[i] == preChar) {
				cnt = cnt * num - cnt;
			} else {
				cnt = cnt * num;
			}
			preChar = rule[i];
		}
		System.out.println(cnt);
	}

}
