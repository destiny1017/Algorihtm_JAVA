package BaekJoon;

import java.util.Scanner;

public class B_Test141 {
	
//	# 등장하지 않는 문자의 합
//	
//	문제
//	알파벳 대문자로 구성되어있는 문자열 S가 주어졌을 때, S에 등장하지 않는 알파벳 대문자의 아스키 코드 값의 합을 구하는 프로그램을 작성하시오.
//
//	문자열 S가 “ABCDEFGHIJKLMNOPQRSTUVW” 일 때, S에 등장하지 않는 알파벳 대문자는 X, Y, Z이다. 
//	X의 아스키 코드 값은 88, Y는 89, Z는 90이므로 이 아스키 코드 값의 합은 267이다.
//
//
//	입력
//	입력은 T개의 테스트 데이터로 구성된다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다.
//	각 테스트 데이터는 한 줄로 구성되어 있고, 문자열 S가 주어진다. S는 알파벳 대문자로만 구성되어 있고, 최대 1000글자이다.
//
//	출력
//	각 테스트 데이터에 대해, 입력으로 주어진 문자열 S에 등장하지 않는 알파벳 대문자의 아스키 코드 값의 합을 한 줄에 하나씩 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			char str[] = sc.next().toCharArray();
			int sum = 0;
			for (int j = 65; j <= 90; j++) {
				int flag = 0;
				for (int k = 0; k < str.length; k++) {
					if(str[k] == j) {
						flag = 1;
						break;
					}
				}
				if(flag == 0) sum += j;
			}
			System.out.println(sum);
		}
	}

}
