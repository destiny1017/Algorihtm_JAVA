package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Test249 {
	
	// # 1920 수 찾기
	
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		arr = new int[Integer.parseInt(br.readLine())];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int len = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < len; i++) {
			int target = Integer.parseInt(st.nextToken());
			search(0, arr.length-1, target);
		}

	}
	
	static void search(int st, int ed, int target) {
		if(st == ed) {
			if(arr[st] == target) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			return;
		}
		
		int mid = (st + ed) / 2;
		
		if(arr[mid] >= target) {
			search(st, mid, target);
		} else {
			search(mid+1, ed, target);
		}
	}

}
