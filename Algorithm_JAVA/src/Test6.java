import java.util.Arrays;

public class Test6 {
	
    public static int solution(int n) {
        int answer = 0;
        int num[] = new int[24];
        int idx = 1;
        int cnt = 3;
        int flag = 1;
        
        for (int i = 0; i < n; i++) {
//			System.out.println(i + " : " + i%3);
//        	int val = i % 3;        	
//        	if(val < 3)	{
//        		num[0] = val;
//        	} else {
        	num[0]++;
    		for (int j = 0; j < idx; j++) {
				if(num[j] >= 3) {
					num[j] = 0;
					num[j+1]++;
//					cnt++;
				}
				if(i == flag) {
					idx++;
					flag *= 3;
				}
			}
    		System.out.println(i + ":" + Arrays.toString(num));
//        	}
		}
        
        return answer;
    }

	public static void main(String[] args) {
//		System.out.println(solution(15));
		solution(125);
	}

}
