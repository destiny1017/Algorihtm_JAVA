package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class B_Test65 {
	
	static ArrayList<Integer> queue = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			String cmd = sc.next();
			int value = 0;
			switch(cmd) {
			case "push":
				value = push(sc.nextInt());
				break;
			case "pop":
				value = pop();
				break;
			case "size":
				value = size();
				break;
			case "empty":
				value = empty();
				break;
			case "front":
				value = front();
				break;
			case "back":
				value = back();
				break;
			}
			System.out.println(value);
		}
	}
	
	static int push(int n) {
		queue.add(n);
		return n;
	}
	
	static int pop() {
		if(queue.size() > 0) {
			return queue.remove(0);
		}
		return -1;
	}
	
	static int size() {
		return queue.size();
	}
	
	static int empty() {
		return queue.size() == 0 ? 1 : 0;
	}
	
	static int front() {
		return queue.size() > 0 ? queue.get(0) : -1;
	}
	
	static int back() {
		return queue.size() > 0 ? queue.get(queue.size()-1) : -1;
	}

}
