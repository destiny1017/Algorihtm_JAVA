package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int result = n;
		do {
			System.out.println(result);
			String strNum = Integer.toString(result);
			if(strNum.length() == 1) strNum+= "0" + strNum;
			String tmpResult = Integer.parseInt(strNum.substring(0, 1)) + Integer.parseInt(strNum.substring(1, 2))+"";
			result = Integer.parseInt(strNum.substring(strNum.length()-1) + tmpResult.substring(tmpResult.length()-1, tmpResult.length()));
			cnt++;
		} while(n != result);
		System.out.println(cnt);

	}

}
