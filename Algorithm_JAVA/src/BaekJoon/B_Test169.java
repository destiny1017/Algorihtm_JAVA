package BaekJoon;

import java.util.HashMap;
import java.util.Scanner;

public class B_Test169 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		int len = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			int num = sc.nextInt();
			if(map.get(num) == null) {
				map.put(num, sc.nextInt());
			} else {
				int val = sc.nextInt();
				if(map.get(num) != val) {
					map.put(num, val);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
