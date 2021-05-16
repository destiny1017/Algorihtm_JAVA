package BaekJoon;

import java.util.Scanner;

public class B_Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int topCnt = 0;
		int cnt = 0;
		int beforeValue = 1000;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr.length - i > topCnt && arr[i] <= beforeValue) {
				beforeValue = arr[i];
				cnt = 0;
				max = 0;
				for (int j = i; j < arr.length; j++) {
					if(arr[j] > max) {
						cnt++;
						max = arr[j];
					}
				}
				if(cnt > topCnt) topCnt = cnt;
			}
		}
		System.out.println(topCnt);
	}

}
