
public class Test3 {

//	���� ����
//	�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
//
//	���ѻ���
//	s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
	
	public static String solution(String s) {
	      
      	int x = s.length()/2+1;
		if(s.length() % 2 != 0) {
			return s.substring(x-1, x);
		} else {
			return s.substring(x-2,x);
		}
	}

	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}
}
