package BaekJoon;

import java.util.Scanner;

public class B_Test54 {
	
//	# 2007년
//	
//	문제
//	오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다. 
//	참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
//
//	출력
//	첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		int day = sc.nextInt();
		String week[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int days = day;
		for (int i = 1; i < mon; i++) {
			switch(i) {
			case 2:
				days += 28;
				break;
			case 4: case 6: case 9: case 11:
				days += 30;
				break;
			default:
				days += 31;
			}
		}
		System.out.println(week[days % 7]);
	}

}
