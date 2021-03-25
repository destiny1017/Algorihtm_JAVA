import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test9 {
	
//	문제 설명
//	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//
//	제한사항
//	arr은 자연수를 담은 배열입니다.
//	정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//	divisor는 자연수입니다.
//	array는 길이 1 이상인 배열입니다.

	public static int[] solution(int[] arr, int divisor) {
	  int[] answer = {-1};
	  List<Integer> res = new ArrayList<Integer>();
	  
	  Arrays.sort(arr);
	  for(int i=0; i<arr.length; i++) {
		  int s = arr[i]%divisor;
		  
		  if(s == 0) {
			  res.add(arr[i]);
		  }
	  }		  
	  
	  if(res.size() != 0) {
		  int[] Answer = new int[res.size()];
		  for(int i=0; i<res.size(); i++) {
			  Answer[i] = res.get(i);
		  }
		  answer = Arrays.copyOf(Answer, Answer.length);
	  }
	  		  
	  return answer;
  	}
	public static void main(String[] args) {
		int[] arr1 = {5,9,7,10};
//		int[] arr2 = {2,36,1,3};
//		int[] arr3 = {3,2,6};
		System.out.println(Arrays.toString(solution(arr1, 5)));
	}

}
