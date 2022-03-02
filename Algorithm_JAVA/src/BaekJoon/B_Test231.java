package BaekJoon;

import java.util.Scanner;

public class B_Test231 {
	
//	# N-Queen
//	
//	문제
//	N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
//
//	N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 N이 주어진다. (1 ≤ N < 15)
//
//	출력
//	첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.
	
	static int n;
	static int[] board = new int[15];
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		count(0);
		System.out.println(cnt);
	}
	
	static void count(int row) {
		
		if(row == n) {
			cnt++;
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if(check(row, i)) {
				board[row] = i;
				count(row+1);
			}
		}
	}
	
	static boolean check(int row, int col) {
		for (int i = 0; i < row; i++) {
			if(board[i] == col || board[i]-(row-i) == col || board[i]+(row-i) == col) {
				return false;
			}
		}
		return true;
	}

}
