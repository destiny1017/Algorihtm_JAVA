package Programmers;
import java.util.Calendar;
import java.util.Date;

public class Test2 {

//	���� ����
//	2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT
//
//	�Դϴ�. ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� "TUE"�� ��ȯ�ϼ���.
//
//	���� ����
//	2016���� �����Դϴ�.
//	2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
	
	public static String solution(int a, int b) {
		Calendar cal = Calendar.getInstance();		
		Date d = new Date();
		
		d.setYear(116);
		d.setMonth(a - 1);
		d.setDate(b);	
		cal.setTime(d);
		
		int week = cal.get(cal.DAY_OF_WEEK);

		String strWeek = null;

		switch(week) {
		case Calendar.MONDAY:
			strWeek = "MON";
			break;
		case Calendar.TUESDAY:
			strWeek = "TUE";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "WED";
			break;
		case Calendar.THURSDAY:
			strWeek = "THU";
			break;
		case Calendar.FRIDAY:
			strWeek = "FRI";
			break;
		case Calendar.SATURDAY:
			strWeek = "SAT";
			break;
		default:
			strWeek = "SUN";
		}

		return strWeek;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(5, 24));
	}

}
