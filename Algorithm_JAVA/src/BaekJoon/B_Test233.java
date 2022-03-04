package BaekJoon;

import java.util.Scanner;

public class B_Test233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int f = sc.nextInt();
		int n = Integer.parseInt(str.substring(0,str.length()-2) + "00");
		while(n%f == 0) {
			n++;
		}
		str = (""+n);//.substring(str.length()-2);
		System.out.println(str);
	}

}
