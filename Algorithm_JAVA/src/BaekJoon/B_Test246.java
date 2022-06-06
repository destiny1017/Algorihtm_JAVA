package BaekJoon;

import java.util.Scanner;

public class B_Test246 {
	
	// # 2xn 타일링
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[] = new int[1000];
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 3;
		for (int i = 3; i < n; i++) {
			dp[i] = (dp[i-2] + dp[i-1])%10007;
		}
		System.out.println(dp[n-1]);
		
	}

}
