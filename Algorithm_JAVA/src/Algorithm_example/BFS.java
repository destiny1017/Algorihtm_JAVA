package Algorithm_example;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
//	# BFS(Breadth First Search)
//	
//	"너비우선탐색이란 루트 노드에서 시작해서 인접한 노드 를 먼저 탐색하는 방법이다. "
//
//	그래프 탐색이란 하나의 정점으로부터 시작하여 차례대로 모든 정점들을 한 번씩 방문하는 것이다. 
//	예를 들어 특정도시에서 다른 도시로 갈 수 있는지, 전자회로에서 특정 단자와 단자가 서로 연결되어 있는지를 탐색하는 알고리즘이다.
//	
//	### 구현예제
	
	// 그래프를 2차원 배열로 표시. 노드 번호와의 매칭을 위해 0번인덱스는 비워둠
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
	
	// 방문한 노드정보를 담을 배열 선언
	static boolean[] visited = new boolean[9];
	
	// bfs에 이용될 큐 선언
	static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) {
		bfs(1);
	}
	
	static void bfs(int start) {
		// 시작노드 큐에 삽입
		queue.offer(start);
		
		// 시작노드 방문처리
		visited[start] = true;
		
		// 큐가 빌 때까지 반복 탐색
		while(!queue.isEmpty()) {
			// 큐의 첫번째 노드번호를 가져옴
			int nodeIndex = queue.poll();
			
			// 현재 탐색중인 노드번호 출력
			System.out.print(nodeIndex + " -> ");
			
			// 현재 탐색중인 노드와 연결된 노드 수만큼 반복
			for (int temp : graph[nodeIndex]) {
				
				// 연결되 노드가 방문처리 되었는지 확인
				if(!visited[temp]) {
					
					// 방문 안 되었으면 방문처리 후 큐에 추가
					visited[temp] = true;
					queue.offer(temp);
				}
			}
		}
	}

}
