package BaekJoon;

import java.util.Scanner;

public class B_Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String max = "";
		long maxNum = 0;
		for (int i = 0; i < len; i++) {
			max += "9";
		}
		maxNum = Long.parseLong(max);
		System.out.println(maxNum);
		int cnt = 0;
		for (int i = 0; i < maxNum; i++) {
			char[] arr = (i+"").toCharArray();
			for (int j = 0; j < arr.length; j++) {
				if(i < 10) {
					System.out.println("a:" + i);
					cnt++;
				}
				else {
					if(arr[j] > arr[j-1]) {
						System.out.println("b:" + i);
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
