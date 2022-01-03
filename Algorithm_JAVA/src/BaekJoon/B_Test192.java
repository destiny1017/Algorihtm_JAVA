package BaekJoon;

import java.util.Scanner;

public class B_Test192 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[116];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		int num = sc.nextInt();
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-3];
		}
		System.out.println(arr[num-1]);
	}

}
