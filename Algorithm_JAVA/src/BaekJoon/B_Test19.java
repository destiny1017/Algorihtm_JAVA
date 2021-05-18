package BaekJoon;

import java.util.Scanner;

public class B_Test19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l= 2, r = 0, l_flag = -1, r_flag = 1;
		for (int i = 0; i < sc.nextInt(); i++) {
			if(l == 1) {
				r += r_flag;
				r_flag += -1;
				l_flag += -1;
			} else {
				l_flag = -1;
			}
			if(r == 1) {
			}
			else r_flag = -1;
		}

	}

}
