package BaekJoon;

import java.util.Scanner;

public class B_Test75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			String line = "";
			int flag = 1;
			for (int j = 0; j < num; j++) {
				if(j == num-i-flag) {
					line += "*";
					flag -= 2;
				} else {
					line += " ";
				}
			}
			flag = 1;
			for (int j = 1; j <= i; j++)  {
				if(i%2 != 0) {
					line += j%2 != 0 ? "*" : " ";
				} else {
					line += j%2 == 0 ? "*" : " ";
				}
			}
			System.out.println(line);
		}
	}

}
