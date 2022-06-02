package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_Test237 {
	
	// # DFS와 BFS
	// 1. 노드와 간선 크기만큼 노드 및 방문 배열 초기화
	// 2. 노드 연결상태 배열에 값 할당
	// 3. dfs수행
	// 4. visited 초기화
	// 5. bfs수행
	
	static int n;
	static int m;
	static int start;
	
	static int node[][];
	static boolean visited[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		node = new int[n+1][n+1];
		visited = new boolean[n+1];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			node[x][y] = 1;
			node[y][x] = 1;
		}
		
		dfs(start);
		System.out.println();
		visited = new boolean[n+1];
		bfs();
	}
	
	static void dfs(int i) {
		visited[i] = true;
		System.out.print(i + " ");
		for (int j = 1; j <= n; j++) {
			if(node[i][j] == 1 && visited[j] == false) {
				dfs(j);
			}
		}
	}
	
	static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visited[start] = true;
		System.out.print(start + " ");
		
		while(!queue.isEmpty()) {
			int tmp = queue.poll();
			for (int i = 1; i <= n; i++) {
				if(node[tmp][i] == 1 && visited[i] == false) {
					queue.offer(i);
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}

}
