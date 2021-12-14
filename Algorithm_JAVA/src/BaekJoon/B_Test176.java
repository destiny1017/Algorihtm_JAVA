package BaekJoon;

import java.util.Scanner;

public class B_Test176 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			String carNum[] = sc.next().split("-");
			int total = 0;
			System.out.println((int)carNum[0].charAt(0));
			total += (int)carNum[0].charAt(0) - 64;
			total += (int)carNum[0].charAt(1) - 64;
			total += (int)carNum[0].charAt(2) - 64;
			total += Integer.parseInt(carNum[1]);
			System.out.println(total < 100 ? "nice" : "not nice");
		}
		
	}

}
