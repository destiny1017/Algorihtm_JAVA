package BaekJoon;

import java.util.Scanner;

public class B_Test248 {
	
//	# 가장 긴 감소하는 부분 수열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int dp[] = new int[n];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		dp[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if(arr[i] < arr[j] && dp[i] < dp[j]+1) {
					dp[i] = dp[i] + 1;
				} 
			}
			if(max < dp[i]) max = dp[i];
		}
		System.out.println(max);
	}

}
