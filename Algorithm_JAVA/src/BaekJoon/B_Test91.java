package BaekJoon;

import java.util.Scanner;

public class B_Test91 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			char str[] = sc.next().toCharArray();
			if(str[0] == '0') break;
			String result = "YES";
			for (int i = 0; i < str.length/2; i++) {
				if(str[i] == str[str.length-1-i]) result = "YES";
				else {
					result = "NO";
					break;
				}
			}
			System.out.println(result);
		}
	}

}
