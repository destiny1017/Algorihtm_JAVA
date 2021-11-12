package BaekJoon;

import java.util.Scanner;

public class B_Test153 {
	
//	# 이진수 연산
//	
//	문제
//	총 100,000 비트로 이루어진 이진수 A와 B가 주어진다. 이때, A & B, A | B, A ^ B, ~A, ~B를 한 값을 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 이진수 A, 둘째 줄에 이진수 B가 주어진다. 두 이진수의 길이는 모두 100,000이다. 예제의 경우에만 길이가 10이며, 예제는 채점하지 않는다.
//
//	출력
//	첫째 줄부터 한 줄에 하나씩 차례대로 A & B, A | B, A ^ B, ~A, ~B를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a[] = sc.next().toCharArray();
		char b[] = sc.next().toCharArray();
		
        for(int i=0; i<a.length; i++) {
            if(a[i] == '1' && b[i] == '1')
                System.out.print(1);
            else System.out.print(0);
        }
        System.out.println();
        
        for(int i=0; i<a.length; i++) {
            if(a[i] == '1' || b[i] == '1')
                System.out.print(1);
            else System.out.print(0);
        }
        System.out.println();
        
        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i])
                System.out.print(1);
            else System.out.print(0);
        }
        System.out.println();
        
        for(int i=0; i<a.length; i++) {
            if(a[i] == '0')
                System.out.print(1);
            else System.out.print(0);
        }
        System.out.println();
        
        for(int i=0; i<b.length; i++) {
            if(b[i] == '0')
                System.out.print(1);
            else System.out.print(0);
        }
	}

}
