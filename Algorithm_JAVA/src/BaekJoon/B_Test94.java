package BaekJoon;

import java.util.Scanner;

public class B_Test94 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char str[] = sc.next().toCharArray();
		
		for (int i = 0; i < str.length; i++) {
			str[i] = (char) (str[i]+13);
		}
//		System.out.println((int)'a' + " " + (int)'A');
		System.out.println(str);

	}

}
