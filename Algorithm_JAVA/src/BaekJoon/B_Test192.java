package BaekJoon;

import java.util.Scanner;

public class B_Test192 {
	
//	# 피보나치 비스무리한 수열
//	
//	문제
//	피보나치 비스무리한 수열은 f(n) = f(n-1) + f(n-3)인 수열이다. 
//	f(1) = f(2) = f(3) = 1이며 피보나치 비스무리한 수열을 나열하면 다음과 같다.
//
//	1, 1, 1, 2, 3, 4, 6, 9, 13, 19, ...
//
//	자연수 n을 입력받아 n번째 피보나치 비스무리한 수열을 구해보자!
//
//	입력
//	자연수 n(1 ≤ n ≤ 116)이 주어진다.
//
//	출력
//	n번째 피보나치 비스무리한 수를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long arr[] = new long[116];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		int num = sc.nextInt();
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-3];
		}
		System.out.println(arr[num-1]);
	}

}
