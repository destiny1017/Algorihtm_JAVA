package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_Test255 {
	
	// 10816 - 숫자카드2
	// 이진탐색 문제
	// https://www.acmicpc.net/problem/10816
	
	static int ownCard[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> countMap = new HashMap<>();
		HashMap<Integer, Integer> indexMap = new HashMap<>();
		int n = Integer.parseInt(st.nextToken());
		ownCard = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ownCard.length; i++) {
			ownCard[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ownCard);
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int target = Integer.parseInt(st.nextToken());
			if(indexMap.get(target) == null) {
//				indexMap.put(target, binarySearch(0, n-1, target));
				indexMap.put(target, lowerBound(target));
			}
			int index = indexMap.get(target);
			
			int cnt = 0;
			if(countMap.get(target) == null) {
				if(index >= 0) {
					while(ownCard[index] == target) {
						cnt++;
						if(++index == ownCard.length) break;
					}
				}
				countMap.put(target, cnt);
			} else cnt = countMap.get(target);
			
			sb.append(cnt + " ");
		}
		System.out.println(sb.toString());
	}
	
	public static int binarySearch(int st, int ed, int target) {
		
		if(st == ed) {
			if(ownCard[st] == target) {
				return st;
			} else {
				return -1;
			}
		}
		
		int mid = (st+ed) / 2;
		
		if(ownCard[mid] >= target) {
			return binarySearch(st, mid, target);
		} else {
			return binarySearch(mid+1, ed, target);
		}
	}
	
	static int lowerBound(int target) {
		int begin = 0;
		int end = ownCard.length-1;
		
		while(begin < end) {
			int mid = (begin + end) / 2;
			if(ownCard[mid] >= target) {
				end = mid;
			} else {
				begin = mid + 1;
			}
		}
		return end;
	}

}
