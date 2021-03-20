import java.util.Arrays;

public class Test5 {

//	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	static int[] solution(int answers[]) {
		
		int rank[] = new int[3];
		// 1번 수포자
		int loop;
		for (int i = 1; i < answers.length+1; i++) {
			loop = i%5 == 0 ? 5 : i%5;
			System.out.print(loop);
			if(loop == answers[i-1]) rank[0]++;
		}
		System.out.println();
		// 2번 수포자
		int cnt = 1;
		int rs;
		for (int i = 0; i < answers.length; i++) {
			if(i%2 == 1) {
				if(cnt == 2) {
					cnt++;
					rs = cnt;
					System.out.print(cnt++);
				} else {
					rs = cnt;
					System.out.print(cnt++);
					if(cnt > 5) cnt = 1;
				}
			} else {
				System.out.print(2);
				rs = 2;
			}
			if(rs == answers[i]) rank[1]++;
		}
		System.out.println();
		// 3번 수포자
		int flag = 0;
		for (int i = 0; i < answers.length; i++) {
			int ans[] = {3,1,2,4,5};
			System.out.print(ans[flag]);
			rs = ans[flag];
			if(i%2 == 1) {
				flag++;
				if(flag > 4) flag = 0;
			}
			if(answers[i] == rs) rank[2]++;
		}
		System.out.println();
		System.out.println(Arrays.toString(rank));
		int top = rank[0];
		int answer[] = {};
		for (int i = 1; i < rank.length; i++) {
			if(rank[i] > top) {
				top = rank[i];
			}
		}
		for (int i = 0; i < rank.length; i++) {
			if(rank[i] == top) {
				int temp[] = answer.clone();
				answer = new int[answer.length+1];
				for (int k = 0; k < temp.length; k++) {
					answer[k] = temp[k];
				}
				answer[answer.length-1] = i+1;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
//		int a[] = solution(new int[] {1,2,3,4,5,4,5,4,2,2});
		int a[] = solution(new int[] {1,3,2,4,2,3,4,3,2,2,1,1,2,4,5,5,4,2,2,1,1,1,3,2});
		System.out.println(Arrays.toString(a));
	}

}
