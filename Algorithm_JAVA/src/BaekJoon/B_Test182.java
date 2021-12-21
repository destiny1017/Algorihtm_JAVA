package BaekJoon;

import java.util.Scanner;

public class B_Test182 {
	
//	# 박스
//	
//	문제
//	m행 n열로 이루어진 그리드가 주어진다. 일부 칸에는 박스가 들어 있다. 
//	모든 박스가 더 이상 움직일 수 없을 때 까지 아래로 움직인다면, 박스는 쌓여진 상태가 된다.
//
//	그림 (a)의 그리드의 크기는 5행 4열이고, 7칸에는 박스가 들어있다. 모든 박스가 계속해서 아래로 움직이면, 그림 (b)와 같이 변하게 된다.
//
//
//	박스가 움직인 거리는 바닥에 쌓이기 전 까지 이동한 칸의 개수이다. 예를 들어, 맨 왼쪽 열에서 가장 위에 있는 박스가 움직인 거리는 2이다. 
//	모든 박스가 이동한 거리 (각 박스가 이동한 거리의 합) 을 구하는 프로그램을 작성하시오. 위의 예제에서 박스 7개가 움직인 거리는 8이다.
//
//	입력
//	첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에는 m과 n이 주어진다. (1 ≤ m, n ≤ 100) 
//	다음 m개 줄에는 그리드의 각 행의 정보를 나타내는 n개의 정수가 주어진다. 그리드 첫 행부터 마지막 행까지 순서대로 주어진다. 
//	박스가 들어있는 칸은 1로, 다른 칸은 0으로 주어진다. 각 정수 사이에는 공백이 하나 주어진다.
//
//	출력
//	각 테스트 케이스마다 입력으로 주어진 그리드에서 모든 박스가 이동한 거리를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			int cnt = 0;
			int arr[][] = new int[sc.nextInt()][sc.nextInt()];
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			
			for (int j = 0; j < arr[0].length; j++) {
				for (int k = arr.length-1; 1 <= k; k--) {
					for (int k2 = arr.length-1; 1 <= k2; k2--) {
						if(arr[k2][j] < arr[k2-1][j]) {
							arr[k2][j] = 1;
							arr[k2-1][j] = 0;
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}

}
