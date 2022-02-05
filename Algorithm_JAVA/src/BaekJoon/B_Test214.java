package BaekJoon;

import java.util.*;

//	# 연결 요소의 개수
//	
//	문제
//	방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
//	
//	입력
//	첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2) 
//	둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v) 
//	같은 간선은 한 번만 주어진다.
//	
//	출력
//	첫째 줄에 연결 요소의 개수를 출력한다.

public class B_Test214 {
	
	static List<Integer>[] list;
	static boolean[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int len = sc.nextInt();
		list = new List[len+1];
		for (int i = 0; i <= len; i++) {
			list[i] = new ArrayList<>();
		}
		visit = new boolean[len+1];
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		
		for (int i = 1; i < visit.length; i++) {
			if(!visit[i]) {
				dfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	static void dfs(int i) {
		visit[i] = true;
		for (int node: list[i]) {
			if(!visit[node]) {
				dfs(node);
			}
		}
	}

}
