
public class Test5 {

//	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	static int[] solution(int answer[]) {
		
		int rank[] = new int[3];
		int st1, st2, st3;
		// 1번 수포자
		for (int i = 1; i < answer.length+1; i++) {
			int loop = i%5 == 0 ? 5 : i%5;
			System.out.print(loop);
		}
		System.out.println();
		// 2번 수포자
		for (int i = 1; i < answer.length; i++) {
			int loop = i%5 == 0 ? 5 : i%5;
			if(i%2 == 0) {
				System.out.print(2);
			} else {
				System.out.print(loop);
			}
		}
		
		return rank;
	}
	
	public static void main(String[] args) {
		solution(new int[] {1,2,3,4,5,4,5,4,2,2});
	}

}
