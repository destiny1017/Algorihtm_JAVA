package BaekJoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class B_Test43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<>();
		char str[] = sc.next().toCharArray();
		ArrayList<Character> topVal = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			if(map.get(str[i]) == null) {
				map.put(str[i], 1);
			} else {
				map.put(str[i], map.get(str[i])+1);
			}
		}
		for(char val: map.keySet()) {
			System.out.println(val + " : " + map.get(val));
			
		}
	}

}
