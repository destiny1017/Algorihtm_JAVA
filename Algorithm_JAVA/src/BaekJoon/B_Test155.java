package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Test155 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st1.nextToken());
		int len = Integer.parseInt(br.readLine());
		for (int i = 0; i < len; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int st = Integer.parseInt(st2.nextToken())-1;
			int ed = Integer.parseInt(st2.nextToken());
			int k = Integer.parseInt(st2.nextToken());
			int num = 0;
			for (int j = st; j < ed; j++) {
				if(arr[j] > k) num++;
			}
			System.out.println(num);
		}
	}

}
