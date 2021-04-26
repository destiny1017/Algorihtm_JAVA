import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int a[]	= {1,2};
		int b[] = new int[3];
		System.out.println(Arrays.toString(b));
		b = a.clone();
		System.out.println(Arrays.toString(b));
	}
}
