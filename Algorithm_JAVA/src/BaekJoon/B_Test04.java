package BaekJoon;

import java.util.Scanner;

public class B_Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(i > 0) {
				if(arr[i] > arr[i-1]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
