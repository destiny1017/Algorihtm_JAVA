package BaekJoon;

import java.util.Scanner;

public class B_Test167 {
	
//	# 경기 결과
//	
//	문제
//	A와 B가 게임을 한다. 게임은 N번의 라운드로 이루어져 있다. 
//	각 라운드에서는, 더 많은 점수를 얻은 사람이 그 라운드의 승자가 된다. 
//	즉, A의 점수가 B의 점수보다 크면 i번째 라운드는 A의 승리이며, B의 점수가 A의 점수보다 크면 i번째 라운드는 B의 승리이다. 
//	무승부인 경우에는 아무도 승리하지 않는다.
//
//	N번의 라운드에서의 A와 B의 점수가 주어졌을 때, A가 이긴 횟수와, B가 이긴 횟수를 출력하는 프로그램을 만들어라.
//
//	입력
//	첫째 줄에는 정수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
//
//	둘째 줄부터는 정수 Ai, Bi (0 ≤ Ai, Bi ≤ 100)가 공백을 사이에 두고 차례대로 주어진다.
//
//	출력
//	첫째 줄에 A가 이긴 횟수와 B가 이긴 횟수를 차례대로 출력하라.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int aw = 0, bw = 0;
		for (int i = 0; i < len; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a > b) {
				aw++;
			} else if(a < b){
				bw++;
			}
		}
		System.out.println(aw + " " + bw);
	}

}
