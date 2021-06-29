package BaekJoon;

import java.util.Scanner;

public class B_Test48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), top = -1000;
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int sum = 0;
			for (int j = i; j < num; j++) {
				sum += arr[j];
				if(sum > top) top = sum;
			}
		}
		System.out.println(top);
	}

}
