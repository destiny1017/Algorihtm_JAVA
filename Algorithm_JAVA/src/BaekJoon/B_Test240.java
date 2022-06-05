package BaekJoon;

import java.util.Scanner;

public class B_Test240 {
	
//	# N과 M(1)
	
	static int n; // 대상 요소의 개수
	static int m; // 경우의 수의 개수
	
	static int[] arr;
	static boolean visit[];
	
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		visit = new boolean[n];
		
		sb = new StringBuilder();
		
		recursive(0);
		System.out.print(sb);
	}
	
	static void recursive(int depth) {
		if(depth == m) {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if(visit[i] == false) {
				visit[i] = true;
				arr[depth] = i+1;
				recursive(depth+1);
				visit[i] = false;
			}
		}
	}

}
