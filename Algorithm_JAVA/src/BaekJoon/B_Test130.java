package BaekJoon;

import java.util.Scanner;

public class B_Test130 {
	
//	# 콘테스트
//	
//	문제
//	최근 온라인에서의 프로그래밍 콘테스트가 열렸다. 
//	W 대학과 K 대학의 컴퓨터 클럽은 이전부터 라이벌 관계에있어,이 콘테스트를 이용하여 양자의 우열을 정하자라는 것이되었다.
//
//	이번이 두 대학에서 모두 10 명씩이 콘테스트에 참여했다. 
//	긴 논의 끝에 참가한 10 명 중 득점이 높은 사람에서 3 명의 점수를 합산하여 대학의 득점으로하기로 했다.
//
//	W 대학 및 K 대학 참가자의 점수 데이터가 주어진다. 이때, 각각의 대학의 점수를 계산하는 프로그램을 작성하라.
//
//	입력
//	입력은 20 행으로 구성된다. 
//	1 번째 줄부터 10 번째 줄에는 W 대학의 각 참가자의 점수를 나타내는 정수가 11 번째 줄부터 20 번째 줄에는 K 대학의 각 참가자의 점수를 나타내는 정수가 적혀있다. 
//	이 정수는 모두 0 이상 100 이하이다.
//
//	출력
//	W 대학 점수와 K 대학의 점수를 순서대로 공백으로 구분하여 출력하라.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w[] = new int[10];
		int k[]	= new int[10];
		for (int i = 0; i < 10; i++) w[i] = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			for (int j = 9; j > i; j--) {
				if(w[j] > w[j-1]) {
					int tmp = w[j-1];
					w[j-1] = w[j];
					w[j] = tmp;
				}
			}
		}
		for (int i = 0; i < 10; i++) k[i] = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			for (int j = 9; j > i; j--) {
				if(k[j] > k[j-1]) {
					int tmp = k[j-1];
					k[j-1] = k[j];
					k[j] = tmp;
				}
			}
		}
		System.out.println(w[0] + w[1] + w[2] + " " + (k[0] + k[1] + k[2]));
			
	}

}
