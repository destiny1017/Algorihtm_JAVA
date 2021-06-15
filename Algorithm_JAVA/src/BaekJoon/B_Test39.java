package BaekJoon;

import java.util.Scanner;

public class B_Test39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		int chargeX = sc.nextInt();
		int StdChargeY = sc.nextInt();
		int maxStdChargeY = sc.nextInt();
		int chargeY = sc.nextInt();
		int usedWater = sc.nextInt();
		x = chargeX * usedWater;
		if(x < StdChargeY) {
			System.out.println(x);
		} else {
			y = StdChargeY;
			if(usedWater > maxStdChargeY) {
				y = (usedWater - StdChargeY) * chargeY;
			}
			System.out.println(y);
		}

	}

}
