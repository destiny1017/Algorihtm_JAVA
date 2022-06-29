package Programmers;

import java.util.Scanner;

public class Test38 {
	
	// # 124나라의 숫자
	
//	1	1	
//	2	2	
//	3	4	
//	4	11	
//	5	12	
//	6	14
//  7	21
//  8	22
//  9	24
//  10	41
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int n;
//		StringBuffer sb = new StringBuffer();
//		for (int i = 1; i <= num; i++) {
//			n = i;
//			while(n != 0) {
//				int val = n % 3;
//				if(val == 0) {
//					sb.append(4);
//					n = (n / 3) - 1;
//				} else {
//					sb.append(val);
//					n /= 3;
//				}
//			}
//			System.out.println(sb.reverse().toString());
//			sb.setLength(0);
//		}
		System.out.println(solution(num));
		
	}
	
	static String solution(int n) {
		StringBuffer sb = new StringBuffer();
		while(n != 0) {
			int val = n % 3;
			if(val == 0) {
				sb.append(4);
				n = (n / 3) - 1;
			} else {
				sb.append(val);
				n /= 3;
			}
		}
		return sb.reverse().toString();
	}

}
