package BaekJoon;

import java.util.Scanner;

public class B_Test138 {
	
//	# 생일
//	
//	문제
//	어떤 반에 있는 학생들의 생일이 주어졌을 때, 가장 나이가 적은 사람과 가장 많은 사람을 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 반에 있는 학생의 수 n이 주어진다. (1 ≤ n ≤ 100)
//
//	다음 n개 줄에는 각 학생의 이름과 생일이 "이름 dd mm yyyy"와 같은 형식으로 주어진다. 
//	이름은 그 학생의 이름이며, 최대 15글자로 이루어져 있다. dd mm yyyy는 생일 일, 월, 연도이다. 
//	(1990 ≤ yyyy ≤ 2010, 1 ≤ mm ≤ 12, 1 ≤ dd ≤ 31) 주어지는 생일은 올바른 날짜이며, 연, 월 일은 0으로 시작하지 않는다.
//
//	이름이 같거나, 생일이 같은 사람은 없다.
//
//	출력
//	첫째 줄에 가장 나이가 적은 사람의 이름, 둘째 줄에 가장 나이가 많은 사람 이름을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String name[] = new String[len];
		String bd[] = new String[len];
		for (int i = 0; i < len; i++) {
			name[i] = sc.next();
			String date = "";
			for (int j = 0; j < 3; j++) {
				date = String.format("%02d", sc.nextInt()) + date;
			}
			bd[i] = date;
		}
		int min = 99999999;
		int max = 0;
		int maxIdx = 0;
		int minIdx = 0;
		for (int i = 0; i < bd.length; i++) {
			if(Integer.parseInt(bd[i]) < min) {
				min = Integer.parseInt(bd[i]);
				minIdx = i;
			}
			if(Integer.parseInt(bd[i]) > max) {
				max = Integer.parseInt(bd[i]);
				maxIdx = i;
			}
		}
		System.out.println(name[maxIdx]);
		System.out.println(name[minIdx]);
	}

}
