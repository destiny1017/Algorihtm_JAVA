package BaekJoon;

import java.util.Scanner;

public class B_Test172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = 0;
		for (int i = 1; i <= b; i++) {
			char num[] = null;
			String rev = "";
			int val = 0;
			num = (a*i+"").toCharArray();
			for (int j = num.length-1; j >= 0; j--) rev += num[j];
			val = Integer.parseInt(rev);
		}
	}

}
