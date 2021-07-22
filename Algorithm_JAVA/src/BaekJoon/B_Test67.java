package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Test67 {
	
//	# 적어도 대부분의 배수
//	
//	문제
//	다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.
//
//	서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 다섯 개의 자연수가 주어진다. 100보다 작거나 같은 자연수이고, 서로 다른 수이다.
//
//	출력
//	첫째 줄에 적어도 대부분의 배수를 출력한다.

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int cnt = 0, num = 0;
		while(cnt < 3) {
			cnt = 0;
			num++;
			for (int i = 0; i < arr.length; i++) {
				if(num % arr[i] == 0) cnt++;
			}
		}
		System.out.println(num);
		
	}

}
