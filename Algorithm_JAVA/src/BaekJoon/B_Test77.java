package BaekJoon;

import java.util.Scanner;

public class B_Test77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words[] = sc.next().split(" ");
		System.out.println(words.length);
		int numWords = words.length;
		if(words[0].equals("")) numWords -= 1;
		if(words[words.length-1].equals("")) numWords -= 1;
		System.out.println(numWords);
	}

}
