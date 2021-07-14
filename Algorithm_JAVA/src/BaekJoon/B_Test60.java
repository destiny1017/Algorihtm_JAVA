package BaekJoon;

import java.util.Scanner;

public class B_Test60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String reverse = "";
		if(a > b) {
			reverse = b+"";
		} else {
			reverse = a+"";
		}
		System.out.println(reverse.substring(2,3) + reverse.substring(1,2) + reverse.substring(0,1));
	}

}
