package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_Test205 {
	
	static int n;
	static int m;
	static int arr[][];
	static int visit[][];
	static Queue<Integer> qy = new LinkedList<Integer>();
	static Queue<Integer> qx = new LinkedList<Integer>();
	static Queue<Integer> qc = new LinkedList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		visit = new int[n][m];
		for (int i = 0; i < n; i++) {
			char str[] = sc.next().toCharArray();
			for (int j = 0; j < m; j++) {
				arr[i][j] = str[j];
			}
		}
		qy.offer(0);
		qx.offer(0);
		qc.offer(0);
		
		while(!qy.isEmpty()) {
			int cy = qy.poll();
			int cx = qx.poll();
			int cc = qc.poll();
			
			if(visit[cy][cx] == 1) continue;
			visit[cy][cx] = 1;
			System.out.println(cy + " " + cx + " " +cc);
			
			if(cy == n && cx == m) {
				System.out.println(cc);
				break;
			}
			
			// 상
			if(check(cy-1,cx)) {
				qy.offer(cy-1);
				qx.offer(cx);
				qc.offer(cc+1);
				System.out.println("top");
			}
			// 하
			if(check(cy+1,cx)) {
				qy.offer(cy+1);
				qx.offer(cx);
				qc.offer(cc+1);
				System.out.println("down");
			}
			// 좌
			if(check(cy,cx-1)) {
				qy.offer(cy);
				qx.offer(cx-1);
				qc.offer(cc+1);
				System.out.println("left");
			}
			// 우
			if(check(cy,cx+1)) {
				qy.offer(cy);
				qx.offer(cx+1);
				qc.offer(cc+1);
				System.out.println("right");
			}
			
			
		}
		
	}
	
	static boolean check(int y, int x) {
		if(y < 0 || x < 0 || y > n-1 || x > m-1)
			return false;
		else if(arr[y][x] == 0)
			return false;
		else
			return true;
	}

}
