package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_Test41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt() * sc.nextInt() * sc.nextInt();
		char sNum[] = (num+"").toCharArray();
		int numCnt[] = new int[10];
		for (int i = 0; i < sNum.length; i++) {
			if(sNum[i] == (char) i) {
				numCnt[i]++;
			}
			System.out.println(numCnt[i]);
		}
	}

}
