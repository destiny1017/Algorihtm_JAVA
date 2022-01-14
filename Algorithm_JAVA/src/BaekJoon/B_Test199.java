package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_Test199 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		ArrayList<Player> playerList = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			Player p = new Player();
			p.country = sc.nextInt();
			p.number = sc.nextInt();
			p.score = sc.nextInt();
			playerList.add(p);
		}
		Collections.sort(playerList);
		
		for (Player p : playerList) {
			System.out.println(p.toString());
		}
	}

}

class Player implements Comparable {
	int country;
	int number;
	String score;
	
	@Override
	public int compareTo(Object p) {
		return this.score.compareTo(p.score);
	}
	
	@Override
	public String toString() {
		return country + "\t" + number + "\t" + score;
	}
}
