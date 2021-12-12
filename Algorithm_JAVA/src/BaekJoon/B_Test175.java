package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_Test175 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int loop = Integer.parseInt(br.readLine());
		for (int i = 0; i < loop; i++) {
			int min = 0;
			ArrayList<Character> list1 = new ArrayList<>();
			ArrayList<Character> list2 = new ArrayList<>();
			int len = Integer.parseInt(br.readLine());
			char word1[] = br.readLine().toCharArray();
			char word2[] = br.readLine().toCharArray();
			for (int j = 0; j < len; j++) {
				list1.add(word1[j]);
				list2.add(word2[j]);
			}
			
			for (int j = 0; j < list1.size(); j++) {
				if(list1.get(j) == list2.get(j)) {
					list1.remove(j);
					list2.remove(j);
				}
			}
			
			Collections.sort(list1);
			Collections.sort(list2);
			
			for (int j = 0; j < list1.size(); j++) {
				if(list1.get(j) != list2.get(j)) {
					list1.remove(j);
					list2.remove(j);
					min++;
					j--;
				}
			}
			System.out.println(min + (list1.size()/2));
		}
	}

}
