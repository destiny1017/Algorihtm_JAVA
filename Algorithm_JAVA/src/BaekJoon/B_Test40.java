package BaekJoon;

import java.util.Scanner;

public class B_Test40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int hour = sc.nextInt();
		int min = sc.nextInt();
		String sTime = hour + "" + min;
		int iTime = Integer.parseInt(sTime);
		if(Integer.parseInt(sTime) > 2400) {
			sTime = "0000";
		}
	}

}
