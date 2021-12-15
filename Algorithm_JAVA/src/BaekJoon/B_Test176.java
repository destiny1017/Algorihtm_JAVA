package BaekJoon;

import java.util.Scanner;

public class B_Test176 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			String carNum[] = sc.next().split("-");
			int total = 0;
			for (int j = 0; j < 3; j++) {
				total += ((int)carNum[0].charAt(j) - 65) * Math.pow(26, (2-j));
			}
			total -= Integer.parseInt(carNum[1]);
			System.out.println(Math.abs(total) < 100 ? "nice" : "not nice");
		}
		
	}

}
