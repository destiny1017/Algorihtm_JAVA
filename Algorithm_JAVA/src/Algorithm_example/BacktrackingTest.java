package Algorithm_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BacktrackingTest {
	
	public static void main(String[] args) {
		int[] n = new int[] {1,2,3,4};
		int m = 2;
		boolean[] visit = new boolean[n.length];
		int[] tmpArr = new int[m];
		List<int[]> result = new ArrayList<>();

		permutations(0, n, m, visit, tmpArr, result);
		printResult(result);
		dataInit(n, m, visit, tmpArr, result);

		combinations(0, 0, n, m, visit, tmpArr, result);
		printResult(result);
		dataInit(n, m, visit, tmpArr, result);

		product(0, n, m, visit, tmpArr, result);
		printResult(result);
		dataInit(n, m, visit, tmpArr, result);

		combinationsWithReplacement(0, 0, n, m, visit, tmpArr, result);
		printResult(result);
		dataInit(n, m, visit, tmpArr, result);

	}

	static void printResult(List<int[]> result) {
		for (int[] arr : result) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("result size : " + result.size());
	}

	static void dataInit(int[] n, int m, boolean[] visit, int[] tmpArr, List<int[]> result) {
		n = new int[] {1,2,3,4};
		m = 2;
		visit = new boolean[n.length];
		tmpArr = new int[m];
		result.clear();
	}
	
	// 순열
	static void permutations(int depth, int[] n, int m, boolean[] visit, int[] tmpArr, List<int[]> result) {
		if(depth == m) {
			result.add(tmpArr.clone());
			return;
		}
		
		for (int i = 0; i < n.length; i++) {
			if(visit[i] == false) {
				visit[i] = true;
				tmpArr[depth] = n[i];
				permutations(depth+1, n, m, visit, tmpArr, result);
				visit[i] = false;
			}
		}
	}
	
	// 조합
	static void combinations(int depth, int start, int[] n, int m, boolean[] visit, int[] tmpArr, List<int[]> result) {
		if(depth == m) {
			result.add(tmpArr.clone());
			return;
		}
		
		for (int i = start; i < n.length; i++) {
			tmpArr[depth] = n[i];
			combinations(depth+1, i+1, n, m, visit, tmpArr, result);
		}
	}
	
	// 중복 순열
	static void product(int depth, int[] n, int m, boolean[] visit, int[] tmpArr, List<int[]> result) {
		if(depth == m) {
			result.add(tmpArr.clone());
			return;
		}
		for (int i = 0; i < n.length; i++) {
			tmpArr[depth] = n[i];
			product(depth+1, n, m, visit, tmpArr, result);
		}
	}
	
	// 중복 조합
	static void combinationsWithReplacement(int depth, int start, int[] n, int m, boolean[] visit, int[] tmpArr, List<int[]> result) {
		if(depth == m) {
			result.add(tmpArr.clone());
			return;
		}
		
		for (int i = start; i < n.length; i++) {
			tmpArr[depth] = n[i];
			combinationsWithReplacement(depth+1, i, n, m, visit, tmpArr, result);
		}
	}

}
