package BaekJoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_Test205 {
	
//	# 미로 탐색
//	
//	문제
//	N×M크기의 배열로 표현되는 미로가 있다.
//
//	1	0	1	1	1	1
//	1	0	1	0	1	0
//	1	0	1	0	1	1
//	1	1	1	0	1	1
//	미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다. 
//	이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오. 
//	한 칸에서 다른 칸으로 이동할 때, 서로 인접한 칸으로만 이동할 수 있다.
//
//	위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.
//
//	입력
//	첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다. 다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.
//
//	출력
//	첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.
	
	static int n;
	static int m;
	static int arr[][];
	static int visit[][];
	static ArrayList<int[]> mainQ = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 인덱스와 순서를 맞추기 위해 배열을 한칸씩 크게 선언
		n = sc.nextInt()+1;
		m = sc.nextInt()+1;
		arr = new int[n][m];
		visit = new int[n][m];
		for (int i = 1; i < n; i++) {
			char str[] = sc.next().toCharArray();
			for (int j = 1; j < m; j++) {
				arr[i][j] = str[j-1]-48;
			}
		}
		// 배열선언을 완료했으니 원래 n,m값으로 돌리기
		n--;
		m--;
		
		mainQ.add(new int[] {1,1});
		visit[1][1] = 1;
		
		int cnt = 0;
		
		while(!mainQ.isEmpty()) {
			ArrayList<int[]> subQ = new ArrayList<>();
			subQ.addAll(mainQ);
			mainQ.clear();
			cnt++;
			for (int[] node : subQ) {
				int y = node[0];
				int x = node[1];
				if(y == n && x == m) break;
				y = node[0]-1;
				check(y,x);
				
				y = node[0]+1;
				check(y,x);
				
				y = node[0];
				x = node[1]-1;
				check(y,x);
				
				x = node[1]+1;
				check(y,x);
			}
		}
		System.out.println(cnt);
		
	}
	
	static boolean check(int y, int x) {
		if(y < 1 || x < 1 || y > n || x > m)
			return false;
		else if(arr[y][x] == 0)
			return false;
		else if(visit[y][x] == 1) {
			return false;
		}
		arr[y][x] = 1;
		visit[y][x] = 1;
		mainQ.add(new int[] {y,x});
		return true;
	}

}
