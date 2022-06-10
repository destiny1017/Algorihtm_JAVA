package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_Test245 {
	
	// # 연산자 끼워넣기
	
	static int n;
	
	static int[] target;
	static int[] operator;
	static boolean visit[];
	
	static int[] arr;
	
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		target = new int[n];
		for (int i = 0; i < n; i++) {
			target[i] = sc.nextInt();
		}
		operator = new int[n-1];
		visit = new boolean[n-1];
		arr = new int[n-1];
		
		int j = 0;
		for (int i = 1; i < 5; i++) {
			int num = sc.nextInt();
			int repeat = j+num;
			for (; j < repeat; j++) {
				operator[j] = i;
			}
		}
		recur(0);
		
		System.out.println(max);
		System.out.println(min);
	}
	
	static void recur(int depth) {
		if(depth == n-1) {
			int val = target[0];
			for (int i = 1; i < target.length; i++) {
				switch(arr[i-1]) {
				case 1:
					val += target[i];
					break;
				case 2:
					val -= target[i];
					break;
				case 3:
					val *= target[i];
					break;
				case 4:
					val /= target[i];
					break;
				}
			}
			if(val > max) max = val;
			if(val < min) min = val;
			return;
		}
		for (int i = 0; i < operator.length; i++) {
			if(visit[i] == false) {
				visit[i] = true;
				arr[depth] = operator[i];
				recur(depth+1);
				visit[i] = false;
			}
		}
	}

}
