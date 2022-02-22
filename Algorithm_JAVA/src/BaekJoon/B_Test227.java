package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_Test227 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int len = sc.nextInt();
		String arr[] = new String[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
	}

}
