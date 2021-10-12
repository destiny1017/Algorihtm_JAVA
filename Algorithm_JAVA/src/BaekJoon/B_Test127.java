package BaekJoon;

import java.util.Scanner;

public class B_Test127 {
	
//	# 사분면
//	
//	문제
//	2차원 좌표 상의 여러 점의 좌표 (x,y)가 주어졌을 때, 각 사분면과 축에 점이 몇 개 있는지 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 점의 개수 n (1 ≤ n ≤ 1000)이 주어진다. 다음 n개 줄에는 점의 좌표 (xi, yi)가 주어진다. (-106 ≤ xi, yi ≤ 106)
//
//	출력
//	각 사분면과 축에 점이 몇 개 있는지를 예제 출력과 같은 형식으로 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0; 
		for (int i = 0; i < len; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x > 0 && y > 0) {
				q1++;
			} else if(x < 0 && y > 0) {
				q2++;
			} else if(x < 0 && y < 0) {
				q3++;
			} else if(x > 0 && y < 0) {
				q4++;
			} else {
				axis++;
			}
		}
		System.out.println("Q1: " + q1);
		System.out.println("Q2: " + q2);
		System.out.println("Q3: " + q3);
		System.out.println("Q4: " + q4);
		System.out.println("AXIS: " + axis);
	}

}
