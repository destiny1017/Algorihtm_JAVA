package BaekJoon;

import java.util.Scanner;

public class B_Test182 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			int cnt = 0;
			int arr[][] = new int[sc.nextInt()][sc.nextInt()];
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			
			for (int j = 0; j < arr[0].length-1; j++) {
				for (int k = arr.length-j-1; 1 <= k; k--) {
					System.out.printf("arr[%d][%d]\n", k,j);
					if(arr[k][j] < arr[k-1][j]) {
						arr[k][j] = 1;
						arr[k-1][j] = 0;
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

}
