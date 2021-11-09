package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_Test152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int time = sc.nextInt();
		int stTime[] = new int[len];
		int point[] = new int[len];
		double eff[] = new double[len];
//		int effRank[] = new int[len];
		for (int i = 0; i < len; i++) {
			stTime[i] = sc.nextInt();
			point[i] = sc.nextInt();
			eff[i] = (double) point[i] / stTime[i];
		}
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < len; j++) {
				if(eff[j] > eff[i]) {
					double tmpEff = eff[i];
					int tmpStTime = stTime[i];
					int tmpPoint = point[i];
					
					eff[i] = eff[j];
					stTime[i] = stTime[j];
					point[i] = point[j];
					
					eff[j] = tmpEff;
					stTime[j] = tmpStTime;
					point[j] = tmpPoint;
				}
			}
		}
		int useHour = 0;
		int totalPoint = 0;
		for (int i = 0; i < eff.length; i++) {
			if(useHour + stTime[i] > time) {
				continue;
			}
			useHour += stTime[i];
			totalPoint += point[i];
		}
		System.out.println(Arrays.toString(eff));
		System.out.println(Arrays.toString(stTime));
		System.out.println(Arrays.toString(point));
		System.out.println(totalPoint);

	}

}
