package BaekJoon;

import java.util.Scanner;

public class B_Test64 {
	
//	# 소트인사이드
//	
//	문제
//	배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
//
//	입력
//	첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
//
//	출력
//	첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char arr[] = sc.next().toCharArray();
		int indexMin;
		char temp;
		for (int i = 0; i < arr.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[indexMin]) {
					indexMin = j;
				}
			}
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
		System.out.println(arr);

	}

}
