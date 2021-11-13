package BaekJoon;

import java.text.DecimalFormat;
import java.util.Scanner;

public class B_Test154 {
	
//	# 8진수
//	
//	문제
//	창영이는 여러 가지 진법을 공부하고 있다. 창영이는 어제 2진법을 배웠고, 오늘은 8진법을 배웠다. 
//	이제, 2진법 수를 8진법 수로 변환하려고 한다.
//
//	창영이가 사용한 방법은 다음과 같다.
//
//	2진수의 길이가 3으로 나누어 떨어질 때 까지 수의 앞에 0을 붙인다.
//	그 다음, 3자리씩 그룹을 나눈다.
//	아래의 표를 참고해 8진수로 바꾼다.
//	2진수가 주어졌을 때, 창영이가 사용한 방법을 이용해 8진수로 바꾸는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 2진수가 주어진다. 이 수는 100자리 이내이고, 첫 번째 자리는 1이다.
//
//	출력
//	첫째 줄에 8진수를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rst = "";
		String chart[] = {"000","001","010","011","100","101","110","111"};
		DecimalFormat df = new DecimalFormat("000");
		while(true) {
			if(str.length() > 2) {
				String tmp = str.substring(str.length()-3, str.length());
				for (int i = 0; i < chart.length; i++) {
					if(chart[i].equals(tmp)) rst = i + rst;
				}
				str = str.substring(0, str.length()-3);
			} else if(str.length() > 0) {
				str = df.format(Integer.parseInt(str));
			} else {
				System.out.println(rst);
				break;
			}
		}
	}

}
