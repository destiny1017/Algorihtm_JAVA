package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_Test208 {
	
//	# 직사각형에서 탈출
//	
//	문제
//	한수는 지금 (x, y)에 있다. 
//	직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 
//	직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 x, y, w, h가 주어진다.
//
//	출력
//	첫째 줄에 문제의 정답을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		for (int i=0; i<4; i++) arr[i] = sc.nextInt();
		arr[2] -= arr[0];
		arr[3] -= arr[1];
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

}
