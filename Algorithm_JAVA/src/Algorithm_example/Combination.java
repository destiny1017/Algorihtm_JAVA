package Algorithm_example;

import java.util.Arrays;

public class Combination {
	
	// 선택하고자 하는 대상 집합.
	static int[] target;
	// 대상 숫자를 담아둘 배열.
	static int[] result;
	// 방문 노드 확인 배열
	static boolean[] visited;
	
	static int num;
	

	public static void main(String[] args) {
		target = new int[] {1,2,3};
		
		num = 2;
		result = new int[num];
		visited = new boolean[target.length];
		
//		combination(0, 0);
		combination(0, target.length, num);
	}

	// 조합 메서드(cnt는 선택 횟수, idx는 다음 대상을 선택할때 집합에서 탐색을 시작할 인덱스).
	private static void combination(int cnt, int idx) {
		// 2개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
		if (cnt == num) {
			System.out.println("result : " + Arrays.toString(result));
			return;
		}
		// 대상 집합을 주어진 인덱스부터 순회하며 숫자를 하나 선택한다.
		for (int i = idx; i < target.length; i++) {
			// 숫자를 담는다.
			result[cnt] = target[i];
//			System.out.printf("cnt : %d, i: %d, " + Arrays.toString(result) + "\n", cnt, i);
			// 자신을 재귀 호출한다(자신 이전의 수를 중복 선택하지 않도록 인덱스를 +1하여 재귀를 호출한다).
			combination(cnt + 1, i + 1);
		}
	}
	
	// 백트래킹 방식
	static void combination(int start, int n, int r) {
	    if(r == 0) {
	        System.out.println(Arrays.toString(target));
	        System.out.println(Arrays.toString(visited));
	        System.out.println(n);
	        return;
	    } 

	    for(int i=start; i<n; i++) {
	        visited[i] = true;
	        combination(i + 1, n, r - 1);
	        visited[i] = false;
	    }
	}
	   
}
