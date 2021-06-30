package BaekJoon;

import java.util.Scanner;

public class B_Test48 {
	
//	# 연속합
//	
//	문제
//	n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 수는 한 개 이상 선택해야 한다.
//
//	예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 여기서 정답은 12+21인 33이 정답이 된다.
//
//	입력
//	첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다. 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
//
//	출력
//	첫째 줄에 답을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), top = -1000;
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int sum = 0;
			for (int j = i; j < num; j++) {
				sum += arr[j];
				if(sum > top) top = sum;
			}
		}
		System.out.println(top);
	}

}
