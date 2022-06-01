package Programmers;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Test37 {
	
	// 2019 KAKAO BLIND RECRUITMENT 오픈채팅방
	
	// 1. StringTokenizer를 통해 입력받은 레코드 구분
	// 2. ID, NAME 맵 생성 후 값 세팅
	// 3. record 배열 순회하며 result배열에 입/퇴장 여부에 따른 메시지 추가

	public static void main(String[] args) {
		solution(new String[] {"Enter uid1254 Muzi", "Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
	}
	
    public static String[] solution(String[] record) {
    	StringTokenizer st;
    	HashMap<String, String> userInfo = new HashMap<>();
    	int messageCnt = record.length;
    	for (String value : record) {
			st = new StringTokenizer(value, " ");
			String action = st.nextToken();
			String id = st.nextToken();
			String name = st.hasMoreTokens() ? st.nextToken() : "";
			if("Enter".equals(action)) {
				userInfo.put(id, name);
			} else if("Change".equals(action)) {
				messageCnt--;
				userInfo.put(id, name);
			}
			st = null;
		}
    	
    	String[] answer = new String[messageCnt];
    	for (int i = 0; i < record.length; i++) {
    		st = new StringTokenizer(record[i], " ");
    		String action = st.nextToken();
    		if(!"Change".equals(action)) {
    			String id = st.nextToken();
    			String message = "";
    			if("Enter".equals(action)) {
    				message = userInfo.get(id) + "님이 들어왔습니다.";
    			} else if("Leave".equals(action)){
    				message = userInfo.get(id) + "님이 나갔습니다.";
    			}
    			answer[i] = message;
    			System.out.println(message);
    		}
    		st = null;
		}
    	
        return answer;
    }
}
