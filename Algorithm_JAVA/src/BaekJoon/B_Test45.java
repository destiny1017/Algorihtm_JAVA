package BaekJoon;

import java.util.Scanner;

public class B_Test45 {
	
//	# 수 정렬하기
//	
//	문제
//	N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
//
//	출력
//	첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt(); 
		}
		int b;
		for(int i = 0 ; i <  a.length -1 ; i ++) {
			for(int j = i+1 ; j < a.length ; j ++) {
				if(a[i] > a[j]) {
					b = a[j];
					a[j] = a[i];
					a[i] = b;
				}
			}
		}
		
		for(int i = 0 ; i <  a.length ; i ++) {
			System.out.println(a[i]);
		}
	}

}