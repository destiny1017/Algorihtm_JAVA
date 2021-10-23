package BaekJoon;

import java.util.Scanner;

public class B_Test137 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += sc.nextInt();
			arr[i] = sum / (i+1);
			System.out.print(arr[i] + (i < arr.length-1 ? " " : ""));
		}
	}

}
