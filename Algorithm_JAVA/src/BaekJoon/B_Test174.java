package BaekJoon;

import java.util.Scanner;

public class B_Test174 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		while(true) {
			if(word.indexOf("pi") > -1) {
				word = word.replaceFirst("pi", "xx");
				continue;
			} else if(word.indexOf("ka") > -1) {
				word = word.replaceFirst("ka", "xx");
				continue;
			} else if(word.indexOf("chu") > -1) {
				word = word.replaceFirst("chu", "xxx");
				continue;
			}
			int rst = 1;
			char chars[] = word.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				if(chars[i] != 'x') rst = 0; 
			}
			System.out.println(rst == 0 ? "NO" : "YES");
			break;
		}
	}

}
