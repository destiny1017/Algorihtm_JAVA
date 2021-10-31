package BaekJoon;

import java.util.Scanner;

public class B_Test144 {
	
//	# 트럭 주차
//	
//	문제
//	상근이는 트럭을 총 세 대 가지고 있다. 오늘은 트럭을 주차하는데 비용이 얼마나 필요한지 알아보려고 한다.
//	상근이가 이용하는 주차장은 주차하는 트럭의 수에 따라서 주차 요금을 할인해 준다.
//	트럭을 한 대 주차할 때는 1분에 한 대당 A원을 내야 한다. 두 대를 주차할 때는 1분에 한 대당 B원, 세 대를 주차할 때는 1분에 한 대당 C원을 내야 한다.
//	A, B, C가 주어지고, 상근이의 트럭이 주차장에 주차된 시간이 주어졌을 때, 주차 요금으로 얼마를 내야 하는지 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 문제에서 설명한 주차 요금 A, B, C가 주어진다. (1 ≤ C ≤ B ≤ A ≤ 100)
//
//	다음 세 개 줄에는 두 정수가 주어진다. 이 정수는 상근이가 가지고 있는 트럭이 주차장에 도착한 시간과 주차장에서 떠난 시간이다. 
//	도착한 시간은 항상 떠난 시간보다 앞선다. 입력으로 주어지는 시간은 1과 100사이 이다.
//
//	출력
//	첫째 줄에 상근이가 내야하는 주차 요금을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int abc[] = new int[3];
		int st[] = new int[3];
		int ed[] = new int[3];
		int price = 0;
		int num = -1;
		for (int i = 0; i < 3; i++) abc[i] = sc.nextInt();
		for (int i = 0; i < 3; i++) {
			st[i] = sc.nextInt();
			ed[i] = sc.nextInt();
		}
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < 3; j++) if(st[j] == i) num++;
			for (int j = 0; j < 3; j++) if(ed[j] == i) num--;
			if(num >= 0) price += abc[num] * (num+1);
		}
		System.out.println(price);
	}

}
