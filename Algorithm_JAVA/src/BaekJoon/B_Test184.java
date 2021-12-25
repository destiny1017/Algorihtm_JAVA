package BaekJoon;

import java.util.Scanner;

public class B_Test184 {
	
//	# 점화식
//	
//	문제
//	다음의 점화식에 의해 정의된 수열 t(n)을 생각하자:
//
//	t(0)=1
//	t(n)=t(0)*t(n-1)+t(1)*t(n-2)+...+t(n-1)*t(0)
//	이 정의에 따르면,
//
//	t(1)=t(0)*t(0)=1
//	t(2)=t(0)*t(1)+t(1)*t(0)=2
//	t(3)=t(0)*t(2)+t(1)*t(1)+t(2)*t(0)=5
//	...
//	주어진 입력 0 ≤ n ≤ 35에 대하여 t(n)을 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 n (0 ≤ n ≤ 35)이 주어진다.
//
//	출력
//	첫째 줄에 t(n)을 출력한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long arr[] = new long[36];
		arr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			long val = 0;
			for (int j = 0; j < i; j++) {
				val += arr[j] * arr[i-j-1]; 
			}
			arr[i] = val;
		}
		System.out.println(arr[sc.nextInt()]);
	}

}
