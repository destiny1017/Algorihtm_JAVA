package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class B_Test215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		boolean flag = false;
		for (int i = 0; i < str.length; i++) {
			if(str[i] == '<') flag = true;
			else if(str[i] == '>') flag = false;
			
		}

	}

}
