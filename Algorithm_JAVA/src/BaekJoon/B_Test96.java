package BaekJoon;

import java.util.Scanner;

public class B_Test96 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int diceNum[] = new int[6];
		int topPrize = 0;
		for (int i = 0; i < len; i++) {
			int top = 0;
			int topIdx = -1;
			diceNum[sc.nextInt()-1]++;
			diceNum[sc.nextInt()-1]++;
			diceNum[sc.nextInt()-1]++;
			for (int j = 0; j < diceNum.length; j++) {
				if(diceNum[j] >= top) {
					top = diceNum[j];
					topIdx = j;
				}
			}
			switch(top) {
			case 1:
				topPrize = diceNum[topIdx] * 3;
				break;
			case 2:
				topPrize = diceNum[topIdx] * 3 + 1000;
				break;
			case 3:
				topPrize = diceNum[topIdx] * 3 + 10000;
				break;
			}
		}
		System.out.println(topPrize);
	}

}
