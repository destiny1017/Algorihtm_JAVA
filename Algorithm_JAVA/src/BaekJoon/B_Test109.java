package BaekJoon;

import java.util.Scanner;

public class B_Test109 {
	
//	# 직사각형 네개의 합집합의 면적 구하기
//	
//	문제
//	평면에 네 개의 직사각형이 놓여 있는데 그 밑변은 모두 가로축에 평행하다. 
//	이 네 개의 직사각형들은 서로 떨어져 있을 수도 있고, 겹쳐 있을 수도 있고, 하나가 다른 하나를 포함할 수도 있으며, 변이나 꼭짓점이 겹칠 수도 있다.
//
//	이 직사각형들이 차지하는 면적을 구하는 프로그램을 작성하시오.
//
//
//	입력
//	입력은 네 줄이며, 각 줄은 직사각형의 위치를 나타내는 네 개의 정수로 주어진다. 
//	첫 번째와 두 번째의 정수는 사각형의 왼쪽 아래 꼭짓점의 x좌표, y좌표이고 세 번째와 네 번째의 정수는 사각형의 오른쪽 위 꼭짓점의 x좌표, y좌표이다. 
//	모든 x좌표와 y좌표는 1이상이고 100이하인 정수이다.
//
//	출력
//	첫 줄에 네개의 직사각형이 차지하는 면적을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int squares[][] = new int[100][100];
		for (int k = 0; k < 4; k++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for (int i = y1-1; i < (y1-1) + (y2 - y1); i++) {
				for (int j = x1-1; j < (x1 - 1) + (x2-x1); j++) {
					squares[i][j] = 1;
				}
			}
		}
		
		int sum = 0;
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares.length; j++) {
				if(squares[i][j] == 1) sum++;
			}
		}
		System.out.println(sum);
	}

}
