package BaekJoon;

import java.util.Scanner;

public class B_Test194 {
	
	static int arr[][] = new int[5][5];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

}
