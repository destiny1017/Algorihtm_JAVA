package BaekJoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B_Test227 {
	
//	# 단어 정렬
//	
//	문제
//	알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//
//	길이가 짧은 것부터
//	길이가 같으면 사전 순으로
//	입력
//	첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 
//	둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
//
//	출력
//	조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int len = sc.nextInt();
		String arr[] = new String[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.next();
		}
		
		Comparator<String> cpt = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) return 1;
				else if(o1.length() == o2.length()) return 0;
				else return -1;
			}
		};
		
		Arrays.sort(arr, cpt);
		
		int prevLen = 1;
		int stIdx = 0;
		int edIdx = 1;
		for (int i = 0; i < len; i++) {
			if(prevLen < arr[i].length()) {
				edIdx = i;
				Arrays.sort(arr, stIdx, edIdx);
				stIdx = i;
				prevLen = arr[i].length();
			}
			if(i == len-1) {
				edIdx = i+1;
				Arrays.sort(arr, stIdx, edIdx);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(i > 0) if(arr[i-1].equals(arr[i])) continue;
			System.out.println(arr[i]);
		}
	}

}
