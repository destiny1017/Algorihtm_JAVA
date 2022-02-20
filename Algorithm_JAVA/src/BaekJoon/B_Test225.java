package BaekJoon;

import java.util.Scanner;

public class B_Test225 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		for (int i = 1; i <= len; i++) {
			int n = sc.nextInt();
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] > i) cnt++;
				if(j >= n && arr[j] == 0) {
					
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i < arr.length-1 ? " " : ""));
		}
	}

}
