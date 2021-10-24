package BaekJoon;

import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class B_Test138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String name[] = new String[len];
		String bd[] = new String[len];
		for (int i = 0; i < len; i++) {
			name[i] = sc.next();
			String date = "";
			for (int j = 0; j < 3; j++) {
				date = String.format("%02d", sc.nextInt()) + date;
			}
			bd[i] = date;
		}
		int min = 99999999;
		int max = 0;
		int maxIdx = 0;
		int minIdx = 0;
		for (int i = 0; i < bd.length; i++) {
			if(Integer.parseInt(bd[i]) < min) {
				min = Integer.parseInt(bd[i]);
				minIdx = i;
			}
			if(Integer.parseInt(bd[i]) > max) {
				max = Integer.parseInt(bd[i]);
				maxIdx = i;
			}
		}
		System.out.println(name[minIdx]);
		System.out.println(name[maxIdx]);
	}

}
