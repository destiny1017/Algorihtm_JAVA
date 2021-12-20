package BaekJoon;

import java.util.Scanner;

public class B_Test181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if(i%2 == 0) {
				
			} else {
				String line = "*";
				for (int j = 1; j < n; j++) line += " *"; 
			}
		}
	}

}
