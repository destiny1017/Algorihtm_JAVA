package BaekJoon;

import java.util.Scanner;

public class B_Test232 {
	
	static char[][] arr;
	static int jCnt = 0;
	static int iCnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new char[n][n];
		stars(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println(jCnt);
	}
	
	static void stars(int n) {
		for (int i = iCnt; i < iCnt+n; i+=n/3) {
			for (int j = jCnt; j < jCnt+n; j+=n/3) {
				if(n == 3) {
					System.out.printf("i: %d, j: %d\n", i, j);
					arr[i][j] = '*';
				} else {
					System.out.println();
					stars(n/3);
				}
			}
		}
		jCnt += n;
		if(jCnt >= n*n) {
			jCnt = 0;
			iCnt += n;
		}
		if(iCnt >= n*n) {
			iCnt = 0;
		}
	}

}
