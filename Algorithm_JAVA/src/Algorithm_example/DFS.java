package Algorithm_example;

public class DFS {
	
//	# DFS(Depth First Search)
//	
//	트리나 그래프에서 한 루트로 탐색하다가 특정 상황에서 최대한 깊숙히 들어가서 확인한 뒤 다시 돌아가 다른 루트로 탐색하는 방식이다. 
//	대표적으로 백트래킹에 사용한다. 일반적으로 재귀호출을 사용하여 구현하지만, 단순한 스택 배열로 구현하기도 한다. 
//	구조상 스택 오버플로우를 유의해야 한다.
//
//	갈림길이 나타날 때마다 '다른 길이 있다'는 정보만 기록하면서 자신이 지나간 길을 지워나간다. 
//	그러다 막다른 곳에 도달하면 직전 갈림길까지 돌아가면서 '이 길은 아님'이라는 표식을 남긴다. 
//	그렇게 갈림길을 순차적으로 탐색해 나가다 목적지를 발견하면 그대로 해답을 내고 종료.
	
	
//	### 구현예제
	
	// 방문 처리 배열
	static boolean[] visited = new boolean[9];
	
	// 그래프의 연결상태를 2차원 배열로 선언
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

	
	static void dfs(int nodeIndex) {
		// 방문 처리
		visited[nodeIndex] = true;
		
		// 방문 노드 출력
		System.out.print(nodeIndex + " ->");
		
		// 방문한 노드에 인접한 노드 찾기
		for (int node : graph[nodeIndex]) {
			// 인접한 노드가 방문한 적이 없다면 dfs수행
			if(!visited[node]) {
				dfs(node);
			}
		}
	}

	public static void main(String[] args) {
		dfs(1);
	}

}
