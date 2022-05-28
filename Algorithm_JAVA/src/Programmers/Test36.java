package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Test36 {
	
	// 2021 KAKAO BLIND RECRUITMENT
	// 메뉴 리뉴얼
	
	// 1. orders에 등장한 알파벳들의 가능한 모든 조합의 배열 DFS로 구하기
	// 2. 조합별로 orders에 포함된 횟수 구하기
	// 3. 2개 이상 포함된 조합 배열 따로 빼기
	// 4. 뺀 조합배열 오름차순으로 정렬 후 리턴
	
	// 등장하는 메뉴 알파벳
	static String[] menu;
	
	// 가능한 모든 조합 배열
	static HashMap<Integer, ArrayList<String[]>> combMap = new HashMap<>();
	
	// 임시 조합배열
	static String tmp[];
	
	static String orders[];
	
	static HashMap<Integer, ArrayList<String>> targetCombMap = new HashMap<>();
	static HashMap<String, Integer> orderCnt = new HashMap<>();
	
	static ArrayList<String> answerList = new ArrayList<>();
	

	public static void main(String[] args) {
		solution(new String[] {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ"}, new int[] {2,3,4});
//		solution(new String[] {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[] {2,3,5});
//		solution(new String[] {"XYZ", "XWY", "WXA"}, new int[] {2,3,4});
	}
	
    public static String[] solution(String[] orders, int[] course) {
    	// 등장하는 메뉴 배열 뽑기
    	HashSet<String> tmpMenu = new HashSet<>();
    	for (String str : orders) {
			for (int i = 0; i < str.length(); i++) {
				tmpMenu.add(str.charAt(i) + "");
			}
		}
    	menu = tmpMenu.toArray(new String[tmpMenu.size()]);
    	
    	// 조합 가능한 모든 배열 구하기
    	for (int num : course) {
    		combMap.put(num, new ArrayList<>());
    		tmp = new String[num];
			combination(0, 0, num);
		}
    	
    	// 각 조합들의 메뉴 포함횟수 구하기
    	for (int i : course) {
    		targetCombMap.put(i, new ArrayList<>());
    		for (String[] strArr : combMap.get(i)) {
    			String str = String.join("", strArr);
    			int cnt = existCnt(str, orders);
    			if(cnt > 1) {
    				targetCombMap.get(i).add(str);
    				orderCnt.put(str, cnt);
    			}
    		}
		}
    	
    	// course당 가장 많이 등장한 조합의 메뉴 구하기
    	for (int i : course) {
			ArrayList<String> rank = targetCombMap.get(i);
			// 가장 많은 주문 수 구하기
			int topCnt = 0;
			for (String tmp: rank) {
				if(topCnt < orderCnt.get(tmp)) {
					topCnt = orderCnt.get(tmp);
				};
			}
			
			// 가장 많은 주문 수에 해당하는 메뉴 추가
			for (String tmp : rank) {
				if(orderCnt.get(tmp) == topCnt) {
					answerList.add(tmp);
				}
			}
		}
    	
    	// 정렬하기
    	String[] answer = answerList.toArray(new String[answerList.size()]);
    	Arrays.sort(answer);
    	
    	for (String str : answer) {
			System.out.println(str);
		}
    	
        return answer;
    }
    
    public static void combination(int cnt, int idx, int num) {
    	if(cnt == num) {
    		combMap.get(num).add(tmp.clone());
    		return;
    	}
    	
    	for (int i = idx; i < menu.length; i++) {
			tmp[cnt] = menu[i];
			combination(cnt+1, i+1, num);
		}
    	
    }
    
    public static int existCnt(String set, String[] orders) {
    	int totalCnt = 0;
    	for (String str : orders) {
    		int cnt = 0;
    		for (int i = 0; i < set.length(); i++) {
				if(str.indexOf(set.charAt(i)) >= 0) {
					cnt++;
				}
			}
    		if(cnt == set.length()) {
    			totalCnt++;
    		}
		}
    	return totalCnt;
    }

}
