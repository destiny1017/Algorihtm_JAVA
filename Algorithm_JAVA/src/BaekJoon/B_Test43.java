package BaekJoon;

import java.util.*;

public class B_Test43 {
	
//	# 단어 공부
//	
//	문제
//	알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//	입력
//	첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//	출력
//	첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<>();
		char str[] = sc.next().toUpperCase().toCharArray();
		ArrayList<Character> topVal = new ArrayList<>();
		int top = 0;
		for (int i = 0; i < str.length; i++) {
			if(map.get(str[i]) == null) {
				map.put(str[i], 1);
			} else {
				map.put(str[i], map.get(str[i])+1);
			}
			if(top < map.get(str[i])) top = map.get(str[i]);
		}
		for(char val: map.keySet()) {
			if(map.get(val) == top) {
				topVal.add(val);
			}
		}
		System.out.println(topVal.size() > 1 ? "?" : topVal.get(0));
	}

}
