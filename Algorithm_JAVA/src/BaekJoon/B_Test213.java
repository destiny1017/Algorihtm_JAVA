package BaekJoon;

import java.util.Scanner;

public class B_Test213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int len = sc.nextInt();
	    int[][][] dp = new int[101][100][2];
	 
	    // 인접한 비트 개수가 k개면서 n번째 비트가 0 또는 1 일때
	    // dp[n][k][0] = dp[n - 1][k][0] + dp[n - 1][k][1]
	    // dp[n][k][1] = dp[n - 1][k - 1][1] + dp[n - 1][k][0]
	 
	    dp[1][0][1] = 1; // 1
	    dp[1][0][0] = 1; // 0
	 
	    for (int k = 0; k < 100; k++) {
	        for (int n = 2; n <= 100; n++) {
	            if (k == 0) {
	                dp[n][k][1] += dp[n - 1][k][0];
	            } else {
	                dp[n][k][1] += dp[n - 1][k][0] + dp[n - 1][k - 1][1];
	            }
	            dp[n][k][0] += dp[n - 1][k][0] + dp[n - 1][k][1];
	        }
	    }
	 
	    for (int i = 0; i < len; i++) {
	    	int n = sc.nextInt();
	    	int k = sc.nextInt();
	    	System.out.println(dp[n][k][0] + dp[n][k][1]);
		}

	}

}
