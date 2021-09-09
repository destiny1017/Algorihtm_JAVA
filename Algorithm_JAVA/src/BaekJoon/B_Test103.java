package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_Test103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scores[] = new int[8];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
	}

}
