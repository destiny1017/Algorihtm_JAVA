package BaekJoon;

import java.util.Scanner;

public class B_Test204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < k; i++) {
			arr[sc.nextInt()-1][sc.nextInt()-1] = 1;
		}
		
		int total = 0;
		while(total > 0) {
			int rowStones[] = new int[n];
			int colStones[] = new int[n];
			total = 0;
			for (int i = 0; i < n; i++) {
				int rowSum = 0;
				int colSum = 0;
				for (int j = 0; j < n; j++) {
					rowSum += arr[i][j];
					colSum += arr[j][i];
					total += arr[i][j];
				}
				rowStones[i] = rowSum;
				colStones[i] = colSum;
			}
			int top = 0;
			int topIdx = -1;
			for (int i = 0; i < n; i++) {
				if(top < rowStones[i]) top = 0;
			}
		}
		
	}

}
