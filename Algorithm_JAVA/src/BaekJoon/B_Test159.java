package BaekJoon;

import java.util.Scanner;

public class B_Test159 {
	
//	# 행복한지 슬픈지
//	
//	문제
//	승엽이는 자신의 감정을 표현하기 위해서 종종 문자 메시지에 이모티콘을 넣어 보내곤 한다. 
//	승엽이가 보내는 이모티콘은 세 개의 문자가 붙어있는 구조로 이루어져 있으며, 행복한 얼굴을 나타내는 :-) 와 슬픈 얼굴을 나타내는 :-( 가 있다.
//
//	혜성이는 승엽이의 이모티콘을 귀여운 척이라고 생각해 매우 싫어하므로, 승엽이의 문자가 오면 전체적인 분위기만 판단해서 알려주는 프로그램을 작성하고 싶다.
//
//	입력
//	첫 줄에 최소 1개에서 최대 255개의 문자들이 입력된다.
//
//	출력
//	출력은 다음 규칙에 따라 정해진다.
//
//	어떤 이모티콘도 포함되어 있지 않으면, none 을 출력한다.
//	행복한 이모티콘과 슬픈 이모티콘의 수가 동일하게 포함되어 있으면, unsure 를 출력한다.
//	행복한 이모티콘이 슬픈 이모티콘보다 많이 포함되어 있으면, happy 를 출력한다.
//	슬픈 이모티콘이 행복한 이모티콘보다 많이 포함되어 있으면, sad 를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(":");
		int happy = 0, sad = 0;
		String result = "";
		for (int i = 0; i < str.length; i++) {
			if(str[i].length() > 1) {
				if(str[i].substring(0,2).equals("-)")) happy++;
				else if(str[i].substring(0,2).equals("-(")) sad++;
			}
		}
		if(happy > sad) result = "happy";
		else if(sad > happy) result = "sad";
		else if(happy == 0 && sad == 0) result = "none";
		else if(happy == sad) result = "unsure";
		System.out.println(result);
		
	}

}
