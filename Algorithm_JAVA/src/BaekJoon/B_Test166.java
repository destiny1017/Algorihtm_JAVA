package BaekJoon;

import java.util.Scanner;

public class B_Test166 {
	
//	# 방 배정
//	
//	문제
//	정보 초등학교에서는 단체로 2박 3일 수학여행을 가기로 했다. 여러 학년이 같은 장소로 수학여행을 가려고 하는데 1학년부터 6학년까지 학생들이 묵을 방을 배정해야 한다. 
//	1~2학년은 남학생, 여학생 구별 없이 방을 배정할 수 있으며 3~6학년은 남학생은 남학생끼리, 여학생은 여학생끼리 방을 배정해야 한다. 
//	또한 1~2학년은 학년 구별 없이 같은 방에 배정할 수 있으며 마찬가지로 3~4학년도, 5~6학년도 각각 학년 구별 없이 방을 배정할 수 있다. 
//	물론 한 방에 한 명만 배정되는 것도 가능하다.
//
//	한 방에 배정할 수 있는 최대 인원 수 K가 주어졌을 때, 조건에 맞게 모든 학생을 배정하기 위해 필요한 방의 최소 개수를 구하는 프로그램을 작성하시오.
//
//	예를 들어, 수학여행을 가는 학생이 다음과 같다면 K = 2일 때 9개의 방이 필요하다. 
//
//	입력
//	표준 입력으로 다음 정보가 주어진다. 첫 번째 줄에는 수학여행에 참가하는 학생 수를 나타내는 정수 N(1 ≤ N ≤ 1,000)과
//	한 방에 배정할 수 있는 최대 인원 수 K(1 ≤ K ≤ 1,000)가 공백으로 분리되어 주어진다. 
//	다음 N 개의 각 줄에 학생의 성별 S와 학년 Y(1 ≤ Y ≤ 6)가 공백으로 분리되어 주어진다. 성별 S는 0, 1중 하나로서 여학생인 경우에 0, 남학생인 경우에 1로 나타낸다. 
//
//	출력
//	표준 출력으로 학생들을 모두 배정하기 위해 필요한 최소한의 방의 수를 출력한다. 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rooms[] = new int[5];
		int len = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			int sex = sc.nextInt();
			int year = sc.nextInt();
			if(sex == 0) {
				if(year < 3) {
					rooms[0]++;
				} else if(year < 5) {
					rooms[1]++;
				} else if(year < 7) {
					rooms[3]++;
				}
			} else {
				if(year < 3) {
					rooms[0]++;
				} else if(year < 5) {
					rooms[2]++;
				} else if(year < 7) {
					rooms[4]++;
				}
			}
		}
		
		for (int i = 0; i < rooms.length; i++) {
			cnt += rooms[i] / k;
			if(rooms[i] % k != 0) cnt++;
		}
		System.out.println(cnt);
	}

}
