package Algorithm_example;

import java.util.Arrays;

public class BinarySearch {
	
	static int[] arr;
	static int target;
	
	public static void main(String[] args) {
		arr = new int[] {4,6,7,9,3,2,8,1};
		target = 4;
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		search(0, arr.length-1, target);
	}
	
	static void search(int st, int ed, int target) {
		// 반씩 자르다 마지막 하나가 남을 경우
		if(st == ed) {
			// 찾는 수와 마지막 값이 같으면 인덱스 출력, 같지 않으면 없는 것이므로 None 출력
			if(arr[st] == target) {
				System.out.println(st);
			} else {
				System.out.println("None");
			}
			return;
		}
		// 중간 인덱스
		int mid = (st + ed) / 2;
		
		// 중간 값이 찾고자 하는 값보다 같거나 높으면 좌측 배열로, 낮으면 우측 배열로 재탐색
		if(arr[mid] >= target) {
			search(st, mid, target);
		} else {
			search(mid+1, ed, target);
		}
	}

}
