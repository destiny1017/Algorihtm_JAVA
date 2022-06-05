package BaekJoon;

import java.util.Scanner;

public class B_Test241 {
	
//	# N과 M(2) 조합
	
	static int n; // 대상 요소의 개수
	static int m; // 경우의 수의 개수
	
	static int[] arr;
	
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		
		sb = new StringBuilder();
		
		recursive(0, 0);
		System.out.print(sb);
	}
	
	static void recursive(int depth, int start) {
		if(depth == m) {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = start; i < n; i++) {
			arr[depth] = i+1;
			recursive(depth+1, i+1);
		}
	}

}
