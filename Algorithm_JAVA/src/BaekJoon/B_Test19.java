package BaekJoon;

import java.util.Scanner;

public class B_Test19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l= 1, r = 1, flag = 1, max = 1, cnt = 1, i = sc.nextInt();
		while(cnt < i) {
			if(flag == 1) {
				r+=1;
			} else {
				l+=1;
			}
			cnt++;
			max++;
			flag*=-1;
//			System.out.println("out:"+l +"/"+ r+"\tflag:"+flag+"\tcnt:" + cnt);
			for (int j = 1; j < max; j++) {
				if(flag == 1) {
					r+=1;
					l+=-1;
				} else {
					l+=1;
					r+=-1;
				}
				cnt++;
				if(cnt >= i) break;
//				System.out.println("in :" + l +"/"+ r+"\tflag:"+flag+"\tcnt:" + cnt);
			}
		}
		System.out.println(l+"/"+r);

	}

}
