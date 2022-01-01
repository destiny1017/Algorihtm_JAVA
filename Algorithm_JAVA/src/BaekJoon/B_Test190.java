package BaekJoon;

import java.util.Scanner;

public class B_Test190 {
	
//	# 유니크
//	
//	문제
//	상근이와 친구들은 MT에 가서 아래 설명과 같이 재미있는 게임을 할 것이다.
//
//	각 플레이어는 1이상 100 이하의 정수를 카드에 적어 제출한다. 
//	각 플레이어는 자신과 같은 수를 쓴 사람이 없다면, 자신이 쓴 수와 같은 점수를 얻는다. 
//	만약, 같은 수를 쓴 다른 사람이 있는 경우에는 점수를 얻을 수 없다.
//
//	상근이와 친구들은 이 게임을 3번 했다. 각 플레이어가 각각 쓴 수가 주어졌을 때, 3번 게임에서 얻은 총 점수를 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 참가자의 수 N이 주어진다. (2 ≤ N ≤ 200) 
//	둘째 줄부터 N개 줄에는 각 플레이어가 1번째, 2번째, 3번째 게임에서 쓴 수가 공백으로 구분되어 주어진다.
//
//	출력
//	각 플레이어가 3번의 게임에서 얻은 총 점수를 입력으로 주어진 순서대로 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[][] = new int[len][3];
		for (int i = 0; i < len; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < len-1; j++) {
				int num = arr[j][i];
				int same = 0;
				for (int k = j+1; k < len; k++) {
					if(num == arr[k][i]) {
						arr[k][i] = 0;
						same++;
					}
				}
				if(same > 0) arr[j][i] = 0;
			}
		}
		
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += arr[i][j];
			}
			System.out.println(sum);
		}
	}

}
