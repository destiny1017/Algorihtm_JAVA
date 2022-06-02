package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Test239 {
	
	// 동서남북 좌표이동용 배열
	static int dx[] = {1, -1, 0, 0, 1, -1, -1, 1};
	static int dy[] = {0, 0, 1, -1, 1, -1, 1, -1};
	
	static int arr[][];
	static boolean visit[][];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			int cnt = 0;
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			if(w == 0 && h == 0) break;
			
			arr = new int[h+2][w+2];
			visit = new boolean[h+2][w+2];
			
			for (int i = 1; i <= h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= w; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if(arr[i][j] == 1 && visit[i][j] == false) {
						dfs(j, i);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
		
	}
	
	public static void dfs(int w, int h) {
		visit[h][w] = true;
		
		for (int i = 0; i < 8; i++) {
			int x = w + dx[i];
			int y = h + dy[i];
			if(arr[y][x] == 1 && visit[y][x] == false) {
				dfs(x, y);
			}
		}
	}

}
